//How to Print ASCII Value in Java
import java.util.Scanner;

public class AsciiValue{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.print("Enter Any Character"+" ");
		ch=sc.next().charAt(0);
		
		int a = ch ;
		System.out.println("ASCII Value of "+" "+ch +" is "+ a); 
	}
}