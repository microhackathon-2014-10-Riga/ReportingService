package com.ofg.microservice.dto

import groovy.transform.Canonical

@Canonical
class ClientDTO {

    String firstName
    String lastName
    int age
    String loanId
}
