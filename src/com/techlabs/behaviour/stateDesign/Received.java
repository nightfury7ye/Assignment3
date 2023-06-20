package com.techlabs.behaviour.stateDesign;

public class Received implements IPackageState{

	@Override
	public void previous(Package pack) {
		pack.setState(new Delivered());
	}

	@Override
	public void next(Package pack) {
		System.out.println("Package is already Received");		
	}

	@Override
	public void status() {
		System.out.println("Package is Received");		
	}

}
