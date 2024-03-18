// Palindrome Program in Java

import java.util.Scanner;
public class PalindromeNumber{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int s=0,c,r;
		c=num;
		while(num>0){
			r=num%10;
			s=(s*10)+r;
			num=num/10;
		}
		if (c==s){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not Palindrome Number");
		}
	}
}