package Pepcode;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String [] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number:");
		int n = scn.nextInt();
		
		int a=0;
		int b=1;
		for(int i=0; i<n; i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
	}

}
