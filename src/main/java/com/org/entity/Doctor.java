package com.org.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
//@Data
@Table(name="jpa_doctor")
public class Doctor {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer docId;
private String docName;
private String docAddrs;
private String specification;
private Double salary;
public Integer getDocId() {
	return docId;
}
public void setDocId(Integer docId) {
	this.docId = docId;
}
public String getDocName() {
	return docName;
}
public void setDocName(String docName) {
	this.docName = docName;
}
public String getDocAddrs() {
	return docAddrs;
}
public void setDocAddrs(String docAddrs) {
	this.docAddrs = docAddrs;
}
public String getSpecification() {
	return specification;
}
public void setSpecification(String specification) {
	this.specification = specification;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}


}
