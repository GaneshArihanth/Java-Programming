package Basic;

 class Person {
    String name;
    int age;
    /* Person(String name, int age) {
        this.name = name;
        this.age = age;
    } */
    public void identity(String name, int age){
        this.name = name;
        this.age = age;
    }
} 

 class Hero extends Person {
    String power;
    Hero(String name ,int age, String power) {
        //super(name, age);        // to access constructor.
        super.identity(name, age); // to access method.
        this.power = power;
    }
}

public class Supr {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman",47,"$$$");
        Hero hero2 = new Hero("Superman",39,"Everything");

        System.out.println(hero1.name +"  "+ hero1.age +"  "+ hero1.power);
        System.out.println(hero2.name +"  "+ hero2.age +"  "+ hero2.power);

    }
}
