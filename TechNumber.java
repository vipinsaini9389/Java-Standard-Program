//Tech Number in Java

import java.util.Scanner;
public class TechNumber{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num,finalnum=0;
		num=sc.nextInt();
		String str = Integer.toString(num);
		int len=str.length();
		if(len%2==0){
			int div =(int) Math.pow(10,len/2);
			finalnum=num/div+num%div;
			
		}
		if(finalnum*finalnum==num){
			System.out.println("Tech Number");
		}
		else{
			System.out.println("Not Tech Number");
		}
	}
}