//java Program to print the duplicate elements of an array

import java.util.Scanner;
class duplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,3,6,2,3,5,3};
        System.out.println("Our Array");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\nduplicate ELements");
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                    arr[j]=0;
                }
            }
            if(arr[i]!=0)
                if(c>0)
                    System.out.print(arr[i]+" ");
        }
    }
}
