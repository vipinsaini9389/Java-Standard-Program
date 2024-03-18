import java.util.Scanner;

public class Xylem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int n = number;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (sum <= 8) {
            System.out.println(number + " is a Xylem number.");
        } else {
            System.out.println(number + " is a Phloem number.");
        }
    }
}
