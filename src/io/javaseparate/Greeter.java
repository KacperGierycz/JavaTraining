package io.javaseparate;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	//	System.out.println("hello world");
	}
	
	public static void main(String[] args) {
		Greeter greeter=new Greeter();
		HelloWroldGreeting helloWroldGreeting = new HelloWroldGreeting();
		greeter.greet(helloWroldGreeting);

	}

}
