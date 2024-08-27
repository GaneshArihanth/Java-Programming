package Basic;

public class Abst {
    public static void main(String[] args) {
        Animal myPig = new Pig(); 
        myPig.animalSound(); 
        myPig.sleep(); 
    }   
}

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}