 //ATM program Java
 import java.util.Scanner;
 public class ATM{
	 static Scanner sc=new Scanner(System.in);
	 static int amount=10000;
	 public static void ChashDeposit(){
		 System.out.println("Enter Amount:");
		 int dep=sc.nextInt();
		 amount=amount+dep;
		 System.out.println("Deposit Sucess!");		 
	 }
	 public static void ChashWith(){
		 System.out.println("Enter Amount:");
		 int am=sc.nextInt();
		 if(am<amount){
			 amount=amount-am;
			 System.out.println("Withdrawl Sucess!");
		 }
		 else{
			 System.out.println("insuffcient Balance");
		 }
	 }
	 public static void Inquiry(){
		 System.out.println("Amount"+amount);
	 }
	 public static void main(String []args){
		 while(true){
			 System.out.println("****ATM PROGRAM****");
			 System.out.println("1.Deposit\n 2.Withdrawl\n 3.Inquiry\n 4.Exit\n Enter choice:");
			 int choice=sc.nextInt();
			 switch(choice){
				 case 1:ChashDeposit();break;
				 case 2:ChashWith();break;
				 case 3:Inquiry();break;
				 default:System.exit(0);

			 }
		 }
	 }
 }