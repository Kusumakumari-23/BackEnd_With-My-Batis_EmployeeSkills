package com.employee.demo.empservices;

import java.util.List;

import com.employee.demo.model.Skill;

public interface SkillServiceInterface {

	List<Skill> getAllSkills();
	Skill findSkillById(long skillId);
	Skill getSkillByempId(long empId);
    boolean deleteSkillDetails(long skillId); // optional
    void addSkillDetails(Skill skill); 
	
    boolean updateSkill(Skill skill);
}
