package team_questions.employee;

public class BaseSalaryPlusCommitionEmployee extends CommisionEmployeeV2 {
    private double baseSalary;
    public BaseSalaryPlusCommitionEmployee(String firstName,String lastName,String ssn,double grossSales,double commissionPercentage,double baseSalary){
        super(firstName,lastName,ssn,grossSales,commissionPercentage);
        if(baseSalary<0)
            throw new IllegalArgumentException("base salary has to be lager than 0");
        this.baseSalary = baseSalary;
    }
    //Setting Base Salary
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    //Getting Base Salary
    public double getBaseSalary(){
        return baseSalary;
    }

    //Overriding earnings()
    @Override
    public double earning(){
       return baseSalary+super.earning();
    }
    //Overriding toString()
    @Override
    public String toString(){
        return super.toString()+String.format("%s: %.2f%n","base salary",baseSalary);
    }
}
