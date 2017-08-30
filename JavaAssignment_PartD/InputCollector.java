package JavaAssignment_PartD;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class InputCollector {

	private long timeRequested;
	private int num1, num2, num3;
	private static Scanner input;
	

	public InputCollector() {
		timeRequested = Calendar.getInstance().getTimeInMillis();
	}

	public void InputCollected() throws IOException {
		System.out.println("Enter the number of the desired function:\n"
				+ "1. Add\n" + "2. Subtract\n" + "3. Multiply\n" + "4. Divide");
		input = new Scanner(System.in);

		int choice = input.nextInt();
		if (choice < 5 && choice > 0) {
			System.out.println("Have a third Integer?\n" + "1. Yes\n" + "2. No");
			int yes_or_no = input.nextInt();
			if(yes_or_no == 1){
				System.out.println("Please enter 3 Integers:");
				num1 = input.nextInt();
				num2 = input.nextInt();
				num3 = input.nextInt();
			}
			else if(yes_or_no == 2){
				System.out.println("Please enter 2 Integers:");
				num1 = input.nextInt();
				num2 = input.nextInt();
			}
			
			File outputLog = new File("Mathematician's Log Book");
			FileWriter outputStream = new FileWriter(outputLog, true);
			try{
				switch(choice){
				
				case 1:
					if(yes_or_no == 1){
						Adder addition = new Adder(num1, num2, num3, timeRequested);
						addition.add(num1, num2, num3);
					}
					else if(yes_or_no == 2){
						Adder addition = new Adder(num1, num2, timeRequested);
						addition.add(num1, num2);
					}
					outputStream.write(Calendar.getInstance().getTime().toString());
					break;
					
				case 2:
					if(yes_or_no == 1){
						Subtractor subtraction = new Subtractor(num1, num2, num3, timeRequested);
						subtraction.subtract(num1, num2, num3);
					}
					else if(yes_or_no == 2){
						Subtractor subtraction = new Subtractor(num1, num2, timeRequested);
						subtraction.subtract(num1, num2);
					}
					outputStream.write(Calendar.getInstance().getTime().toString());
					break;
					
				case 3:
					if(yes_or_no == 1){
						Multiplier multiplication = new Multiplier(num1, num2, num3, timeRequested);
						multiplication.multiply(num1, num2, num3);
					}
					else if(yes_or_no == 2){
						Multiplier multiplication = new Multiplier(num1, num2, timeRequested);
						multiplication.multiply(num1, num2);
					}
					outputStream.write(Calendar.getInstance().getTime().toString());
					break;
					
				case 4:
					if(yes_or_no == 1){
						Divider division = new Divider(num1, num2, num3, timeRequested);
						division.divide(num1, num2, num3);
					}
					else if(yes_or_no == 2){
						Divider division = new Divider(num1, num2, timeRequested);
						division.divide(num1, num2);
					}
					outputStream.write(Calendar.getInstance().getTime().toString());
					break;
					
				default:
					break;
				}
			}catch(IOException ex){
				ex.printStackTrace();
			}finally{
				outputStream.close();
			}
			input.close();
			System.gc();

		}
	}

}
