package com.techlabs.behaviour.stateDesign;

public interface IPackageState {
	void previous(Package pack);
	void next(Package pack);
	void status();
}
