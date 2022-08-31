package programmer.command.line.application;

import programmer.command.line.annotation.Fancy;
import programmer.command.line.data.LoginRequest;
import programmer.command.line.error.ValidationException;
import programmer.command.line.util.ValidationUtil;

public class ValidationApp {

    @Fancy(name = "AnimalApp", tags = {"application", "java"})
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Panji", "password");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid: " + exception.getMessage());
        } finally {
            System.out.println("Selesai Bung !!!");
        }
//        catch (NullPointerException exception) {
//            System.out.println("Data tidak valid: " + exception.getMessage());
//        }

        LoginRequest loginRequest2 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Yaaaaaa");
    }
}
