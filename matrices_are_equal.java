//Java Program to determine whether two matrices are equal
import java.util.Scanner;
class matrices_are_equal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] m1 = {{3,6,4},{8,5,3},{2,4,7}};
        int[][] m2 = {{3,6,4},{8,5,3},{2,4,7}};
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
        int flag=1;
        if(m1.length==m2.length){
            for(int i=0;i<3;i++)
                for(int j=0;j<3;j++)
                    if(m1[i][j]!=m2[i][j])
                        flag=0;
            if(flag==1)
                System.out.print("\nMatrix Are Equal!");
            else
                System.out.print("\nMatrix Are Different!");
        }else{
            System.out.print("\nMatrix Are Different!");
        }
    }
}
