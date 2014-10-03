package com.ofg.microservice.transformer

import com.ofg.microservice.domain.LoanApplication
import com.ofg.microservice.domain.LoanApplicationDecision
import com.ofg.microservice.dto.LoanApplicationDecisionDTO

class LoanApplicationDecisionTransformer {

    public static LoanApplicationDecision toEntity(LoanApplicationDecisionDTO loanApplicationDecisionDTO) {
        LoanApplicationDecision loanApplicationDecision = new LoanApplication();
        loanApplicationDecision.setLoanId(loanApplicationDecisionDTO.getLoanId());
        loanApplicationDecision.setFraudStatus(loanApplicationDecisionDTO.getFraudStatus());
        loanApplicationDecision.setDecision(loanApplicationDecisionDTO.getDecision());
        return loanApplicationDecision;
    }
}
