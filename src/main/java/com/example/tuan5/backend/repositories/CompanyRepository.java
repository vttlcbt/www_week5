package com.example.tuan5.backend.repositories;

import com.example.tuan5.backend.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}