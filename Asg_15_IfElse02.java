package day07_09july2024;

public class Asg_15_IfElse02 {
	
	public static void main(String[] args) {
		
		char gender1= 'M';
		int age = 60;
		
		if(gender1=='F') {
			System.out.println("Travelling is Free");
		}else {
			if(gender1=='M' && age<=12 ) {
				System.out.println("Ticket for minor is half");
			}else if(age<=59) {
				System.out.println("Ticket price is full");
			}else {
				System.out.println("Ticket is Free");
			}
		}
		
	}

}
