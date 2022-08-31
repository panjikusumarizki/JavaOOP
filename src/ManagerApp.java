public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Agus");
        manager.sayHello("Joko");

        var vp = new VicePresident("Tarno");
        vp.sayHello("Maskur");
    }
}
