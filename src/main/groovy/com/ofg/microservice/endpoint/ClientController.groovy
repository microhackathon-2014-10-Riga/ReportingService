package com.ofg.microservice.endpoint

import com.ofg.microservice.dto.ClientDTO
import groovy.util.logging.Log
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@Log
@RestController
class ClientController {

    @RequestMapping(method = RequestMethod.POST, value = "/api/client", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void post(ClientDTO client) {
        log.info("ClientController#post");
    }
}
