package com.techlabs.lamdas;

public class StaticNonStatic {
	
	static void print() {
		System.out.println("Inside Print");
	}

	public static void main(String[] args) {
		
		NonStaticClass nonStaticClass = new NonStaticClass();
		ITester iTester2 = nonStaticClass::print;
		iTester2.test();
		
		ITester iTester3 = NonStaticClass::new;
		iTester3.test();
		
		ITester iTester = StaticNonStatic::print;
		iTester.test();

	}

}
