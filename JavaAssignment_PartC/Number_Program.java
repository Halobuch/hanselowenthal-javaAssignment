package JavaAssignment_PartC;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author hanselbuchanan
 *This class extends a thread
 *and uses a method that takes 
 *three parameters of either 
 *even or odd and a start and 
 *end numbers to display even
 *and odd numbers in a list using 
 *threads.
 */
public class Number_Program extends Thread {//create a class that extends thread
	String NumberType;//declare string named NumberType
	int start = 0;//declare integer named start
	int end   = 0;//declare integer named end
	List<Integer> numberList;//declare List of type Integer named numberList
	

	Number_Program(String NumberType, int start, int end) {//declare method with three parameters 
		this.NumberType = NumberType;//initialize NumberType string
		this.start      = start;//initialize the start integer
		this.end        = end;//initialize the end integer
		this.numberList = null;//initialize the numberList arrayList to null
		
	}

	@Override
	public void run() {//declare a void run method
		
		if(this.NumberType == "EVEN"){//condition statement starts here, if string NumberType equals even
			this.numberList = new ArrayList<Integer>();//create a new ArrayList object called numberList
			for(int i = start; i <= end; i++){//loop from start to end
				if(i % 2 == 0){//if number is divisible by 2
					this.numberList.add(i);//add to the numberList
				}
			}
		}
		else if(this.NumberType == "ODD"){//condition statement starts here, if string NumberType equals odd
			this.numberList = new ArrayList<Integer>();//create a new ArrayList object called numberList
			for(int h = start; h <= end; h++){//loop from start to end
				if(h % 2 != 0){//if number is not divisible by 2
					this.numberList.add(h);//add to the numberList
				}
			}
		}

	}

	public void display() {//a void method to display the two lists

		System.out.println(NumberType + " numbers in given range:");//print out of the NumberType with a statement
		for(int j = 0; j < this.numberList.size(); j++){//loop to go through the NumberList
			System.out.print(this.numberList.get(j) + " ");//print out the NumberType in an array and show to console
		}
		System.out.println();//skip a line
	}
}
