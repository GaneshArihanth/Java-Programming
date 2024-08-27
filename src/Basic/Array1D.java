package Basic;

public class Array1D {
    public static void main(String[] args) {
        int array[]=new int[5];
        for(int i=0;i<array.length;i++){
            array[i]=i;
            System.out.println(array[i]);
        }
        System.out.println("Size of Array: " + array.length);
    }
}
