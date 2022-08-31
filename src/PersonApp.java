public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Panji", "Bumiayu");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Yuli");

        Person person2 = new Person("Yuli");
        person2.sayHello("John");

        Person person3;
        person3 = new Person();
        person3.name = "John";
        person3.sayHello("Panji");
    }
}
