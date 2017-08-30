package JavaAssignment_PartB;

import java.io.*;
/**Author: Hanse B. Lowenthal
 * Java Assignment Part B
 * This Program will take input 
 * from user to move in either
 * of the four directions and
 * print the coordinates. 
*/

public class OptimusPrimeQuest {//public class is declared

	private static int x = 0;//private static integers x & y are declared and initialized to 0.
	private static int y = 0;
	private static char[] udlr = new char[10];//private static array of characters is declared and initialized to 10.

	public static void main(String[] args) throws IOException {//main method throws IOException

		try {//try  block starts
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));//reader object of BufferedReader is initialized to accept user input
			System.out.println("Enter the direction by use U, D, L, or R");//print out statement to enter direction

			String direction = reader.readLine();//reader object takes input and stores it in string direction

			udlr = direction.toCharArray();//direction string is changed in to characters and stored into udlr character array

			if (direction.length() > 10) {//condition statement: if character entered is more than 10, 
				System.out.println("I Won't be able to make it that far..");//print out statement
			}

			if (direction.length() <= 10 && direction.length() > 0) {//condition statement: if character is less than 10 and greater than 0
				for (char list : udlr) {//array of list is declared and each character from udlr is looped
					switch (list) {//switch characters 
					case 'U'://if Up
						y += 1;//add one
						break;//stop 

					case 'D'://if Down
						y -= 1;//subtract one
						break;//stop

					case 'L'://if Left
						x -= 1;//subtract one
						break;//stop

					case 'R'://if Right
						x += 1;//add one
						break;//stop

					default://default: if all conditions fail
						throw new IOException(//new IO Exception is thrown
								"YOU HAVE ENTERED A WRONG CHARACTER");//if run fails this statement print out.
					}
				}
				System.out.print(x + "," + y);//print out the two coordinates of Optimus Prime
			}
			
			//These if and else if statements could be used instead of the switch case if you want.
			// {
			// if(list == 'U'){
			// y += 1;
			// }
			// else if(list == 'D'){
			// y -= 1;
			// }
			// else if(list == 'L'){
			// x -= 1;
			// }
			// else if(list == 'R'){
			// x += 1;
			// }
			// else{
			// throw new
			// IOException("You entered an unacceptable Input for Direction");
			// }
			// }

		} catch (IOException ioe) {//Catches the main class exception
			System.out.println("YOU HAVE ENTERED A WRONG CHARACTER");
			//ioe.printStackTrace();
		}

		

	}

}
