package nested_inner;

public class Car {
    int d;
    static int b;

    Car() {
    }

    class Engine {
        int a;


        Engine() {

        }
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();

    }
}