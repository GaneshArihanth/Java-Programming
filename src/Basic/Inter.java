package Basic;

interface Spcies {
    public void animalsound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}
  
class Cow implements Spcies {
    public void animalsound() {
        System.out.println("The Cow says: Moo Moo");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
}

public class Inter {
    public static void main(String[] args) {
        Cow myPig = new Cow();
        myPig.animalsound();
        myPig.sleep();
    }
}
      

