package com.ofg.microservice.endpoint

import com.ofg.microservice.dto.LoanApplicationDTO
import groovy.util.logging.Log
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@Log
@RestController
public class LoanApplicationController {
    
    @RequestMapping(method = RequestMethod.POST, value = "/api/loan", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void post(LoanApplicationDTO loanApplication) {
        log.info("LoanApplicationController#post");
    }
}
