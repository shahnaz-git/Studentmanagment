package com.studentmanagement.springrest.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StudentDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-29T00:14:21.543256300+05:30[Asia/Calcutta]")

public class StudentDetails   {
  @JsonProperty("student_id")
  private Integer studentId;

  @JsonProperty("student_name")
  private String studentName;

  @JsonProperty("student_email")
  private String studentEmail;

  @JsonProperty("student_phone")
  private Integer studentPhone;

  @JsonProperty("student_add")
  private String studentAdd;

  @JsonProperty("status")
  private Integer status;

  public StudentDetails studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

  /**
   * Get studentId
   * @return studentId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public StudentDetails studentName(String studentName) {
    this.studentName = studentName;
    return this;
  }

  /**
   * Get studentName
   * @return studentName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public StudentDetails studentEmail(String studentEmail) {
    this.studentEmail = studentEmail;
    return this;
  }

  /**
   * Get studentEmail
   * @return studentEmail
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getStudentEmail() {
    return studentEmail;
  }

  public void setStudentEmail(String studentEmail) {
    this.studentEmail = studentEmail;
  }

  public StudentDetails studentPhone(Integer studentPhone) {
    this.studentPhone = studentPhone;
    return this;
  }

  /**
   * Get studentPhone
   * @return studentPhone
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public Integer getStudentPhone() {
    return studentPhone;
  }

  public void setStudentPhone(Integer studentPhone) {
    this.studentPhone = studentPhone;
  }

  public StudentDetails studentAdd(String studentAdd) {
    this.studentAdd = studentAdd;
    return this;
  }

  /**
   * Get studentAdd
   * @return studentAdd
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getStudentAdd() {
    return studentAdd;
  }

  public void setStudentAdd(String studentAdd) {
    this.studentAdd = studentAdd;
  }

  public StudentDetails status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentDetails studentDetails = (StudentDetails) o;
    return Objects.equals(this.studentId, studentDetails.studentId) &&
        Objects.equals(this.studentName, studentDetails.studentName) &&
        Objects.equals(this.studentEmail, studentDetails.studentEmail) &&
        Objects.equals(this.studentPhone, studentDetails.studentPhone) &&
        Objects.equals(this.studentAdd, studentDetails.studentAdd) &&
        Objects.equals(this.status, studentDetails.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentId, studentName, studentEmail, studentPhone, studentAdd, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDetails {\n");
    
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    studentName: ").append(toIndentedString(studentName)).append("\n");
    sb.append("    studentEmail: ").append(toIndentedString(studentEmail)).append("\n");
    sb.append("    studentPhone: ").append(toIndentedString(studentPhone)).append("\n");
    sb.append("    studentAdd: ").append(toIndentedString(studentAdd)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

