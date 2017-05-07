import java.awt.*;

class UserScreen extends Frame {
	public UserScreen() {
		Label userNameLabel = new Label("User Name"); 

        this.add(userNameLabel);

        this.setSize(230, 230);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
	}
}
