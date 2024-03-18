//Peterson Number in Java

import java.util.Scanner;
public class Peterson{
	public static boolean Peterson(int n){
		int num = n;
		int sum = 0;
		while(n>0){
			int rem = n%10;
			sum=sum+fact(rem);
			n=n/10;
		}
		return (sum==num);
	}
	public static int fact(int n){
		if(n==1){
			return 1;
		}
		else{
			int z;
			z=n*fact(n-1);
			return(z);
		}
	}
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A number");
		int n=sc.nextInt();
		
		
		if(Peterson(n)){
			System.out.println("Peterson number");
		}
		else{
			System.out.println("Not peterson");
		}
		
	}
}