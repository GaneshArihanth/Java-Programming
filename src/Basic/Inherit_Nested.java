package Basic;

public class Inherit_Nested {

    class Animals {
        public void animalsSound() {
            System.out.println("Zzhuhz");
        }
    
        public void sleep() {
            System.out.println("Zzz");
        }
    }
    
    class Pig extends Animals {
        public void animalsSound() {
            System.out.println("The pig says: wee wee");
        }
    }
    
    public static void main(String[] args) {
        Inherit_Nested obj = new Inherit_Nested();
        Inherit_Nested.Animals myPig = obj.new Pig();
        myPig.animalsSound();
        myPig.sleep();
    }
}