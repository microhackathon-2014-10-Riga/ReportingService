package com.ofg.microservice.endpoint
import com.codahale.metrics.MetricRegistry
import com.ofg.microservice.domain.LoanApplication
import com.ofg.microservice.dto.LoanApplicationDTO
import com.ofg.microservice.repositories.LoanApplicationRepository
import groovy.util.logging.Log
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import static com.ofg.microservice.transformer.LoanApplicationTransformer.toEntity

@Log
@RestController
public class LoanApplicationController {
    
    @Autowired
    private LoanApplicationRepository loanApplicationRepository;

    @Autowired
    private MetricRegistry metricRegistry
    
    @RequestMapping(method = RequestMethod.POST, value = "/api/loan")
    public void post(LoanApplicationDTO loanApplicationDTO) {
        LoanApplication loanApplication = loanApplicationRepository.saveAndFlush(toEntity(loanApplicationDTO));
        log.info("The loan application was saved: {}", loanApplication);
    }
}
