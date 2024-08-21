package day07_09july2024;

public class Asg_06_LocalVariable //Using Local Variable
{ 
	
	static void sum() {
		int a = 20; // Local Variable: Inside a method and will work only within the method
		int b = 10; // Local Variable
		int sum = a+b;
		
		System.out.println(sum);
	}
	
	static void sub() {
		int a = 20;
		int b = 10;
		int sub = a-b;
		
		System.out.println(sub);
	}
	
	public static void main(String[] args) {
		
		sum();
		sub();
	}

}
