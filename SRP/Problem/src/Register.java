public class Register {
    private String name;
    private String address;

    public Register(String name, String address) {
        this.name = name;
        this.address = address;
        this.notifcation();
    }

    public  void notifcation(){
         System.out.println("Welcome To our WebPage");
    }
}
