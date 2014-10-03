package com.ofg.microservice.endpoint

import groovy.util.logging.Log
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Madalina.Bidilita on 03/10/2014.
 */
@Log
@RestController
class ClientController {

    @RequestMapping(method = RequestMethod.POST, value = "/api/client", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void post(ClientDTO client) {
        log.info("ClientController#post");
    }
}
