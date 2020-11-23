package com.employee.demo.empservices;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.employee.demo.emprepository.EmpRepositoryInterface;
import com.employee.demo.model.Employee;
import com.employee.demo.exception.EmployeeSkillInsertionException;
//import com.employee.demo.model.Employee;

@Service
public class EmpService implements EmpServiceInterface {

	@Autowired
	private EmpRepositoryInterface empRepo;
		
	@Override
	public List<Employee> getAllEmployees() {
		
		return empRepo.getAllEmployees();
	}
	
	@Override
	public Employee getEmployeeById(long empId) {
		
		return empRepo.getEmployeeById(empId);
	}
	
	/* INSERT BOTH SKILL AND EMPLOYEE */

//	@Override
//	@Transactional(isolation=Isolation.SERIALIZABLE, 
//	               propagation= Propagation.REQUIRES_NEW,
//	               rollbackFor= EmployeeSkillInsertionException.class)
//	public Employee addEmployee(Employee employee) {
//		
//		try {
//		return empRepo.addEmployee(employee);
//		}catch(Exception e) {
//			throw new EmployeeSkillInsertionException(" Internal Server Error");
//		}
//		
//	}

	@Override
	public Employee updateEmployeeDetails(Employee employee) {
		
		return empRepo.updateEmployeeDetails(employee);
	}

	@Override
	@Transactional(isolation=Isolation.SERIALIZABLE, 
    propagation= Propagation.REQUIRES_NEW)
	public boolean deleteEmployeeDetails(long empId) {
		return empRepo.deleteEmployeeDetails(empId);
		
	}

	@Override
	public void createEmployee(Employee employee) {
		empRepo.createEmployee(employee);
		
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		return empRepo.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmp(long empId) {
		return empRepo.deleteEmp(empId);
		
	}
}
