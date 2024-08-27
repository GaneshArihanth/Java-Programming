package Adv;

import java.util.Scanner;

public class IsPrime1 {

    static boolean isprime(int x) {
        if (x <= 1) {
            return false;
        } else {
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (isprime(n)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }
}
