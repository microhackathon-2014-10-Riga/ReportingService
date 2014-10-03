package com.ofg.microservice.domain

import javax.persistence.GeneratedValue
import javax.persistence.Id

class BaseEntity {

    @Id
    @GeneratedValue
    Long id
}
