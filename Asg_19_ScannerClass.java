package day07_09july2024;
import java.util.Scanner;

public class Asg_19_ScannerClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		
		double area = (b*h)/2;
		System.out.println("Area of Triangle "+ area);
	}
	

}
