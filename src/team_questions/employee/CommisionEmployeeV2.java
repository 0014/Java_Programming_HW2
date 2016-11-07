package team_questions.employee;

public class CommisionEmployeeV2 extends Employee {
    private double grossSales;
    private double commissionPercetnage;
    public CommisionEmployeeV2(String firstName,String lastName, String ssn,double grossSales,double commissionPercetnage){
        super(firstName,lastName,ssn);
        if(grossSales<0.0)
            throw new IllegalArgumentException("gross sales has be lager than 0");
        this.grossSales = grossSales;
        if((commissionPercetnage<0)||(commissionPercetnage>1))
            throw new IllegalArgumentException("commission percentage has be less than 1 and larger than 0");
        this.commissionPercetnage = commissionPercetnage;
    }
    public void setCommissionRate(double commissionRate) {
        if ((commissionRate < 0) || (commissionRate >= 1))
            throw new IllegalArgumentException("commision rate has to be >0 and <1");
        this.commissionPercetnage = commissionRate;
    }
    //Setting GrossSales
    public void setGrossSales(double grossSales){
        if(grossSales<0.0)
            throw new IllegalArgumentException("gross sales has to be lager than 0");
        this.grossSales = grossSales;
    }
    
    //Getting Gross Sales
    public double getGrossSales(){
        return grossSales;
    }
    //Getting Comission Percentage
    public double getCommissionPercentage(){
     return commissionPercetnage;
    }
    
    //Overriding earnings()
    public double earning(){
        return grossSales*commissionPercetnage;
    }
    
    //Overriding toString()
    @Override
    public String toString(){
        return super.toString()+String.format("%s: %.2f%n%s: %.2f%n%s: %.2f%n","gross sales",grossSales,"commission rate",commissionPercetnage,"earning",earning());
    }
}
