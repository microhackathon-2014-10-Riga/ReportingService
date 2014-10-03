package com.ofg.microservice.gui

import com.ofg.microservice.dto.ClientDTO
import com.ofg.microservice.repositories.ClientRepository
import groovy.util.logging.Log
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@Log
@RestController
public class ClientsController {
    private ClientRepository clientRepository

    @Autowired
    ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/clients", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClientDTO> getClients() {
        log.info("ClientController#getClients");
        return clientRepository.findAll().collect { toClientDto(it) }
    }
}
