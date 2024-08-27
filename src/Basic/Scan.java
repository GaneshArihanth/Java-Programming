package Basic;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter two numbers to divide:");

    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    scanner.close();

    System.out.println("You Entered : " + num1 + " / " + num2);
    double x = (double) num1 / num2;
    System.out.println("The value of x is :" + x);

    } 
}
