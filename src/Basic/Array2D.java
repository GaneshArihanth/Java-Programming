package Basic;

public class Array2D {

  int array[][] = {
    {1, 2, 3, 4}, {5, 6, 7}, {8, 9}
  };
  public static void main(String[] args) {

    Array2D obj = new Array2D();

    int arr[][] = obj.array; 
      
      for (int i = 0; i < arr.length; ++i) {
        System.out.println();
        
          for (int j = 0; j < arr[i].length; ++j) {
              System.out.print(arr[i][j] + "  ");
          }
        System.out.println();
      }
    System.out.print("\n");
    System.out.println( "Size of Array: " + arr.length);
  }
}
