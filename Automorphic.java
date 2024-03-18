 //Automorphic Number Program in Java
import java.util.Scanner;
public class Automorphic{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int n,c=0,sq;
		n=sc.nextInt();
		sq=n*n;
		int temp=n;
		while (temp>0){
			c++;
			temp=temp/10;
		}
		int last=(int)(sq%(Math.pow(10,c)));
		if(n==last){
			System.out.println("Automorphic");
		}
		else{
			System.out.println("Not Automorphic");
		}
	}
}