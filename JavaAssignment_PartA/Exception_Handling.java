package JavaAssignment_PartA;
import java.util.Scanner;

/**Author: Hanse B. Lowenthal
 * Java Assignment Part A
 * This Program will take an inputs from user
 * for array size, array elements, and search
 * if an index is within the array, if not
 * ArrayIndexOutOfBoundsException will be 
 * caught and printed out to the screen.
*/

public class Exception_Handling {
	

	private static int[] numbers;//A private static array of type Integer is declared
	private static Scanner input;//A private static object of class Scanner is declared

	public static void main(String[] args) {

		int size;//A variable of type Integer is declared for the Array size

		input = new Scanner(System.in);//The input object of Class Scanner is initiated 
		System.out.println("Enter the number of Elements in the Array.");//Print out Statement
		size = input.nextInt();//variable size is given an input of type Integer

		numbers = new int[size];//array numbers is initialized to a size

		System.out.println("Enter the elements in the Array.");//Print out Statement
		for (int i = 0; i < size; i++) {//for loop to go through array size 
			numbers[i] = input.nextInt();//numbers are inputed into the numbers array
		}

		System.out.println("Enter the index of the array element you want to access");//Print out Statement
		int index = input.nextInt();//a variable called index of type Integer is declared and initialized to take input

		try {//try block starts here
			for (int h = 0; h < size; h++)//loop through size of numbers array
				if (numbers[h] == numbers[index]) {//if index of element searched equals the index in the numbers array
					System.out.println("The array element at index " + index
							+ " = " + numbers[h]);//Then print out the index and  the element
					System.out.println("The array element successfully accessed");
				}
		} catch (Exception e) {//catch exception starts here 
			System.out.println("IndexOutOfRangeException");//print out "IndexOutOfRangeException" if test fails
		}

	}

}
