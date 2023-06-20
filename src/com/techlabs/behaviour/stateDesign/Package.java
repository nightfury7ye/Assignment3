package com.techlabs.behaviour.stateDesign;

public class Package {
	IPackageState state = new Ordered();

	public IPackageState getState() {
		return state;
	}

	public void setState(IPackageState state) {
		this.state = state;
	}
	public void prevState() {
		state.previous(this);
	}
	public void nextState() {
		state.next(this);
	}
	public void printState() {
		state.status();
	}
}
