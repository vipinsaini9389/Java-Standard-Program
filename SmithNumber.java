//Smith Number in Java
import java.util.Scanner;
public class SmithNumber{
    public static int Sum(int n) {
        int sum=0;
        for(int i=0;i<n;n=n/10)
            sum=sum+n%10;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int num = sc.nextInt();
        int temp=num;
        int[] arr = new int[10];
        int m=0;
        int i=2;
        while(i<=num) {
            if(num%i==0) {
                arr[m]=i;
                m=m+1;
                num=num/i;
                i=2;
            }else {
                i=i+1;
            }
        }
        int numDigit=SmithNumber.Sum(temp);
        int factorDigit=0;
        for(int j=0;j<m;j++) {
            factorDigit=factorDigit+SmithNumber.Sum(arr[j]);
        }
        if(factorDigit==numDigit)
            System.out.println("Smith Number");
        else
            System.out.println("Not Smith");
    }
}
