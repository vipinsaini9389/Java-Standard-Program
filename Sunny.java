//Sunny Number in Java
import java.util.Scanner;
public class Sunny{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number ");
		int num=sc.nextInt();
		int flag=0;
		for(int i=1;i<=(num+1)/2;i++){
			if(i*i==num+1){
				flag=1;
				break;
			}
			
		}
		if(flag==1){
				System.out.println("sunny number");
			}
			else{
				System.out.println("Not sunny number");
			}
	}
}