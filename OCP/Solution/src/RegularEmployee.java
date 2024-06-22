 public class RegularEmployee implements Employee {
        private String name;
        private double monthlySalary;

        public RegularEmployee(String name, double monthlySalary) {
            this.name = name;
            this.monthlySalary = monthlySalary;
        }

        @Override
        public double calculateSalary() {
            return monthlySalary;
        }
    }


