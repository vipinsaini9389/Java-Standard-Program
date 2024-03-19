//Java Program to Add Two Matrices
import java.util.Scanner;
class Matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] m1 = {{3,6,4},{8,5,3},{2,4,7}};
        int[][] m2 = new int[3][3];
        System.out.print("Enter 9 Elements For M2 : ");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                m2[i][j]=sc.nextInt();
        System.out.println("\nMatrix 1");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(m1[i][j]+" ");
            System.out.println();
        }
        System.out.println("\nMatrix 2");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(m2[i][j]+" ");
            System.out.println();
        }
        System.out.println("\nAddition of Matrixs");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(m1[i][j]*m2[i][j]+" ");
            System.out.println();
        }
    }
}
 