package Adv;

import java.util.ArrayList;

class ALtoArr1 {

    public static int[] getConcatenation(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < nums.length * 2; i++) {
            arr.add(nums[i % nums.length]);
        }
        Integer[] tempArray = new Integer[nums.length * 2];
        arr.toArray(tempArray);
        int[] array = new int[tempArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            array[i] = tempArray[i];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int[] result = getConcatenation(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
