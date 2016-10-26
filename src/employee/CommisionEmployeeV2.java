package employee;

/**
 * Created by FreakingM on 10/20/2016.
 */
public class CommisionEmployeeV2 extends Employee {
    private double grossSales;
    private double commissionRate;
    public CommisionEmployeeV2(String firstName,String lastName, String socialSecurityNumber,double grossSales,double commissionRate){
        super(firstName,lastName,socialSecurityNumber);
        if(grossSales<0.0)
            throw new IllegalArgumentException("gross sales should be lager than 0");
        this.grossSales = grossSales;
        if((commissionRate<0)||(commissionRate>1))
            throw new IllegalArgumentException("commission rate should be less than 1 and larger than 0");
        this.commissionRate = commissionRate;
    }
    public void setCommissionRate(double commissionRate) {
        if ((commissionRate < 0) || (commissionRate >= 1))
            throw new IllegalArgumentException("commision rate must >0 and <1");
        this.commissionRate = commissionRate;
    }
    public void setGrossSales(double grossSales){
        if(grossSales<0.0)
            throw new IllegalArgumentException("gross sales should be lager than 0");
        this.grossSales = grossSales;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public double getCommissionRate(){
     return commissionRate;
    }
    public double earning(){
        return grossSales*commissionRate;
    }
    @Override
    public String toString(){
        return super.toString()+String.format("%s: %.2f%n%s: %.2f%n%s: %.2f%n","gross sales",grossSales,"commission rate",commissionRate,"earning",earning());
    }
}
