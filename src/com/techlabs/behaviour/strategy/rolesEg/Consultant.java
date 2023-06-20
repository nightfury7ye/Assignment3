package com.techlabs.behaviour.strategy.rolesEg;

public class Consultant implements IRole{

	@Override
	public String description() {
		return "I am an consultant";
	}

	@Override
	public String responsibility() {
		return "I Write Code";
	}

}
