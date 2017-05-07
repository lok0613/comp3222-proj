class UserFactory {

	public User create(String userName, String password, String userType) {
		User user = (new User()).register("lok", "password");

		if (userType == "Student") {
			user = (Student)user;
		} else if (userType == "Teacher") {
			user = (Teacher)user;
		}

		return user;
	}
}
