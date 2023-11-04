package com.example.tuan5.backend.repositories;

import com.example.tuan5.backend.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}