 //Krishnamurthy Number Java
import java.util.Scanner;
public class Krishnamurthy{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number:");		
		int n,d,sum=0;
		n=sc.nextInt();
		
		
		for(int i=n;i>0;i=i/10){
			d=i%10;
			 int f=1;
			for(int j=1;j<=d;j++){
				f=f*j;
				
			}
			sum=sum+f;
		}
		
		if(sum==n){
			System.out.println("Krishnamurthy number");
		}
		else{
			System.out.println("Not Krishnamurthy");
		}
    }
}