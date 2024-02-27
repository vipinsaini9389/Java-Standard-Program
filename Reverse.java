//How to Reverse a Number in Java
import java.util.Scanner;
public class Reverse{
 public static void main (String []args){
	 int n,r;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter A number: ");
	 n=sc.nextInt();
	 
	 while(n>0){
		 r=n%10;
		 System.out.print(r);
		 n=n/10;
	 }
	 
 }
}