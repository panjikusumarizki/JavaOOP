class Person {
    //Field
    String name;
    String address;
    final String country = "Indonesia";
    //Field

    //Constructor
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //Constructor overloading
    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }
    //Constructor overloading
    //Constructor

    //Method
    void sayHello(String name) {
        System.out.println("Hello, " + name + ". My name is, " + this.name);
    }
}
