 //Factorial Program in Java
 
 import java.util.Scanner;
 public class Factorial{
	 public static void main(String[]args){
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter A number: ");
		 int n,fact=1;
		 n=sc.nextInt();
		 for(int i=1;i<=n;i++){
			 fact=fact*i;
		 }
		 System.out.println("Factorial"+" "+fact);
	 }
 }
