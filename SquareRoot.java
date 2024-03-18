//Java Program to Find Square Root of a Number Without sqrt Method
import java.util.Scanner;
public class SquareRoot{
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num;
		num=sc.nextInt();
		double temp;
		double sr=num/2;
		
		do{
			temp=sr;
			sr=(temp+(num/temp))/2;
		}while((temp-sr)!=0);
		System.out.println("Square Root of a number is "+sr);
	}
}