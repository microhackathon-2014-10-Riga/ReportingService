package com.ofg.microservice.transformer

import com.ofg.microservice.domain.LoanApplication
import com.ofg.microservice.dto.LoanApplicationDTO

class LoanApplicationTransformer {
    
    public static toEntity(LoanApplicationDTO loanApplicationDTO) {
        LoanApplication loanApplication = new LoanApplication();
        loanApplication.setAmount(loanApplicationDTO.getAmount());
        loanApplication.setLoanId(loanApplicationDTO.getLoanId());
        return loanApplication;
    }
}
