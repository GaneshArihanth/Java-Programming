package Basic;

class Laptop{
    String name;
    public Laptop(String name){
        this.name = name;
    }
}

public class Tostr {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Macbook");
        System.out.println(laptop);
        System.out.println(laptop.toString());
    }
}
