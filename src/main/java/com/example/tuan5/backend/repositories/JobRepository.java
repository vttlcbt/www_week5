package com.example.tuan5.backend.repositories;

import com.example.tuan5.backend.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
