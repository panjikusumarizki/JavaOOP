package programmer.command.line.application;

import programmer.command.line.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();
        category.setId("EN");
        category.setId(null);

        System.out.println(category.getId());
    }
}
