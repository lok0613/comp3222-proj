import java.awt.*;
import java.awt.event.*;

class LoginScreen extends Frame {

    protected UserManager userManager;

    public LoginScreen() {

    }

    public LoginScreen setUserManager(UserManager userManager) {
        this.userManager = userManager;
        return this;
    }

    public LoginScreen renderUI() {
        Label userNameLabel = new Label("User Name");
        Label passwordLabel = new Label("Password");

        TextField userNameTextField = new TextField(15);
        TextField passwordTextField = new TextField(15);
        passwordTextField.setEchoChar('*');

        Button userNameButton = new Button("Login");
        userNameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.printf("username: %s, password: %s\n", userNameTextField.getText(), passwordTextField.getText());
                if (userManager.login(userNameTextField.getText(), passwordTextField.getText()) != null) {
                    System.out.println("login success.");
                } else {
                    System.out.println("login fail.");
                }
            }
        });
        Button cancelButton = new Button("Cancel");

        this.add(userNameLabel);
        this.add(userNameTextField);
        this.add(passwordLabel);
        this.add(passwordTextField);
        this.add(userNameButton);
        this.add(cancelButton);

        this.setSize(230, 230);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        return this;
    }
}
