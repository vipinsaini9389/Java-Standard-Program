 //Krishnamurthy Number Java
 import java.util.Scanner;
 public class Krishnamurthy{
	 public static int fact(int num){
		 int fact=1;
		 for (int i=1;i<=num;i++){
			 fact=fact*i;
			 
		 }
		 return fact;
	 }
	 public static void main(String []args){
		 Scanner sc=new Scanner (System.in);
		 System.out.print("Enter A number ");
		 int num=sc.nextInt();
		 int sum=0;
		 int temp=num;
		 for(int m=0;m<num;num=num/10){
			 sum=sum+fact(num%10);
		 }
		 if(sum==temp){
			 System.out.println("Krishnamurthy Number");
		 }
		 else{
			 System.out.println("Not Krishnamurthy Number");
		 }
	 }
 }