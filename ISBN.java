//ISBN Number Java
import java.util.Scanner;
public class ISBN{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print ("Enter a number");		
		String str=sc.next();		
		if(str.length()==13){
			System.out.println("ISBN Number");
		}
		else{
			System.out.println("Not ISBN Number");
		}
	}	
}