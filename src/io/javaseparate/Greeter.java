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
		
		Greeting greetingFunction=()->System.out.println("HEllo world");
		
		MyMult	doubleNumberFunction= (int a) -> a*2;
		MyAdd addFunction =(int a, int b)-> a+b;
		
	/*	safeDivideFunction=(int a, int b)-> {
		if (b==0) return 0;
		return a/b;
		}
	*/
		MySLength	stringLengthCountFucntion =(String s)-> s.length();

	}
}

	interface MyLambda {
		void foo();
	}
	interface MyAdd {
		int add(int x, int y);
	}
	interface MyMult {
		int add(int x);
	}
	interface MySLength {
		int add(String x);
	}
