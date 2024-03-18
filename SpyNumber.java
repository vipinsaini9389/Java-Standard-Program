//Spy Number in Java
import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0, product = 1;

        for (int temp = number; temp > 0; temp /= 10) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
        }

        if (sum == product) {
            System.out.println(number + " is a spy number.");
        } else {
            System.out.println(number + " is not a spy number.");
        }
    }
}
