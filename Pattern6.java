/*Java program to print the following pattern on the console
12344321
12344321
12344321
12344321*/
class Pattern6{
	public static void main(String [] args){
		for (int i=1;i<=4;i++){
			for (int j=1;j<=4;j++){
				System.out.print(j);
			}			
			for (int k=4;k>=1;k--){
				System.out.print(k);
			}		
			System.out.println();
		}
	}
}