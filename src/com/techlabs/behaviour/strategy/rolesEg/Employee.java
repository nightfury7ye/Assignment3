package com.techlabs.behaviour.strategy.rolesEg;

public class Employee {
	int id;
	String name;
	IRole role;
	public Employee(int id, String name, IRole role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	public void promote(IRole role) {
		this.role = role;
	}
	public String getDescription() {
		return role.description();
	}
	public String getResponsibility() {
		return role.responsibility();
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
	public IRole getRole() {
		return role;
	}
	public void setRole(IRole role) {
		this.role = role;
	}
	
}
