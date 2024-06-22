class Register {
    private User user;

    public Register(User user) {
        this.user = user;
    }

    public void registerUser() {
        System.out.println("Registering user: " + user.getName());
        // Registration logic here
    }
}
