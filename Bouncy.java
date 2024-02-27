//Bouncy Number in Java

import java.util.Scanner;
public class Bouncy{
	public static void main(String []args){
      Scanner sc=new Scanner (System.in);
	  System.out.println("Enter A Number! ");
	  int num=sc.nextInt();
	  String str=Integer.toString(num);
	  int len = str.length();
	  int[]arr = new int [len];
	  for (int i=len-1;i>=0;i--){
		  arr[i]=num%10;
		  num=num/10;
	  
	  }
	  int flag =0;
	  if (len>2){
		  if (arr[0]<arr[1]){
			  for (int i=0;i<len-1;i++){
				  if (!(arr[i]<arr[i+1]))
			         flag=1;
			    }
		    }
		  else{
			  for (int i=0;i<len-1;i++){
				  if (!(arr[i]>arr[i+1]))
			  	  flag=1;
			    }
		  }
		  if (flag==1){
			  System.out.println("Bonucy");
		    }  
		  else{
			  System.out.println("Not BOuncy");
		    }
	    }
	  else{
		  System.out.println("Not Bouncy");
	    }
    }
}
