package programmer.command.line.application;

import programmer.command.line.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("joly","roger");
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Connection to database failed");
        }
    }
}
