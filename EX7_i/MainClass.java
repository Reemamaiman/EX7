package EX7_i;

public class MainClass {


        public static void main(String[] args) {
            Company company = new Company("Google");
            FullTimeEmployee fullTimeemployee1 = new FullTimeEmployee("Rema", 1, 4000);
            FullTimeEmployee fullTimeemployee2 = new FullTimeEmployee("Malak", 2, 3500);

            PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("Aicha", 3, 20, 2000);
            PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("Amina", 4, 19, 1500);

            company.add(fullTimeemployee1);
            company.add(fullTimeemployee2);
            company.add(partTimeEmployee1);
            company.add(partTimeEmployee2);

            System.out.println("The Total Salary Is : " + company.computeAmount());
        }

    }

}
