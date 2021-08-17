package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	
	@Column(name = "first_name")
private String ad;
	
	@Column(name = "last_name")
private String soyad;
	
	@Column(name = "email_id")
private String emailId;
    
	@Column(name = "unvan")
private String unvan;
	
	@Column(name = "tel_no")
private String telNo;
	
	@Column(name = "sicil_no")
private String sicilNo;
	


	

	
public Employee() {
	
}

public Employee(String ad, String soyad, String emailId, String unvan, String telNo, String sicilNo, String userName, String passWord) {
	super();
	this.ad = ad;
	this.soyad = soyad;
	this.emailId = emailId;
	this.unvan = unvan;
	this.telNo = telNo;
	this.sicilNo = sicilNo;
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getAd() {
	return ad;
}
public void setAd(String ad) {
	this.ad = ad;
}
public String getSoyad() {
	return soyad;
}
public void setSoyad(String soyad) {
	this.soyad = soyad;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getunvan() {
	return unvan;
}
public void setunvan(String unvan) {
	this.unvan = unvan;
}
public String getTelNo() {
	return telNo;
}
public void setTelNo(String telNo) {
	this.telNo = telNo;
}
public String getSicilNo() {
	return sicilNo;
}
public void setSicilNo(String sicilNo) {
	this.sicilNo = sicilNo;
}




}
