//Emirp Number in Java
import java.util.Scanner;

public class EmirpNumber {
	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        int originalNumber = number;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if both the original and reversed numbers are prime and not equal
        if (isPrime(originalNumber) && isPrime(reversedNumber) && originalNumber != reversedNumber) {
            System.out.println(originalNumber + " is an emirp number.");
        } else {
            System.out.println(originalNumber + " is not an emirp number.");
        }

    }

    
}
