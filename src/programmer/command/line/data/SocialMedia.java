package programmer.command.line.data;

class SocialMedia {
    String name;
}

class Facebook extends SocialMedia {
    final void login(String username, String password) {}
}

// ERROR
class FakeFB extends Facebook {
//    void login(String username, String password);
}
