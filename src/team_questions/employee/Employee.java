package team_questions.employee;

/**
 * Created by FreakingM on 10/20/2016.
 */
public class Employee {
    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;

    public Employee(String firstName,String lastName,String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber =socialSecurityNumber;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSocialSecurityNumber() {
       return socialSecurityNumber;
    }
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n","first name",firstName,"last name",lastName,"social security number",socialSecurityNumber);
    }
}
