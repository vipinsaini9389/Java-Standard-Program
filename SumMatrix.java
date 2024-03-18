//java Program to find the sum of each row and each column of a matrix
/*
00    01     02
10    11    12
20    21    22
*/

import java.util.Scanner;
class SumMatrix{
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
        for(int i=0;i<3;i++){
            int column=0;
            int row=0;
            for(int j=0;j<3;j++){
                column=column+m1[j][i];
                row = row +m1[i][j];
            }
            System.out.print("\n"+(i+1)+" Column Addition : "+column);
            System.out.print("\n"+(i+1)+" Row Addition : "+row);
        }
    }
}