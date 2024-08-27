package Adv;

import java.math.BigInteger;
import java.util.Scanner;

public class IsPrime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger input = sc.nextBigInteger();
        sc.close();
        if (input.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
