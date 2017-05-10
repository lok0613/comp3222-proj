class Teacher extends User {

    /**
     * @inheritdoc
     */
    public String greetings() {
        return "Good morning teacher, your ID is " + this.userName;
    }
}
