public class Main {
    public static void main(String[] args) {
        RegularEmployee regularEmployee = new RegularEmployee("mahmoud", 5000);
        Manager manager = new Manager("Abdelaal", 4000, 1000);

        System.out.println("Salary of regular employee: $" + regularEmployee.calculateSalary());
        System.out.println("Salary of manager: $" + manager.calculateSalary());
    }
}