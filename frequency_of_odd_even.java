// Java Program to find the frequency of odd & even numbers in the given matrix
import java.util.Scanner;

class frequency_of_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m1 = { { 3, 6, 4 }, { 8, 5, 3 }, { 2, 4, 7 } };
        int even = 0, odd = 0;
        System.out.println("\n--- Your Matrix ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j]%2== 0)
                    even++;
			
                else
                    odd++;
            }
        }
        System.out.println("Even Num : " + even);
        System.out.println("Odd Num : " + odd);

    }
}
