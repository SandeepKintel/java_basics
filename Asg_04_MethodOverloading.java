package day07_09july2024;

public class Asg_04_MethodOverloading //Method Overloading
{
	void run() {
		System.out.println("Man is Running");
	}
	
	void run(int steps) {
		System.out.println("Man is Running "+ steps + " steps");
		}
	
	void run (String name) {
		System.out.println(name + " is Running");
	}

	static void run(boolean value) {
		System.out.println("This statement is " + value);
	}
	
	public static void main(String[] args) {
		Asg_04_MethodOverloading sc = new Asg_04_MethodOverloading();
		sc.run();
		sc.run(100);
		sc.run("Rahul");
		run(true);
	}
}
