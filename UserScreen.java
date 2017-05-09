import java.awt.*;

class UserScreen extends Frame {

    protected UserManager userManager;

    public UserScreen() {

    }

    public UserScreen setUserManager(UserManager userManager) {
        this.userManager = userManager;
        return this;
    }

    public UserScreen renderUI() {
        Label userNameLabel = new Label("User Name");
        this.add(userNameLabel);

        this.setSize(230, 230);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        return this;
    }
}
