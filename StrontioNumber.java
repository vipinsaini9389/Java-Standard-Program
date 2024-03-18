//Strontio Number in Java
import java.util.Scanner;
public class StrontioNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int m = sc.nextInt();
        int num=m*2;
        if(num>=100) {
            if(((num/10)%10)==((num/100)%10))
                System.out.println("Strontio");
            else
                System.out.println("Not Strontio");
        }else {
            System.out.println("Not Strontio");
        }
    }
}