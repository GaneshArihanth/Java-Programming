package Basic;

class Test {
    private int x;
    private int y;

    public Test(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public void copy(Test obj) {
        this.x = obj.x;
        this.y = obj.y;
    }
}


public class Copyobj2 {
    public static void main(String[] args) {
        Test test1 = new Test(24, 12);
        Test test2 = new Test(15, 11);

        test2.copy(test1);

        System.out.println(test2.getx());
        System.out.println(test2.gety());

        System.out.println("Address: " + test1);
        System.out.println("Address: " + test2);
    }
}
