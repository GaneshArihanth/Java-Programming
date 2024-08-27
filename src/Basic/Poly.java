package Basic;

class Animals {
    public void AnimalsSound() {
        System.out.println("The Animals makes a sound");
    }
}

class Lion extends Animals {
    public void AnimalsSound() {
        System.out.println("The Lion says: roor roor");
    }
}

class Fox extends Animals {
    public void AnimalsSound() {
        System.out.println("The Fox says: ooo ooo");
    }
}

public class Poly{
    public static void main(String[] args) {
        Animals myAnimals = new Animals();  
        Animals myLion = new Lion();        
        Animals myFox = new Fox();        
        
        myAnimals.AnimalsSound();  
        myLion.AnimalsSound();     
        myFox.AnimalsSound();     
    }
}
