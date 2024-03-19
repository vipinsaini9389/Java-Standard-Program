/*Java program to print the following pattern on the console
  1234321
  1234321
  1234321
  1234321
  1234321
  1234321
  1234321 */

class Pattern5{
	public static void main(String [] args){
		for (int i=1;i<=7;i++){
			for (int j=1;j<=4;j++){
				System.out.print(j);
			}
			for (int k=3;k>=1;k--){
				System.out.print(k);
			}
			System.out.println();
		}
	}
}