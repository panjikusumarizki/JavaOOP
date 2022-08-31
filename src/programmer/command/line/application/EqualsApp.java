package programmer.command.line.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Panji";
        first = first + " " + "Kusumarizki";

        System.out.println(first);

        String second = "Panji Kusumarizki";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Panji Kusumarizki";

        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
