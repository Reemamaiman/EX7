package EX7_i;
import java.util.ArrayList;
import java.util.List;


    public class Company implements PayAble {
        String name;
        List<PayAble> arr = new ArrayList<PayAble>();

        public Company(String name) {
            this.name = name;
        }

        public boolean add(PayAble p) {
            return arr.add(p);
        }


        @Override
        public double computeAmount() {
            double Salary = 0;
            for(int i = 0; i < arr.size(); i++) {
                Salary += arr.get(i).computeAmount();
            }

            return Salary;
        }

        @Override
        public String toString() {
            return "Company [name=" + name + ", arr=" + arr.toString() + "]";
        }
    }

