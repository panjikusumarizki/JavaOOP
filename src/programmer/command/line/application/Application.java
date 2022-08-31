package programmer.command.line.application;

import programmer.command.line.data.*;

public class Application {
    public static void main(String[] args) {

        Product product = new Product("Iphone 12", 12000000);

        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
