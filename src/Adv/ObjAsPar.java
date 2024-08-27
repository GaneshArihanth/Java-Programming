package Adv;

class Garage {
    void park(Car obj) {
        System.out.println("Parked " + obj.name + " in garage");
    }
}

class Car {
    String name;

    Car(String name) {
        this.name = name;
    }
}

public class ObjAsPar {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.park(car1);
        garage.park(car2);

    }
}
