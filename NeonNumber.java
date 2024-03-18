//Neon Number in Java
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int square = number * number;
        int sumOfDigits = 0;

        for (int temp = square; temp > 0; temp /= 10) {
            sumOfDigits += temp % 10;
        }

        if (sumOfDigits == number) {
            System.out.println(number + " is a neon number.");
        } else {
            System.out.println(number + " is not a neon number.");
        }
    }
}
