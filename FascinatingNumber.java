//Fascinating Number in Java

import java.util.Scanner;
public class FascinatingNumber{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number");
		int num;
		num=sc.nextInt();
		String str = ""+num*1+num*2+num*3;
		int count=0;
		for (int i=1;i<=9;i++){
			for (int j=0;j<str.length();j++){
				if((int)str.charAt(j)==(i+48)){
					count ++;
					break;
				}
			}
		}
		if(count==9){
			System.out.println("Fascinating Number");
		}
		else{
			System.out.println("Not Fascinating Number");
		}
	}
}