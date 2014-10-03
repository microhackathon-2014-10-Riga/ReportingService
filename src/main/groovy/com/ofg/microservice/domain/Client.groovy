package com.ofg.microservice.domain

import groovy.transform.Canonical

import javax.persistence.Entity

@Entity
@Canonical
class Client extends BaseEntity {

    String firstName
    String lastName
    String age
    String loanId
}
