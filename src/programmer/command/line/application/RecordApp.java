package programmer.command.line.application;

import programmer.command.line.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("panji", "password1234");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("abdi"));
        System.out.println(new LoginRequest("abdi", "pass4321"));
    }
}
