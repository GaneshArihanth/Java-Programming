package Adv;

class Generic_ex <T,D> {
    T a;
    D b;
    void input(T a, D b){
        this.a = a;
        this.b = b;
        System.out.println(this.a + " " + this.b);
    }
}

class Method{
    public static <J> void Generic_exDisplay(J element){
        System.out.println(element);
    }
}

public class Objects2 {
    public static void main(String[] args) {

        Generic_ex<Integer,String> obj1 = new Generic_ex<Integer,String>();
        Generic_ex<String,Double> obj2 = new Generic_ex<String,Double>();
        Generic_ex<Double,Integer> obj3 = new Generic_ex<Double,Integer>();
        obj1.input(15, "BirthDayDate");
        obj2.input("Double" , 150.00);
        obj3.input(10.1, 15);

        Method.Generic_exDisplay(11);
        Method.Generic_exDisplay("Ganesh");

    }
}
