 //Java Program to right rotate the elements of an array
import java.util.Scanner;
class  Rotation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Our Array");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.print("\nHow Many Times You Want To Rotate : ");
        int rotation = sc.nextInt();
        int m=0;
        for(int j=0;j<rotation;j++){
            int temp=arr[0];
            for(m=0;m<arr.length-1;m++)
                arr[m]=arr[m+1];
            arr[m]=temp;
        }
        System.out.println("\nRotated Array");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}