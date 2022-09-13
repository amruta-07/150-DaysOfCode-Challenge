package Pepcode;

import java.util.Scanner;

public class DecimalToAnyBase {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int b= sc.nextInt();
		int nb= getValueInBase(n,b);
		System.out.println(nb);
		
		
	}
	public static int getValueInBase(int n, int b) {
		int rv=0;
		int p=1;
		while(n>0) {
			int dig=n%b;
			n= n/b;
			rv +=dig*p;
			p=p*10;
		}
		return rv;
	}

}

// input- 634 8 means [634]10 = [?]8
// output - 1172
