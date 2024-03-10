import java.util.Scanner;

public class MystryNumber{
    public static int Reverse(int numm) {
        int sum=0;
        for(int i=0;i<numm;numm=numm/10)
            sum=sum*10+(numm%10);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int num = sc.nextInt();
        int flag=0;
        for(int j=10;j<=num;j++) {
            if((j+MystryNumber.Reverse(j))==num) {
                flag=1;
                System.out.println(j+" + "+MystryNumber.Reverse(j));
                break;
            }
        }
        if(flag==1)
            System.out.println("It is a Mystry Number");
        else
            System.out.println("Not");
    }
}
