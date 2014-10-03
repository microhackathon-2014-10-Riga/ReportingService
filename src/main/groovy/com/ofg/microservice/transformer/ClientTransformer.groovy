package com.ofg.microservice.transformer

import com.ofg.microservice.domain.Client
import com.ofg.microservice.dto.ClientDTO

class ClientTransformer {
    public static ClientDTO toDto(Client client) {
        return new ClientDTO(client.firstName, client.lastName, client.age,client.loanId);

    }
}
