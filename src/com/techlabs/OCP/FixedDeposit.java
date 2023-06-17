package com.techlabs.OCP;

public class FixedDeposit {
	int accountNumber, duration;
	String name;
	double principle;
	IFestivalInterest festivalInterest;
	
	public FixedDeposit(int accountNumber, int duration, String name, double principle, IFestivalInterest festivalInterest) {
		super();
		this.accountNumber = accountNumber;
		this.duration = duration;
		this.name = name;
		this.principle = principle;
		this.festivalInterest = festivalInterest;
	}

	public FixedDeposit() {
		super();
	}
	
	public IFestivalInterest getFestival() {
		return festivalInterest;
	}
	public void setFestival(IFestivalInterest festivalInterest) {
		this.festivalInterest = festivalInterest;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	
	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", duration=" + duration + ", name=" + name
				+ ", principle=" + principle + ", festivalInterest=" + festivalInterest.getInterestRate() + "]";
	}

	public double calculateSimpleInterest() {
		return (principle*duration*( festivalInterest.getInterestRate() ))/100;
	}
}
