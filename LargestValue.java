import java.util.Scanner;
public class LargestValue{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A three Number");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b){
			if (a>c)
				System.out.println(a);
			else 
				System.out.println(c);
		}
		else{
			if (b>c)
				System.out.println(b);
			else 
				System.out.println(c);
			
		}
		
	}
}