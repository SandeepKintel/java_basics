package day07_09july2024;
import java.util.Scanner;
public class Asg_16_SacnnerClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a+b;
		int sub = a-b;
		int multiplication = a*b;
		int division = a/b;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multiplication);
		System.out.println(division);
	}

}
