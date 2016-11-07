package team_questions.employee;


public class BaseSalaryPlusCommitionEmployeeTest {
    public static void main(String[]args){
        BaseSalaryPlusCommitionEmployee testObject = new BaseSalaryPlusCommitionEmployee("Justin", "Langer", "341-36-4127",5000,.04,300);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%s %s%n","first name is",testObject.getFirstName());
        System.out.printf("%s %s%n","last name is",testObject.getLastName());
        System.out.printf("%s %s%n","social security number is",testObject.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n","gross sales is",testObject.getGrossSales());
        System.out.printf("%s %.2f%n","commission rate is",testObject.getCommissionPercentage());
        System.out.printf("%s %.2f%n","base salary is",testObject.getBaseSalary());

        testObject.setBaseSalary(1000);

        System.out.printf("%n%s:%n%n%s%n","Updated employee infomation obtained by toString",testObject);
    }
}
