package programmer.command.line.application;

import programmer.command.line.data.CreateUserRequest;
import programmer.command.line.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("panji");
        request.setPassword("password");

        ValidationUtil.validationReflection(request);
    }
}
