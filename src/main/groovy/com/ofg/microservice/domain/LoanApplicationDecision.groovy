package com.ofg.microservice.domain

import groovy.transform.Canonical

import javax.persistence.Entity

@Entity
@Canonical
class LoanApplicationDecision extends BaseEntity {

    String loanId
    String fraudStatus
    String decision
}
