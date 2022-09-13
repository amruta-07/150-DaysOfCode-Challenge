package Pepcode;

import java.util.Scanner;

public class CountPrime {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter low number:");
		int low=scn.nextInt();
		System.out.print("enter high number:");
		int high=scn.nextInt();
		
		for(int n=low; n<=high; n++) {
			int count=0;
			//try to divide n and increase the count
			for(int div=2; div*div<=n; div++) {
				if(n%div==0) {
					count++;
					break;
				}
				
			}//try to divide n and increase the count
			if(count==0) {
				System.out.print(n);
			}
		}
	}

}
