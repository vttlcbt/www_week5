package com.example.tuan5.backend.ids;

import com.example.tuan5.backend.models.Job;
import com.example.tuan5.backend.models.Skill;

import java.io.Serializable;

public class JobSkillID implements Serializable {
    private Skill skill;
    private Job job;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        JobSkillID that = (JobSkillID) o;

        if (!skill.equals(that.skill))
            return false;
        return job.equals(that.job);
    }

    @Override
    public int hashCode() {
        int result = skill.hashCode();
        result = 31 * result + job.hashCode();
        return result;
    }
}
