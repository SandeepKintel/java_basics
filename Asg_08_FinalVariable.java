package day07_09july2024;

public class Asg_08_FinalVariable 

{
	static final int century = 100; //Using Final Variable
	final int fifty = 50;
	
	static void Virat() {
		
		Asg_08_FinalVariable fv = new Asg_08_FinalVariable();
		System.out.println("Kohli scored a " + century);
		System.out.println("Kohli scored a " + fv.fifty);
		
	}
	
	static void Rohit() {
		
		Asg_08_FinalVariable fv = new Asg_08_FinalVariable();
		System.out.println("Rohit scored a " + century);
		System.out.println("Rohit scored a " + fv.fifty);
	}
	
	public static void main(String[] args) {
		Virat();
		Rohit();
	}
}
