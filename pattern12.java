 /*Java program to print the following pattern on the console 4
A
B B
C C C
D D D D
E E E E E */

class Pattern12{
	public static void main(String [] args){
		char i;
		char j;
		for(i='A';i<='E';i++){
			for (j='A';j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}