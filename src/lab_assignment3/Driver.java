package lab_assignment3;

import java.util.Scanner;
import java.util.ArrayList;
public class Driver
{
    public static void main(String[] args)
    {
        ArrayList<Insurance> insurances = new ArrayList<>();
        Scanner input = new Scanner(System.in);

            System.out.println("Please input your Insurance Type(Health/Life): ");
            String type = input.nextLine();
            if (type.equalsIgnoreCase("health")) {
                Health health = new Health();
                System.out.println("Please input your monthly fee: ");
                health.setInsuranceCost(input.nextDouble());
                health.displayInfo();
                insurances.add(health);
            } else if (type.equalsIgnoreCase("life")) {
                Life life = new Life();
                System.out.println("Please input your monthly fee: ");
                life.setInsuranceCost(input.nextDouble());
                life.displayInfo();
                insurances.add(life);
            } else {
                System.out.println("Wrong Input!");
            }

            Insurance user2 = new Life(); 
            user2.setInsuranceCost(2000);
            insurances.add(user2);

            Insurance user3 = user2; 
            insurances.add(user3);


        System.out.println("\n\nList of Insurances!");
        for (Insurance insurance: insurances)
        {
         insurance.setInsuranceCost(insurance.getMonthlyCost() + 999);
         insurance.displayInfo();
        }
    }
}
