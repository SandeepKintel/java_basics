package day07_09july2024;
import java.util.Scanner;

public class Asg_22_ScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int circumTri = a + b + c;
		System.out.println("Circumference of Triangle "+ circumTri);
		
		
	}

}
