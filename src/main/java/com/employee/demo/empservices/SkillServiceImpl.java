package com.employee.demo.empservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.emprepository.SkillRepositoryInterface;
import com.employee.demo.model.Skill;

@Service
public class SkillServiceImpl implements SkillServiceInterface {

	@Autowired(required=true)
	private SkillRepositoryInterface skillRepo;
	
	@Override
	public List<Skill> getAllSkills() {
		
		return skillRepo.getAllSkills();
	}
	
	public Skill findSkillById(long skillId) {
		
		return skillRepo.findSkillById(skillId);
	}

	@Override
	public boolean deleteSkillDetails(long skillId) {
		
	  return skillRepo.deleteSkillDetails(skillId);
		
	}

	@Override
	public Skill getSkillByempId(long empId) {
		return skillRepo.getSkillByempId(empId);
	}

	@Override
	public void addSkillDetails(Skill skill) {
		skillRepo.addSkillDetails(skill);
		
	}

	@Override
	public boolean updateSkill(Skill skill) {
		return skillRepo.updateSkill(skill);
	}
}
