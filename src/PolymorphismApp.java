public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Panji");
        employee.sayHello("Budi");

        employee = new Manager("Panji");
        employee.sayHello("Budi");

        employee = new VicePresident("Panji");
        employee.sayHello("Budi");

        sayHello(new Employee("Panji"));
        sayHello(new Manager("Jack"));
        sayHello(new VicePresident("Mary"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
