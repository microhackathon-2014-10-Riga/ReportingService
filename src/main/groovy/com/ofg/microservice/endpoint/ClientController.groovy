package com.ofg.microservice.endpoint

import com.ofg.microservice.domain.Client
import com.ofg.microservice.dto.ClientDTO
import com.ofg.microservice.repositories.ClientRepository
import groovy.util.logging.Log
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@Log
@RestController
@RequestMapping("/api")
class ClientController {

    private ClientRepository clientRepository

    @Autowired
    ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository
    }

    @RequestMapping(method = RequestMethod.POST, value = "/client", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Transactional
    public void post(ClientDTO clientDTO) {
        log.info("ClientController#post");
        Client client = new Client(clientDTO.firstName, clientDTO.lastName, clientDTO.age, clientDTO.loanId)
        clientRepository.save(client)
    }

    @RequestMapping(method = RequestMethod.GET, value = "/clients", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClientDTO> list() {
        return clientRepository.findAll().collect { toClientDto(it) }
    }

    private ClientDTO toClientDto(Client client) {
        ClientDTO clientDTO = new ClientDTO(client.firstName, client.lastName, client.age, client.loanId)
        return clientDTO
    }
}
