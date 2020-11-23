package com.employee.demo.model;

import java.sql.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Employee
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-11T14:18:13.684Z")




public class Employee   {
  @JsonProperty("empId")
  private Long empId = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("hireDate")
  private Date hireDate = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phoneNo")
  private String phoneNo = null;

  @JsonProperty("skills")
  private Object skills = null;

  public Employee empId(Long empId) {
    this.empId = empId;
    return this;
  }

  
  public Employee(Long empId, String firstName, String lastName, Date hireDate, String city, String email,
		String phoneNo) {
	super();
	this.empId = empId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.hireDate = hireDate;
	this.city = city;
	this.email = email;
	this.phoneNo = phoneNo;
}


/**
   * Get empId
   * @return empId
  **/
  @ApiModelProperty(value = "")


  public Long getEmpId() {
    return empId;
  }

  public void setEmpId(Long empId) {
    this.empId = empId;
  }

  public Employee firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * first Name of employee
   * @return firstName
  **/
  @ApiModelProperty(value = "first Name of employee")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Employee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * last Name of employee
   * @return lastName
  **/
  @ApiModelProperty(value = "last Name of employee")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employee hireDate(Date hireDate) {
    this.hireDate = hireDate;
    return this;
  }

  /**
   * Get hireDate
   * @return hireDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Date getHireDate() {
    return hireDate;
  }

  public void setHireDate(Date hireDate) {
    this.hireDate = hireDate;
  }

  public Employee city(String city) {
    this.city = city;
    return this;
  }

  /**
   * location details
   * @return city
  **/
  @ApiModelProperty(value = "location details")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Employee email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email of employee
   * @return email
  **/
  @ApiModelProperty(value = "email of employee")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Employee phoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
    return this;
  }

  /**
   * contact details
   * @return phoneNo
  **/
  @ApiModelProperty(value = "contact details")


  public String getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }

  public Employee skills(Object skills) {
    this.skills = skills;
    return this;
  }

  /**
   * Skill object
   * @return skills
  **/
  @ApiModelProperty(value = "Skill object")


  public Object getSkills() {
    return skills;
  }

  public void setSkills(Object skills) {
    this.skills = skills;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.empId, employee.empId) &&
        Objects.equals(this.firstName, employee.firstName) &&
        Objects.equals(this.lastName, employee.lastName) &&
        Objects.equals(this.hireDate, employee.hireDate) &&
        Objects.equals(this.city, employee.city) &&
        Objects.equals(this.email, employee.email) &&
        Objects.equals(this.phoneNo, employee.phoneNo) &&
        Objects.equals(this.skills, employee.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empId, firstName, lastName, hireDate, city, email, phoneNo, skills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    empId: ").append(toIndentedString(empId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    hireDate: ").append(toIndentedString(hireDate)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNo: ").append(toIndentedString(phoneNo)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

