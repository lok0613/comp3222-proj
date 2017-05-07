class User {

	/**
	 * Username
	 */
	protected String userName;

	/**
	 * Plain password
	 */
	protected String password;

	/**
	 * Login by username and password
	 *
	 * @param String userName From user input
	 * @param String password From user input
	 * @return
	 */
	public boolean login(String userName, String password) {
		return userName == this.userName && password == this.password;
	}

	/**
	 *
	 */
	public User register(String userName, String password) {
		this.userName = userName;
		this.password = password;
		return this;
	}

}
