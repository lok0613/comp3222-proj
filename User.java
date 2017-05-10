abstract class User {

    /**
     * Username
     */
    protected String userName;

    /**
     * Plain password
     */
    protected String password;

    /**
     * Greetings message
     *
     * @return String
     */
    abstract String greetings();

    /**
     * Private constructor
     */
    protected User() {

    }

    /**
     * Register Method
     *
     * @param String userName
     * @param String password
     * @return User
     */
    public User register(String userName, String password) {
        this.userName = userName;
        this.password = password;
        return this;
    }

}
