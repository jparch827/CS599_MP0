package edu.monmouth.cs599.s1348783;

public class GreetingTester {
	
	
	public static void main(String[] args) {
		//
		
		String msg1 = "First Greeting Tester Message.";
		String msg2 = "Second Greeting Tester Message.";
		String msg3 = "Third, and final Greeting Tester Message.";
		
		Greeting Greet1 = new Greeting(msg1);
		Greet1.print();
		
		Greeting Greet2 = new Greeting(msg2);
		Greet2.print();
		
		Greeting Greet3 = new Greeting(msg3);
		Greet3.print();
	}
	
}
