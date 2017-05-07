import java.awt.*;
import java.awt.event.*;

class LoginSystem {

    protected LoginScreen loginScreen;

    protected UserScreen userScreen;

    public LoginSystem(LoginScreen loginScreen, UserScreen userScreen) {
        this.loginScreen = loginScreen;
        this.userScreen = userScreen;
    }

    public static void main(String[] args) {
        // Student lok = (Student)(new Student()).register("lok", "password");
        Student jack = (Student)(new Student()).register("jack", "password");
        Student lok = (Student)(new UserFactory()).create("lok", "password", "Student");

        LoginSystem loginSystem = new LoginSystem(new LoginScreen(), new UserScreen());
    }
}
