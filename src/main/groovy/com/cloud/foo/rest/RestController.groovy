package com.cloud.foo.rest

import groovy.util.logging.Slf4j
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * Created by marcelo.fontes on 08/11/16.
 */
@Slf4j
@org.springframework.web.bind.annotation.RestController
class RestController {
    @RequestMapping(value = '/subscribe', method = RequestMethod.POST)
    def home(@RequestBody final Map body) {
        log.info("Foo Service logging. body[${body}]");

        body << ["controller": "com.cloud.foo.rest.RestController"]

        body.each { key, value -> print "Key: ${key} Value: ${value}" }
    }
}