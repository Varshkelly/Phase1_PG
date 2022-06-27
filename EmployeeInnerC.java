public class EmployeeInnerC {

    int salary = 2000;
    public class PermEmployee extends EmployeeInnerC{
        String code="PE05";
        double hike=45;
        
        public void new_salary() {
            double newSalary;
            newSalary=((hike*salary)/100)+salary;
            System.out.println("New Salary = "+newSalary);
        }
        public void display() {	
            System.out.println("Current Salary = " +salary+"\ncode = "+code+"\nHike percentage = "+hike+"%");
        }
        }
    
    public class TempEmployee extends EmployeeInnerC{
        
        String code="TE01";
        double hike=30;
                public void new_salary() {
                    double newSalary;
                    newSalary=((hike*salary)/100)+salary;
                    System.out.println("New Salary = "+newSalary);
        }
        public void display() {	
            System.out.println("Current Salary = " +salary+"\ncode = "+code+"\nHike percentage = "+hike+"%");
        }
        }
    void role() {
    class ContractEmployee extends EmployeeInnerC{
        String code="CE01";
        double hike=30;
                public void new_salary() {
                    double newSalary;
                    newSalary=((hike*salary)/100)+salary;
                    System.out.println("New Salary = "+newSalary);
        }
        public void display() {	
            System.out.println("Current Salary = " +salary+"\ncode = "+code+"\nHike percentage = "+hike+"%");
        }
    }
    ContractEmployee c =new ContractEmployee();
    c.new_salary();
    c.display();
    }
    public static void main(String[] args) {
        EmployeeInnerC e=new EmployeeInnerC();
        EmployeeInnerC.PermEmployee p=e.new PermEmployee();
        EmployeeInnerC.TempEmployee t=e.new TempEmployee();
        p.new_salary();
        p.display();
        System.out.println("_______*********__________");
        t.new_salary();
        t.display();
        System.out.println("_______*********__________");
        e.role();
    }
    }