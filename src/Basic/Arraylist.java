package Basic;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ganesh");
        list.add("Arihanth");
        list.set(2,".B");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
