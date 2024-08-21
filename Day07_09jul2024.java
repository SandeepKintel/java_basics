package day07_09july2024;

public class Day07_09jul2024 {
	
	
	static void add() {
		System.out.println("Test first static method");
	}
	
	static void add(int i) {
		System.out.println("Method Overloading with parameter in the form of integer");
	}
	
	static void add(String a) {
		System.out.println("Method overloading with parameter string type ");
	}
	
	static void add(String b, char c, double g) {
		System.out.println("Method overloading with parameter String Type, Character Type and Double Type");
	}
	
	public static void main(String[] args) {
		
		add();
		add(100);
		add("Sandy");
		add("Sandy", 'A', 3.143);	

	}

}
