package com.techlabs.structural.proxy;

public class TestClient {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("google.org");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
	}

}
