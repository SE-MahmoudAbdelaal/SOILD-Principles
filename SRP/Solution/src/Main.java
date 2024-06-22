public class Main {
    public static void main(String[] args) {
        User user = new User("mahmoud", "54.Gamal.str");
        Register register = new Register(user);
        Notification notification = new Notification();

        register.registerUser();
        notification.sendWelcomeMessage();
    }
}