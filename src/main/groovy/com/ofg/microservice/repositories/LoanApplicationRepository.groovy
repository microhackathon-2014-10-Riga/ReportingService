package com.ofg.microservice.repositories

import com.ofg.microservice.domain.LoanApplication
import org.springframework.data.jpa.repository.JpaRepository

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

}