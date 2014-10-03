package com.ofg.microservice.endpoint
import com.ofg.microservice.dto.LoanApplicationDecisionDTO
import groovy.util.logging.Log
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@Log
@RestController
public class LoanApplicationDecisionController {

    @RequestMapping(method = RequestMethod.POST, value = "/api/reporting")
    public void post(@RequestBody LoanApplicationDecisionDTO loanApplicationDecision) {
        log.info("LoanApplicationDecisionController#post");
    }
}
