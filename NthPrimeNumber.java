import java.util.Scanner;

public class NthPrimeNumber {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nthPrime(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                count++;
            }
            if (count == n) {
                break;
            }
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n to find the nth prime number: ");
        int n = scanner.nextInt();
        scanner.close();

        int nthPrime = nthPrime(n);
        System.out.println("The " + n + "th prime number is: " + nthPrime);
    }
}
