package com.techlabs.behaviour.stateDesign;

public class Ordered implements IPackageState{

	@Override
	public void previous(Package pack) {
		System.out.println("Package is at the Source");
	}

	@Override
	public void next(Package pack) {
		pack.setState(new Delivered());
	}

	@Override
	public void status() {
		System.out.println("Package is Ordered");
	}

	
	
}
