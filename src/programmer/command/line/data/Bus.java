package programmer.command.line.data;

public class Bus implements Car {
    public void drive() {
        System.out.println("Drive bus");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "Mercedes-Benz";
    }

    public boolean isMaintenance() {
        return false;
    }
}
