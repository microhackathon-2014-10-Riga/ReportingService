package com.ofg.microservice.domain

import com.ofg.microservice.repositories.ClientRepository
import groovy.transform.Canonical
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Configurable
import org.springframework.transaction.annotation.Transactional

import javax.persistence.Entity

@Entity
@Canonical
@Configurable
class Client extends BaseEntity {

    String firstName
    String lastName
    String age
    String loanId
}
