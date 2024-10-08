package Adv;

class BinarySearchExample {
  public static void binarySearch(int arr[], int first, int last, int key) {
    int mid = (first + last) / 2;
    while (first <= last) {

      if (arr[mid] == key) {
        System.out.println("Element is found at index: " + mid);
        break;
      }
      if (arr[mid] < key) {
        first = mid + 1;
      } 
      else {
        last = mid - 1;
      }
      mid = (first + last) / 2;
    }
    if (first > last) {
      System.out.println("Element is not found!");
    }
  }

  public static void main(String args[]) {
    int arr[] = { 00, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    int key = 90;
    int last = arr.length - 1;
    binarySearch(arr, 0, last, key);
  }
}
