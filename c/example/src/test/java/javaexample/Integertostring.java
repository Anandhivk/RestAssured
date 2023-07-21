package javaexample;

import java.util.Scanner;

public class Integertostring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number");
		int num = sc.nextInt();
		System.out.print("the number is :"+num);
		String s = Integer.toString(num);
		System.out.print(s);
		String a = String.valueOf(num);
		System.out.print(a);
		//
	}}

