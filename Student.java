class Student extends User {

    /**
     * @inheritdoc
     */
    public String greetings() {
        return "Hi student, your ID is " + this.userName;
    }
}
