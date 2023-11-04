package com.example.tuan5.backend.repositories;

import com.example.tuan5.backend.models.CandidateSkill;
import com.example.tuan5.backend.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, Skill> {
}