package com.ofg.microservice.endpoint

import com.codahale.metrics.MetricRegistry
import com.ofg.microservice.domain.Client
import com.ofg.microservice.dto.ClientDTO
import com.ofg.microservice.repositories.ClientRepository
import groovy.util.logging.Log
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@Log
@RestController
@RequestMapping("/api")
class ClientController {

    private ClientRepository clientRepository
    private MetricRegistry metricRegistry

    @Autowired
    ClientController(ClientRepository clientRepository, MetricRegistry metricRegistry) {
        this.clientRepository = clientRepository
        this.metricRegistry = metricRegistry
    }

    @RequestMapping(method = RequestMethod.POST, value = "/client", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Transactional
    public void post(@RequestBody ClientDTO clientDTO) {
        log.info("create a client: $clientDTO");
        Client client = new Client(clientDTO.firstName, clientDTO.lastName, clientDTO.age, clientDTO.loanId)
        clientRepository.save(client)
        metricRegistry.meter("apps.prod.lv.reportingService.clients")
    }
}
