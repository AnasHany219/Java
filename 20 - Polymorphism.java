package polymorphism;

public class Polymorphism {

    public static class Employee {

        private String name;
        private float salary;

        public Employee(String name, float salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public void print() {
            System.out.println("Employee");
        }
    }

    public static class SalariedEmployee extends Employee {

        float bouns;

        public SalariedEmployee(float bouns, String name, float salary) {
            super(name, salary);
            this.bouns = bouns;
        }

        public float getBouns() {
            return bouns;
        }

        public void setBouns(float bouns) {
            this.bouns = bouns;
        }

        @Override
        public float getSalary() {
            return super.getSalary() + bouns;
        }

        @Override
        public void print() {
            System.out.println("SalariedEmployee");
        }
    }

    public static class DailyEmployee extends Employee {

        private float WorkDayPrice;
        private int DailyRate;

        public DailyEmployee(float WorkDayPrice, int DailyRate, String name, float salary) {
            super(name, salary);
            this.WorkDayPrice = WorkDayPrice;
            this.DailyRate = DailyRate;
        }

        public float getWorkDayPrice() {
            return WorkDayPrice;
        }

        public void setWorkDayPrice(float WorkDayPrice) {
            this.WorkDayPrice = WorkDayPrice;
        }

        public int getDailyRate() {
            return DailyRate;
        }

        public void setDailyRate(int DailyRate) {
            this.DailyRate = DailyRate;
        }

        @Override
        public float getSalary() {
            return WorkDayPrice * DailyRate;
        }

        @Override
        public void print() {
            System.out.println("DailyEmployee");
        }
    }

    public static class HourlyEmployee extends Employee {

        private float WorkDayPrice;
        private int HourlyRate;

        public HourlyEmployee(float WorkDayPrice, int HourlyRate, String name, float salary) {
            super(name, salary);
            this.WorkDayPrice = WorkDayPrice;
            this.HourlyRate = HourlyRate;
        }

        public float getWorkDayPrice() {
            return WorkDayPrice;
        }

        public void setWorkDayPrice(float WorkDayPrice) {
            this.WorkDayPrice = WorkDayPrice;
        }

        public int getDailyRate() {
            return HourlyRate;
        }

        public void setDailyRate(int DailyRate) {
            this.HourlyRate = DailyRate;
        }

        @Override
        public float getSalary() {
            return WorkDayPrice * HourlyRate;
        }

        @Override
        public void print() {
            System.out.println("HourlyEmployee");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Employee Emp = new Employee("Anas", 1000);
        SalariedEmployee SEmp = new SalariedEmployee(500, "Anas", 1000);
        DailyEmployee DEmp = new DailyEmployee(500, 12, "Anas", 1000);
        HourlyEmployee HEmp = new HourlyEmployee(500, 18, "Anas", 1000);
        System.out.println("E1 Salary = " + Emp.getSalary());   // E1 Salary = 1000.0
        System.out.println("E2 Salary = " + SEmp.getSalary());  // E2 Salary = 1500.0
        System.out.println("E3 Salary = " + DEmp.getSalary());  // E3 Salary = 6000.0
        System.out.println("E4 Salary = " + HEmp.getSalary());  // E4 Salary = 9000.0

        Employee E5 = new SalariedEmployee(500, "Anas", 1000);
        E5.print(); // SalariedEmployee -> Dynamic binding | Late binding
    }
}
