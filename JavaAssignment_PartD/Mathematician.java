package JavaAssignment_PartD;

import java.util.*;

public abstract class Mathematician {

	Mathematician() {

	}

	protected int num1, num2, num3, result, responseTime;
	protected Date timeRequested;

	public abstract void add(int num1, int num2);

	public abstract void subtract(int num1, int num2);

	public abstract void multiply(int num1, int num2);

	public abstract void divide(int num1, int num2);

	public void print(int result, int sec_taken) {

		System.out.println("The answer to your inquire is " + result);
		System.out.println("Response time: " + sec_taken + " milliseconds");

	}

}
