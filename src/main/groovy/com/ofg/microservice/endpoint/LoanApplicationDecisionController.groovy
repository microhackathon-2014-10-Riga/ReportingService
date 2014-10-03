package com.ofg.microservice.endpoint

import groovy.util.logging.Log
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@Log
@RestController
public class LoanApplicationDecisionController {

    @RequestMapping(method = RequestMethod.POST, value = "/api/reporting", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void post(LoanApplicationDecisionDTO loanApplicationDecision) {
        log.info("LoanApplicationDecisionController#post");
    }
}
