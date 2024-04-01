 /*Java program to print the following pattern on the console 9
*****
****
***
**
*    */
 class Pattern16{
	 public static void main(String[]args){
		 for(int i=1;i<=5;i++){
			 for (int j=5;j>=i;j--){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
 }