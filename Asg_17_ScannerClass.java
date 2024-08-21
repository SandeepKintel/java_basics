package day07_09july2024;
import java.util.Scanner;
public class Asg_17_ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle is "+ area);
	}

}
