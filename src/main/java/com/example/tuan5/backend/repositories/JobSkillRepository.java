package com.example.tuan5.backend.repositories;

import com.example.tuan5.backend.models.JobSkill;
import com.example.tuan5.backend.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSkillRepository extends JpaRepository<JobSkill, Skill> {
}