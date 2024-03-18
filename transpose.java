// Java Program to find the transpose of a given matrix
import java.util.Scanner;
class transpose{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] m1 = {{3,6,4},{8,5,3},{2,4,7}};
        int even=0,odd=0;
        System.out.println("\n--- Your Matrix ---");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n--- Tranpose Matrix ---");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m1[j][i]+" ");
            }
            System.out.println();
        }

    }
}
