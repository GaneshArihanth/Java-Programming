package Basic;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        sc.close();
        for (int i = 1; i <= l; i++){
            for(int j = 1; j < i+1; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
