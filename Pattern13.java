/* Java program to print the following pattern on the console 5
1111111111
1        1
1        1
1        1
1        1
1        1
1        1
1        1
1        1
1111111111 */
class Pattern13{
	public static void main(String[]args){
		int n=10;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1||i==n||j==1||j==n){
					System.out.print("1");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}