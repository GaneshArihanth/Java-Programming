package Adv;

import java.util.ArrayList;

public class ALtoArr2 {
    public static int[] result() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        int[] target = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            target[j] = list.get(j);
        }
        return target;
    }

    public static void main(String[] args) {
        int[] resultArray = result();
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
}
