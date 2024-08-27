package Basic;

import java.util.Scanner;

public class Solutions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        for (int i = 0; i < n; i++) {
            String username = scanner.nextLine();
            if (isValidUsername(username)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        scanner.close();
    }
    
    public static boolean isValidUsername(String username) {
        // Regular expression pattern to validate the username
        String pattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        return username.matches(pattern);
    }
}
