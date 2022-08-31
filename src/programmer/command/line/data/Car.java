package programmer.command.line.data;

import programmer.command.line.annotation.Fancy;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public interface Car extends HasBrand, IsMaintenance {

    void drive();

    int getTire();

    default boolean isBig() {
        return false;
    };
}
