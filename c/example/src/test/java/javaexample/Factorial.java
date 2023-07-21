package javaexample;
import java.util.Scanner;

public class Factorial {
	
	//public factorial(int input) {
		
	
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter the number");
		int input =myObj.nextInt();
		System.out.println("The factorial of the number"+input+"is:"+factorial(input));
	}
	private static int factorial(int input) {
		// TODO Auto-generated method stub
		if(input==0) 
			return 1;
		
			return input*(factorial(input-1));
		//return input;
}}
