//Armstrong Number in Java

import java.util.Scanner;
public class Armstrong{
	public static void main(String [] args){
		Scanner sc=new Scanner (System.in);
		int n,i=0,rem,c;
		System.out.print("Enter A Number: ");
		n=sc.nextInt();
		c=n;
		while (n>0){
			rem=n%10;
			i=(rem*rem*rem)+i;
			n=n/10;
		}
		if(c==i){
			System.out.println("Armstrong Number");
		}
		else{
			System.out.println("Not Armstrong Number");
		}
		
	}
}