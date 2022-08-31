package programmer.command.line.data;

public class Avanza implements Car {

    public void drive() {
        System.out.println("Drive avanza");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
