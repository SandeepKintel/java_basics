package day07_09july2024;
import java.util.Scanner;

public class Asg_21_ScannerClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double circumf = 2*Math.PI*radius;
		System.out.println("Circumference of Circle "+ circumf);
	}

}
