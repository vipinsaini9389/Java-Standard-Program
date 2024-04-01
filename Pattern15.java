/*Java program to print the following pattern on the console 7
*********
 *******
  *****
   ***
    *         */
class Pattern15{
	public static void main(String []args){
		int n=5;
		int m=1;
		int k=n*2-1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<n*2;j++){
				if(j>=m && j<=k){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			m++;
			k--;
			System.out.println();
		}
	}
}