package com.ofg.microservice.domain

import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
class BaseEntity {

    @Id
    @GeneratedValue
    Long id
}
