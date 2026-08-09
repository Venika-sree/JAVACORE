package week2;

import java.util.Scanner;

class Number {
    int check(int n) {
        int reverse = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (n == reverse) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Number obj = new Number();

        if (obj.check(n) == 1) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
        sc.close();
    }
}