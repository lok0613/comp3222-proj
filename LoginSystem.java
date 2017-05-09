import java.awt.*;
import java.awt.event.*;

class LoginSystem {

    protected LoginScreen loginScreen;

    protected UserScreen userScreen;

    public LoginSystem(LoginScreen loginScreen, UserScreen userScreen) {
        this.loginScreen = loginScreen;
        this.userScreen = userScreen;
    }

    public LoginSystem gotoUserScreen() {
        this.loginScreen.setVisible(false);
        this.userScreen.renderUI();

        return this;
    }

    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        UserManager userManager = new UserManager();

        userManager
            .register("lok", "password", "Student")
            .register("jack", "password", "Student")
            .register("qxWong", "teacherpassword", "Teacher");

        LoginSystem loginSystem = new LoginSystem(
            (new LoginScreen())
                .setUserManager(userManager),
            (new UserScreen())
                .setUserManager(userManager)
        );

        loginSystem.loginScreen.renderUI();
    }
}
