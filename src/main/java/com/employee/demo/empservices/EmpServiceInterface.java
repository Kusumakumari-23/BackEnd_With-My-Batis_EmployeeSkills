package com.employee.demo.empservices;

import java.util.List;

import com.employee.demo.model.Employee;

//import com.employee.demo.model.Employee;

public interface EmpServiceInterface {

	List<Employee> getAllEmployees();
	//Employee addEmployee(Employee employee);
	Employee updateEmployeeDetails(Employee employee);
    boolean deleteEmployeeDetails(long empId);
    Employee getEmployeeById(long empId);
    public void createEmployee(Employee employee);
    boolean deleteEmp(long empId);
     
    boolean updateEmployee(Employee employee);
}
