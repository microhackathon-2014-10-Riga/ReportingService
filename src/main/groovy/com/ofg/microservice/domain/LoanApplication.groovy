package com.ofg.microservice.domain

import groovy.transform.Canonical

import javax.persistence.Entity

@Entity
@Canonical
class LoanApplication extends BaseEntity {

    String loanId;
    String amount;
}
