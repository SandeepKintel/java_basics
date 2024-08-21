package day07_09july2024;
import java.util.Scanner;

public class Asg_18_ScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
	}
	

}
