 /* Java program to print the following pattern on the console 3
*
**
***
****
*****
******  */
class pattern11{
 public static void main(String [] args){
	 for(int i=1;i<=6;i++){
		 for(int j=1;j<=i;j++){
			 System.out.print("*");
		 }
		 System.out.println();
	}
 }	
}