package day07_09july2024;

public class Constructor_Overloading {
	
	Constructor_Overloading(){
		System.out.println("This is the example of calling a non parameterized constructor");
	}
	
	Constructor_Overloading(int marks){
		System.out.println("Total Marks are " + marks);
	}
	
	public static void main(String [] args) {
		
		Constructor_Overloading cc = new Constructor_Overloading();
		new Constructor_Overloading();
		new Constructor_Overloading(350);
		Constructor_Overloading dd = new Constructor_Overloading(480);
		
	}

}
