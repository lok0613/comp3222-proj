import java.awt.*;
import java.awt.event.*;

class LoginScreen extends Frame {

    /**
     * @var UserManager
     */
    protected UserManager userManager;

    /**
     * Setter method of userManager
     *
     * @param UserManager userManager
     * @return LoginScreen
     */
    public LoginScreen setUserManager(UserManager userManager) {
        this.userManager = userManager;
        return this;
    }

    /**
     * Rendering the UI components on frame
     *
     * @return LoginScreen
     */
    public LoginScreen renderUI() {
        Label userNameLabel = new Label("User Name");
        Label passwordLabel = new Label("Password");

        TextField userNameTextField = new TextField(15);
        TextField passwordTextField = new TextField(15);
        passwordTextField.setEchoChar('*');

        Button userNameButton = new Button("Login");
        Frame frame = this;
        userNameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                User user = userManager.login(userNameTextField.getText(), passwordTextField.getText());
                if (user != null) {
                    String greetings = user.greetings();
                    Dialog dialog = new Dialog(frame, "new");
                    dialog.setSize(320, 200);
                    dialog.add(new Label(greetings));
                    dialog.setVisible(true);
                } else {
                    frame.dispose();
                }
            }
        });
        Button cancelButton = new Button("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame.dispose();
            }
        });

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
