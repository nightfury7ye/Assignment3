package com.techlabs.creational.singleton;

public class Login {
	private static Login login;
	private Login() {
		// TODO Auto-generated constructor stub
	}
	public static Login getLogin() {
		if(login == null)
			login = new Login();
		return login;
	}
}
