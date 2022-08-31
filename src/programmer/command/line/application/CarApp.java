package programmer.command.line.application;

import programmer.command.line.data.Avanza;
import programmer.command.line.data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
        System.out.println(car.getBrand());
    }
}
