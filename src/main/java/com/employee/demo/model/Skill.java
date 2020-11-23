package com.employee.demo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Skill
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-11T14:18:13.684Z")




public class Skill   {
  @JsonProperty("skillId")
  private Long skillId = null;

  @JsonProperty("skillName")
  private String skillName = null;

  @JsonProperty("details")
  private String details = null;

  @JsonProperty("empId")
  private Long empId = null;

  public Skill skillId(Long skillId) {
    this.skillId = skillId;
    return this;
  }

public Skill(Long skillId, String skillName, String details, Long empId) {
	super();
	this.skillId = skillId;
	this.skillName = skillName;
	this.details = details;
	this.empId = empId;
}



/**
   * Get skillId
   * @return skillId
  **/
  @ApiModelProperty(value = "")


  public Long getSkillId() {
    return skillId;
  }

  public void setSkillId(Long skillId) {
    this.skillId = skillId;
  }

  public Skill skillName(String skillName) {
    this.skillName = skillName;
    return this;
  }

  /**
   * name of the skill
   * @return skillName
  **/
  @ApiModelProperty(value = "name of the skill")


  public String getSkillName() {
    return skillName;
  }

  public void setSkillName(String skillName) {
    this.skillName = skillName;
  }

  public Skill details(String details) {
    this.details = details;
    return this;
  }

  /**
   * details of skill
   * @return details
  **/
  @ApiModelProperty(value = "details of skill")


  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public Skill empId(Long empId) {
    this.empId = empId;
    return this;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Skill skill = (Skill) o;
    return Objects.equals(this.skillId, skill.skillId) &&
        Objects.equals(this.skillName, skill.skillName) &&
        Objects.equals(this.details, skill.details) &&
        Objects.equals(this.empId, skill.empId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillId, skillName, details, empId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Skill {\n");
    
    sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
    sb.append("    skillName: ").append(toIndentedString(skillName)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    empId: ").append(toIndentedString(empId)).append("\n");
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

