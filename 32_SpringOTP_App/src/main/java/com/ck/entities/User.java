package com.ck.entities;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.Table;



@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column
	String name;

	@Column
	int pno;

	@Column
	String email;

	@Column
	String password;

	public User() {

		super();

		// TODO Auto-generated constructor stub

	}

	public User(int id, String name, int pno, String email, String password) {

		super();

		this.id = id;

		this.name = name;

		this.pno = pno;

		this.email = email;

		this.password = password;

	}

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public int getPno() {

		return pno;

	}

	public void setPno(int pno) {

		this.pno = pno;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	public String getPassword() {

		return password;

	}

	public void setPassword(String password) {

		this.password = password;

	}

	

	



}