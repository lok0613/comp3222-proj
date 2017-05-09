class UserFactory {

  public User create(String userName, String password, String userType) {
    User user = new User();

    if (userType == "Student") {
      user = new Student();
    } else if (userType == "Teacher") {
      user = new Teacher();
    }

    user.register(userName, password);

    return user;
  }
}
