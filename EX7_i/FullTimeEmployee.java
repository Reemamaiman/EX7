package EX7_i;

    public class FullTimeEmployee extends Employee {

        int weeklySalary;

        public FullTimeEmployee(String name, int id, int weeklySalary) {
            super(name, id);
            this.weeklySalary = weeklySalary;
        }

        @Override
        public double computeAmount() {
            return weeklySalary * 4;
        }

    }


