import java.util.*;

class UserManager {

    protected List<User> users = new ArrayList<User>();

    public UserManager() {

    }

    public UserManager add(User user) {
        this.users.add(user);
        return this;
    }

    public User login(String userName, String password) {
        // System.out.printf("userName: %s, password: %s\n", userName, password);
        for (int t=0; t<this.users.size(); t++) {
            User user = this.users.get(t);
            // System.out.println("Size of userName: " + userName.length());
            // System.out.println("Size of user.userName: " + user.userName.length());
            // System.out.println("user equal? " + (userName == user.userName ? "true" : "false"));
            if (user.userName.equals(userName) && user.password.equals(password)) {
                System.out.println("Matched");
                return user;
            }
        }
        return null;
    }

    public UserManager register(String userName, String password, String userType) {
        User user = new User();

        if (userType == "Student") {
          user = new Student();
        } else if (userType == "Teacher") {
          user = new Teacher();
        }

        user.register(userName, password);
        this.add(user);

        return this;
      }

}
