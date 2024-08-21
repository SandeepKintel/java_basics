package day07_09july2024;

public class Asg_05_ContructOverloading //Constructor Overloading
{
	
	Asg_05_ContructOverloading(){
		
		System.out.println("Car is running");
	}
	
	Asg_05_ContructOverloading(int speed){
		
		System.out.println("Car is running with " + speed + " km per hour");
	}
	
	Asg_05_ContructOverloading(String Carname){
		
		System.out.println(Carname + " is running");
	}
	
	public static void main(String[] args) {
		
		new Asg_05_ContructOverloading();
		new Asg_05_ContructOverloading(120);
		new Asg_05_ContructOverloading("Defender");
	}

}
