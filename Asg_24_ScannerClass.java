package day07_09july2024;
import java.util.Scanner;

public class Asg_24_ScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		
		double areaofTrapezium = ((a+b)*h)/2;
		System.out.println("Area of Trapezium "+ areaofTrapezium);
	}

	
	
	

}
