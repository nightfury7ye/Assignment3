package com.techlabs.behaviour.strategy.rolesEg;

public class TestRoles {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Praveen", new Consultant());
		System.out.println(employee1.getDescription());
		System.out.println(employee1.getResponsibility()+"\n");
		employee1.promote(new SeniorConsultant());
		System.out.println(employee1.getDescription());
		System.out.println(employee1.getResponsibility()+"\n");
		employee1.promote(new TechLead());
		System.out.println(employee1.getDescription());
		System.out.println(employee1.getResponsibility());
	}

}
