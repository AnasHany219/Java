package inheritance;

public class Inheritance {

    public static class Employee {

        private String Name;
        private String emailAddress;
        private String phone;
        int YearOfBirth;

        public Employee(){
            System.out.println("No Paramete Constructor");
        }
        public Employee(String Name, String emailAddress, String phone, int YearOfBirth) {
            this.Name = Name;
            this.emailAddress = emailAddress;
            this.phone = phone;
            this.YearOfBirth = YearOfBirth;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getYearOfBirth() {
            return YearOfBirth;
        }

        public void setYearOfBirth(int YearOfBirth) {
            this.YearOfBirth = YearOfBirth;
        }
    }

    public static class Developer extends Employee {

        private String ProjectName;
        
        public Developer(String Name, String emailAddress, String phone, int YearOfBirth, String ProjectName){
            super(Name, emailAddress, phone, YearOfBirth);
            this.ProjectName = ProjectName;
        }
        public String getProjectName() {
            return ProjectName;
        }

        public void setProjectName(String ProjectName) {
            this.ProjectName = ProjectName;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Developer D1 = new Developer("Anas", "anas@gamil.com", "+201012345678", 2003, "JavaCode");
    }
}
