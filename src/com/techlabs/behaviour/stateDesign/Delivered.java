package com.techlabs.behaviour.stateDesign;

public class Delivered implements IPackageState {

	@Override
	public void previous(Package pack) {
		pack.setState(new Ordered());
	}

	@Override
	public void next(Package pack) {
		pack.setState(new Received());		
	}

	@Override
	public void status() {
		System.out.println("Package is Delivered");
	}

}
