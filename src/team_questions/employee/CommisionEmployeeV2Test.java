package team_questions.employee;

/**
 * Created by FreakingM on 10/20/2016.
 */
public class CommisionEmployeeV2Test {
    public static void main(String[]args){
        CommisionEmployeeV2 empObject = new CommisionEmployeeV2( "Gerald", "Jones", "712-63-5277",10000,.06);

        System.out.println("Employee information by get methods:");
        System.out.printf("%s %s%n","first name is",empObject.getFirstName());
        System.out.printf("%s %s%n","last name is",empObject.getLastName());
        System.out.printf("%s %s%n","social security number is",empObject.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n","gross sales is",empObject.getGrossSales());
        System.out.printf("%s %.2f%n","commission rate is",empObject.getCommissionPercentage());

        empObject.setGrossSales(5000);
        empObject.setCommissionRate(.1);

        System.out.printf("%n%s:%n%n%s%n","Updated employee infomation by toString",empObject);
    }
}