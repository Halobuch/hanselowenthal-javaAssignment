package JavaAssignment_PartC;

import java.util.Scanner;

public class Main_Program{//main class is declared

	public static void main (String[] args) throws InterruptedException {//main method is declared with an exception

		System.out.println("Enter range of Numbers: ");//print statement
		Scanner input = new Scanner(System.in);//object of scanner class declared to take input
		
		System.out.println("Enter start: ");//print statement
		int start = input.nextInt();//a variable of integer type is declared and takes an integer as input
		
		System.out.println("Enter end: ");//print statement
		int end = input.nextInt();//a variable of integer type is declared and takes an integer as input
		input.close();//scanner object is closed
		
		
		if(start > end){//condition statement
			System.out.println("The end Number can not be greater than the start Number");//print statement
		}
		else if(start <= end){//condition statement
			Number_Program evenThread = new Number_Program("EVEN", start, end);//new object of Number_Program class with 3 parameters
			evenThread.start();//Even Thread starts
			Number_Program oddThread  = new Number_Program("ODD", start, end);//new object of Number_Program class with 3 parameters
			oddThread.start();//Odd Thread starts
			evenThread.join();//main thread waits for evenThread to finish and returns to main thread
			oddThread.join();//main thread waits for oddThread to finish and returns to main thread
			evenThread.display();//evenThread is displayed using the display method
			oddThread.display();//oddThread is displayed using the display method
		}		
		
	}
}
