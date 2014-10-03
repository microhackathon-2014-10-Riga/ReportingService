package com.ofg.microservice.endpoint

import groovy.transform.Canonical;

@Canonical
class LoanApplicationDecisionDTO {
    
     String loanId
     String fraudStatus
     String decision
}
