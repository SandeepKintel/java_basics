package day07_09july2024;

public class Method_Overloading_NonStatic_Method {
	
	
	void add() {
		System.out.println("Test first non static method");
	}
	
	void add(int p) {
		System.out.println("Method Overloading of non static method with parameter in the form of integer " + p);
	}
	
	void add(String q) {
		System.out.println("Method overloading of non static method with parameter string type " + q);
	}
	
	void add(boolean b) {
		System.out.println(b);
	}
	
	public static void main(String [] args) {
		
		Method_Overloading_NonStatic_Method ts = new Method_Overloading_NonStatic_Method();
		ts.add();
		ts.add(200);
		ts.add("SADNY");
		ts.add(true);
	}

}
