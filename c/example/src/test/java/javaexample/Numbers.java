package javaexample;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] agrs)
	{
		//java program to display numbers 1-1000
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int inputnumbers = myObj.nextInt(); 
		System.out.println("Enter the stop numbers:");
		int stopnumbers = myObj.nextInt();
		for(int i=inputnumbers;i<=stopnumbers;i++) {
			if(inputnumbers<=stopnumbers) {
				System.out.println(inputnumbers);
				inputnumbers++;
			}
		}
		//System.out.println("Numbers:"+inputnumbers);
	}
}
