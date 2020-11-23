package com.employee.demo.emprepository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.employee.demo.model.Skill;

@Mapper
public interface SkillRepositoryInterface {

	public List<Skill> getAllSkills();
	Skill findSkillById(long skillId);
	Skill getSkillByempId(long empId);
    boolean deleteSkillDetails(long skillId); //optional
    void addSkillDetails(Skill skill);
    
    boolean updateSkill(Skill skill);
}
