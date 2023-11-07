package lab_assignment3;


public abstract class Insurance
{
    protected String typeInsurance;
    protected double monthlyCost;

    public Insurance(){} 
    public Insurance(String typeInsurance) 
    {
        this.typeInsurance = typeInsurance;
       
    }
    public Insurance(String typeInsurance,double monthlyCost) 
    {
        this.typeInsurance = typeInsurance;
        this.monthlyCost = monthlyCost;
    }


    public String getTypeInsurance()
    {
        return typeInsurance;
    }

    public double getMonthlyCost()
    {
        return monthlyCost;
    }

    public abstract void setInsuranceCost(double monthlyCost);

    public abstract void displayInfo();
}


