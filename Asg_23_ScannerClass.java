package day07_09july2024;
import java.util.Scanner;

public class Asg_23_ScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = 2*(a+b);
		System.out.println("Circumference of Rectangle "+ result);
		
	}

}
