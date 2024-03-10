//Prime Number Program in Java

import java.util.Scanner;
public class PrimeNumber{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int n,count=0;
		System.out.print("Enter A Number:");
		n=sc.nextInt();
		
		for (int i=1;i<=n;i++){
			if (n%i==0){
				count ++;
			}
		}
		if(count==2){
			System.out.println("Prime Number");
		}
		else{
			System.out.println("Not Prime Number");
		}
	}
}