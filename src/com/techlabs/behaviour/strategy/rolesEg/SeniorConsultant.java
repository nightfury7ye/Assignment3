package com.techlabs.behaviour.strategy.rolesEg;

public class SeniorConsultant implements IRole{

	@Override
	public String description() {
		return "I am an Senior Consultant";
	}

	@Override
	public String responsibility() {
		return "I Review Code";
	}
}
