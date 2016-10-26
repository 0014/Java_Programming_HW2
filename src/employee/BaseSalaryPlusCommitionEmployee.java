package employee;

/**
 * Created by FreakingM on 10/20/2016.
 */
public class BaseSalaryPlusCommitionEmployee extends CommisionEmployeeV2 {
    private double baseSalary;
    public BaseSalaryPlusCommitionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate,double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
        if(baseSalary<0)
            throw new IllegalArgumentException("base salary should be lager than 0");
        this.baseSalary = baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public double earning(){
       return baseSalary+super.earning();
    }
    @Override
    public String toString(){
        return super.toString()+String.format("%s: %.2f%n","base salary",baseSalary);
    }
}
