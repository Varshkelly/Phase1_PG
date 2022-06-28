//Custom Exception Assign.
import java.util.Scanner;

public class CustomException{

    static void validate(int salary) throws SalaryException {
        if (salary< 2100){
            throw new SalaryException ("you need to work hard");
        }
        else{
            System.out.println("valid");
        }
        if (salary >= 2100 && salary <= 5000 ){
            throw new SalaryException("your salary is somehow good");
        }
        else{
            System.out.println("valid");
        }
        if (salary >= 5100 && salary <= 9000 ){
            throw new SalaryException("your salary is very good");
        }
            else{
                System.out.println("valid");
        }
    }
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int salary = sc.nextInt();
            System.out.println("Enter Salary: "+ salary);
            validate(salary);
        }
        catch (Exception m){
            System.out.println("Exception occured: " + m.getMessage());
        }
        System.out.println("rest of the code........");
    }

}


//creating exception 1st
class SalaryException extends Exception{
    SalaryException(String s){
        super(s);
    }
}
