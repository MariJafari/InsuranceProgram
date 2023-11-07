package lab_assignment3;

public class Life extends Insurance
{
    public Life ()
    {
        super("Life");
    }

    @Override
    public void setInsuranceCost(double monthlyCost) {
    super.monthlyCost = monthlyCost;
    }

    @Override
    public void displayInfo()
    {
        System.out.printf("\nInsurance Type: %s %nMonthly Cost: %.2f",getTypeInsurance(),getMonthlyCost());
    }
    
}
