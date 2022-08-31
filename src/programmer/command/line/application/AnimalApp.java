package programmer.command.line.application;

import programmer.command.line.annotation.Fancy;
import programmer.command.line.data.Animal;
import programmer.command.line.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Judy";
        animal.run();
    }
}
