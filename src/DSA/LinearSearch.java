package DSA;

public class LinearSearch {
    /* returns the index of target
     *  returns -1 if not found
     */
    public static int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target)
                return i;

        return -1;
    }

    /* returns true if target is found
     *  returns false if not found
     */
    public static boolean contains(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target)
                return true;

        return false;
    }

    /* Search for a char in a string
     * returns the index of target
     *  returns -1 if not found
     */
    public static int find(String str, char target) {
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == target)
                return i;
        return -1;
    }

    /* returns true if target is found
     *  returns false if not found
     */
    public static boolean contains(String str, char target) {
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == target)
                return true;
        return false;
    }

    /* Search 2d array
     * returns the index of target in an int array [row,col]
     *  returns [-1,-1] if not found
     */
    public static int[] find(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target)
                    return new int[]{row, col};
            }
        }

        return new int[]{-1, -1};
    }

    // Find the maximum element in an array
    public static int findMax(int[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Array is empty");

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    // Find the minimum element in an array
    public static int findMin(int[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Array is empty");

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    // Count occurrences of a character in a string
    public static int countChar(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target)
                count++;
        }
        return count;
    }

    // Count 4-digit elements in an array
    public static int count4DigitElements(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 1000 && num <= 9999)
                count++;
        }
        return count;
    }
}
