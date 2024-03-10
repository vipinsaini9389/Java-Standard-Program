//Buzz Number Java
import java.util.Scanner;
public class Buzz{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A number:");
		int num=sc.nextInt();
		if ((num%7==0)||(num%10==7)){
			System.out.println("Buzz Number");
		}
		else{
			System.out.println("Not Buzz Number");
		}
	}
}