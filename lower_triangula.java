// Java Program to display the lower triangular matrix
/*
5 0 0 
3 6 0 
4 6 3
*/
import java.util.Scanner;
class lower_triangula{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] m1 = {{3,6,4},{8,5,3},{2,4,7}};
        System.out.println("\n--- Your Matrix ---");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i<j)
                    System.out.print("0 ");
                else
                    System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
