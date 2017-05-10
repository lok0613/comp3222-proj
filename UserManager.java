import java.util.*;

class UserManager {

    /**
     * @var User[]
     */
    protected List<User> users = new ArrayList<User>();

    /**
     * Add user to the internal variable - users
     *
     * @param User user
     * @return UserManager
     */
    public UserManager add(User user) {
        this.users.add(user);
        return this;
    }

    /**
     * Determine if the userName and password found
     *
     * @param String userName
     * @param String password
     * @return User
     */
    public User login(String userName, String password) {
        for (int t=0; t<this.users.size(); t++) {
            User user = this.users.get(t);

            if (user.userName.equals(userName) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Register method for user
     *
     * @param String userName
     * @param String password
     * @param String userType
     * @return UserManager
     */
    public UserManager register(String userName, String password, String userType) {
        User user = this.factory(userName, password, userType);

        if (user != null) {
            user.register(userName, password);
            this.add(user);
        }

        return this;
    }

    /**
     * Factory method of simpel factory design pattern
     *
     * @param String userName
     * @param String password
     * @param String userType
     * @return User
     */
    protected User factory(String userName, String password, String userType) {
        User user;

        if (userType.equals("Student")) {
          user = new Student();
        } else if (userType.equals("Teacher")) {
          user = new Teacher();
        } else {
            return null;
        }

        return user;
    }

}
