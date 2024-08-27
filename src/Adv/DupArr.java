package Adv;

import java.util.Scanner;
import java.util.Arrays;

public class DupArr {

    public static int dup(int[] array) {
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                return array[i];
            }
        }
        return -1;
    }

    public static void findDuplicate() {
        Scanner sc = new Scanner(System.in);
        int arno = sc.nextInt();
        for (int i = 0; i < arno; i++) {
            int siz = sc.nextInt();
            int[] arry = new int[siz];
            for (int j = 0; j < siz; j++) {
                arry[j] = sc.nextInt();
            }
            int ans = dup(arry);
            System.out.print(ans + " ");
        }
        sc.close();
    }

    public static void main(String[] args) {
        findDuplicate();
    }
}
