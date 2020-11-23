package com.employee.demo.empcontroller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.demo.empservices.EmpServiceInterface;
import com.employee.demo.empservices.SkillServiceInterface;
import com.employee.demo.exception.ResourceNotFoundException;
import com.employee.demo.model.Employee;
import com.employee.demo.model.Skill;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-11T14:18:13.684Z")

@Controller
public class EmpdataApiController implements EmpdataApi {

    private static final Logger log = LoggerFactory.getLogger(EmpdataApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EmpdataApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
    
    @Autowired
	private EmpServiceInterface empService;
    
    @Autowired
    private SkillServiceInterface skillService;

//    public ResponseEntity<Employee> addEmployee(@ApiParam(value = "employee object that needs to be added to data base" ,required=true )  @Valid @RequestBody Employee employee) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//            	empService.addEmployee(employee);
//                return new ResponseEntity<Employee>(objectMapper.readValue("{  \"skills\" : \"{}\",  \"empId\" : 0,  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"hireDate\" : \"2000-01-23\",  \"city\" : \"city\",  \"email\" : \"email\",  \"phoneNo\" : \"phoneNo\"}", Employee.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<Employee>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
//
//        return new ResponseEntity<Employee>(HttpStatus.NOT_IMPLEMENTED);
//    }

    public ResponseEntity<Void> createEmployee(@ApiParam(value = "employee object that needs to be added to data base" ,required=true )  @Valid @RequestBody Employee employee) {
//        String accept = request.getHeader("Accept");
        empService.createEmployee(employee);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> createSkills(@ApiParam(value = "skill object that needs to be added to data base" ,required=true )  @Valid @RequestBody Skill skill) {
//        String accept = request.getHeader("Accept");
        skillService.addSkillDetails(skill);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteEmp(@ApiParam(value = "employee id to delete",required=true) @PathVariable("empId") Long empId) {
//        String accept = request.getHeader("Accept");
    	Employee newEmp= empService.getEmployeeById(empId);
		
		if(newEmp==null) {
			throw new ResourceNotFoundException("Skill with id "+empId+" is not found");
		}
		
		else {
			
//			LOGGER.trace(" Trying to trace skills to delete details");
			empService.deleteEmp(empId);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}
    }

    public ResponseEntity<Void> deleteEmployeeDetails(@ApiParam(value = "employee id to delete",required=true) @PathVariable("empId") Long empId) {
//        String accept = request.getHeader("Accept");
    	Employee newEmp= empService.getEmployeeById(empId);
		
		if(newEmp==null) {
			throw new ResourceNotFoundException("Skill with id "+empId+" is not found");
		}
		
		else {
			
//			LOGGER.trace(" Trying to trace skills to delete details");
			empService.deleteEmployeeDetails(empId);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}
    }

    public ResponseEntity<Void> deleteSkillDetails(@Min(1L)@ApiParam(value = "skill Id od the skills that needs to be deleted",required=true) @PathVariable("skillId") Long skillId) {
//        String accept = request.getHeader("Accept");
    	Skill newSkill= skillService.findSkillById(skillId);
		
		if(newSkill==null) {
			throw new ResourceNotFoundException("Skill with id "+skillId+" is not found");
		}
		
		else {
			
//			LOGGER.trace(" Trying to trace skills to delete details");
			skillService.deleteSkillDetails(skillId);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}
    }

    public ResponseEntity<List<Employee>> getAllEmployees() {
//        String accept = request.getHeader("Accept");
    	List<Employee> emplist=empService.getAllEmployees();
		
		if(emplist==null) {
			throw new ResourceNotFoundException("No Employee Details found");
		}
		
		return new ResponseEntity<>(emplist,HttpStatus.OK);		
    }

    public ResponseEntity<List<Skill>> getAllSkills() {
//        String accept = request.getHeader("Accept");
    	List<Skill> skillist=skillService.getAllSkills();
		
//		LOGGER.debug(" Trying to Fetch list of Skills");
		
		if(skillist==null) {
			
//			LOGGER.error(" No Skill Found");
			throw new ResourceNotFoundException("No Skill Details found");
		}
//		LOGGER.info("Successfully Retrieved");
		return new ResponseEntity<>(skillist,HttpStatus.OK);
    }

    public ResponseEntity<Employee> getEmployeeById(@ApiParam(value = "Id of employee to return an individual employee",required=true) @PathVariable("empId") Integer empId) {
    	 final String ERR_MSG = "Employee with id "+empId+" not found";
// 		
 		Employee emp=empService.getEmployeeById(empId);
 		
 		if(emp!=null) {
 			
 			return new ResponseEntity<>(emp,HttpStatus.OK);
 		}
 		else 
         {
             throw new ResourceNotFoundException(ERR_MSG);
         }
    }

    public ResponseEntity<Skill> getSkillById(@ApiParam(value = "Id of skills to return an individual skill details",required=true) @PathVariable("skillId") Integer skillId) {
    	Skill skills= skillService.findSkillById(skillId);

		if(skills!=null) {
			
			return new ResponseEntity<>(skills,HttpStatus.OK);
		}
		else 
        {
            throw new ResourceNotFoundException("Skill with id "+skillId+" is not found");
        }
    }

    public ResponseEntity<Skill> getSkillByempId(@ApiParam(value = "get skill details based on employee Id",required=true) @PathVariable("empId") Integer empId) {
    	Skill skills= skillService.getSkillByempId(empId);
	
    	if(skills!=null) {
			
			return new ResponseEntity<>(skills,HttpStatus.OK);
		}
		else 
        {
            throw new ResourceNotFoundException("Skill with id "+empId+" is not found");
        }
    }

    public ResponseEntity<Void> updateEmployee(@ApiParam(value = "update by empId",required=true) @PathVariable("empId") Integer empId,@ApiParam(value = "employee object needs to update in database" ,required=true )  @Valid @RequestBody Employee employee) {
    	Employee newEmp= empService.getEmployeeById(empId);
		
    	if(newEmp==null) {
			throw new ResourceNotFoundException("employee with id "+empId+" is not found");
		}
		else {
			 empService.updateEmployee(employee);
			 return new ResponseEntity<>(HttpStatus.OK);
		} 
    }

    public ResponseEntity<Employee> updateEmployeeDetails(@ApiParam(value = "employee object needs to update in database" ,required=true )  @Valid @RequestBody Employee employee) {
    	if(employee!=null) {
    		
			empService.updateEmployeeDetails(employee);
		}
		
		return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    public ResponseEntity<Void> updateSkill(@ApiParam(value = "update by empId",required=true) @PathVariable("empId") Integer empId,@ApiParam(value = "skill object needs to update in database" ,required=true )  @Valid @RequestBody Skill skill) {
    	Skill newSkill= skillService.getSkillByempId(empId);
		if(newSkill==null) {
			throw new ResourceNotFoundException("employee with id "+empId+" is not found");
		}
		else {
			 skillService.updateSkill(skill);
			 return new ResponseEntity<>(HttpStatus.OK);
		}
    }

}
