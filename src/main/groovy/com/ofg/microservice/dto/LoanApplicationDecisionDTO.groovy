package com.ofg.microservice.dto

import groovy.transform.Canonical;

@Canonical
class LoanApplicationDecisionDTO {
    
     String loanId
     String fraudStatus
     String decision
}
