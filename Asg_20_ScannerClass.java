package day07_09july2024;
import java.util.Scanner;

public class Asg_20_ScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int h = sc.nextInt();
		
		int area = b*h;
		System.out.println("Area of Rectangle "+ area);
	}

}
