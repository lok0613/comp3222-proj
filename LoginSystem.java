import java.awt.*;
import java.awt.event.*;

class LoginSystem {

    /**
     * @var LoginScreen
     */
    protected LoginScreen loginScreen;

    /**
     * Getter method for loginScreen
     *
     * @return LoginScreen
     */
    public LoginScreen getLoginScreen() {
        return this.loginScreen;
    }

    /**
     * Setter method for loginScreen
     *
     * @param LoginScreen loginScreen
     * @return LoginSystem
     */
    public LoginSystem setLoginScreen(LoginScreen loginScreen) {
        this.loginScreen = loginScreen;

        return this;
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        userManager
            .register("lok", "password", "Student")
            .register("jack", "password", "Student")
            .register("william", "password", "Student")
            .register("qxWong", "teacherpassword", "Teacher");

        LoginSystem loginSystem = (new LoginSystem())
            .setLoginScreen((new LoginScreen())
                .setUserManager(userManager));

        loginSystem.getLoginScreen().renderUI();
    }
}
