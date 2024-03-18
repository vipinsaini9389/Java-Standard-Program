import java.util.Scanner;

public class NumberToWord {
    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convertNumberToWord(int number) {
        if (number == 0) {
            return "Zero";
        }

        if (number < 0) {
            return "Minus " + convertNumberToWord(-number);
        }

        String words = "";

        if ((number / 1000000) > 0) {
            words += convertNumberToWord(number / 1000000) + " Million ";
            number %= 1000000;
        }

        if ((number / 1000) > 0) {
            words += convertNumberToWord(number / 1000) + " Thousand ";
            number %= 1000;
        }

        if ((number / 100) > 0) {
            words += convertNumberToWord(number / 100) + " Hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 20) {
                words += units[number];
            } else {
                words += tens[number / 10];
                if ((number % 10) > 0) {
                    words += " " + units[number % 10];
                }
            }
        }

        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (up to 999,999): ");
        int number = scanner.nextInt();
        System.out.println(convertNumberToWord(number));
        scanner.close();
    }
}
