import java.awt.*;
import java.awt.event.*;

class LoginScreen extends Frame {
	public LoginScreen() { 
        Label userNameLabel = new Label("User Name"); 
        Label passwordLabel = new Label("Password");

        TextField userNameTextField = new TextField(15);
        TextField passWordeTextField = new TextField(15);
        passWordeTextField.setEchoChar('*');

        Button userNameButton = new Button("Login");
        userNameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("yo");
            }
        });
        Button cancelButton = new Button("Cancel");

        this.add(userNameLabel);
        this.add(userNameTextField);
        this.add(passwordLabel);
        this.add(passWordeTextField);
        this.add(userNameButton);
        this.add(cancelButton);

        this.setSize(230, 230);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }
}
