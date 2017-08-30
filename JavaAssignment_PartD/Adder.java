package JavaAssignment_PartD;

import java.util.*;

public class Adder extends Mathematician {

	Adder(int num1, int num2, long timeRequested) {
		this.num1 = num1;
		this.num2 = num2;
		// this.num3 = 0;
		// this.result = 0;
		// this.responseTime = 0;
		this.timeRequested = new Date(timeRequested);

	}

	Adder(int num1, int num2, int num3, long timeRequested) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		// this.result = 0;
		// this.responseTime = 0;
		this.timeRequested = new Date(timeRequested);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void add(int num1, int num2) {
		result = num1 + num2;
		Date CurrentTime = new Date();
		responseTime = CurrentTime.getSeconds() - timeRequested.getSeconds();
		print(result, responseTime);
	}

	@SuppressWarnings("deprecation")
	public void add(int num1, int num2, int num3) {
		result = num1 + num2 + num3;
		Date CurrentTime = new Date();
		responseTime = CurrentTime.getSeconds() - timeRequested.getSeconds();
		print(result, responseTime);
	}

	public void subtract(int num1, int num2) {
		// TODO Auto-generated method stub

	}

	public void multiply(int num1, int num2) {
		// TODO Auto-generated method stub

	}

	public void divide(int num1, int num2) {
		// TODO Auto-generated method stub

	}

}
