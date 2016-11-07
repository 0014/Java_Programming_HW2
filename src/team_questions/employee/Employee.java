package team_questions.employee;

public class Employee {
    protected final String firstName;
    protected final String lastName;
    protected final String ssn;

    public Employee(String firstName,String lastName,String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn =ssn;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSocialSecurityNumber() {
       return ssn;
    }
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n","first name",firstName,"last name",lastName,"social security number",ssn);
    }
}
