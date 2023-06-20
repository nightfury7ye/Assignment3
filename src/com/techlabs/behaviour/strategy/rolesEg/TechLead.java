package com.techlabs.behaviour.strategy.rolesEg;

public class TechLead implements IRole{
	@Override
	public String description() {
		return "I am an TechLead";
	}

	@Override
	public String responsibility() {
		return "I Assign Work";
	}
}
