package com.ofg.microservice.repositories

import com.ofg.microservice.domain.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository extends JpaRepository<Client, Long>{
}
