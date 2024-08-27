package Basic;

class DemoTest {
    private int x;
    private int y;

    public DemoTest(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }
}

public class Copyobj1 {
    public static void main(String[] args) {
        Test test1 = new Test(10, 5);
        Test test2 = test1;
        System.out.println(test1.getx());
        System.out.println(test2.gety());
        System.out.println("Address: " + test1);
        System.out.println("Address: " + test2);
        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());


    }
}
