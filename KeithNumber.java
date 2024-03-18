//Keith Number in Java
import java.util.Scanner;
public class KeithNumber{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number ");
		int num;
	    num=sc.nextInt();
        int temp = num;
        int len = Integer.toString(num).length();
        int[] arr = new int[len];
        for(int i=len-1;i>=0;i--) {
            arr[i]=num%10;
            num=num/10;
        }
        int sum=0;
        int flag=0;
        int m;
        while(sum<=temp) {
            sum=0;
            for(int i=0;i<len;i++)
                sum=sum+arr[i];
            if(sum==temp) {
                flag=1;
                break;
            }
            for(m=0;m<len-1;m++)
                arr[m]=arr[m+1];
            arr[m]=sum;
        }
        if(flag==1)
            System.out.print("Keith Number");
        else
            System.out.println("Not Keith");
    }
}
