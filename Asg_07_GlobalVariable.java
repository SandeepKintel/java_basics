package day07_09july2024;

public class Asg_07_GlobalVariable //Using Global Variable
{
	
	static String name = "Rahul";
	
	
	static void walk() {
		System.out.println(name + " is Walking");
	}
	
	static void eat() {
		System.out.println(name + " is Eating");
	}
	
	static void sleep() {
		System.out.println(name + " is Sleeping");
	}
	
	public static void main(String[] args) {
		
		walk();
		eat();
		sleep();
		}
	}
