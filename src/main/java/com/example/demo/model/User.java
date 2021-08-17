package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uid;
	
	@Column(name = "username", unique = true)
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "ad")
	private String ad;
	
	@Column(name = "soyad")
	private String soyad;

	
	
	public User() {
		
	}

	public User(String username, String password, String ad, String soyad) {
		
		super();
		this.username=username;
		this.password=password;
		this.ad=ad;
		this.soyad=soyad;
		
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid=uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad=ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad=soyad;
	}
}


