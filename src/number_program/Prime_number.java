package number_program;

import java.util.*;

public class Prime_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                break;
            }
        }

        if (n == i) {
            System.out.println("This is a prime number.");
        } else {
            System.out.println("This is not a prime number.");
        }
    }
}
