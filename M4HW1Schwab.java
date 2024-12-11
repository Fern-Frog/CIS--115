/**
 * M4HW1Schwab
 * Alta Schwab 
 * M4HW1 
 * 10/9/2024
 * Getting the monthly salary of a widget sales person  
 */
import java.util.Scanner;
public class M4HW1Schwab
{
    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in); 
        String again = "yes"; 

        while(again.equalsIgnoreCase("yes"))
        {

        String salesPerson; 
        int widgetSold, returnWidgets; 
        double netWigetsSold, widgetSalesAmount, commissionRate, commissionAmount, baseSalery = 2000, monthlySalary; 
        final double WIDGETSPRICE = 4.79; 

        System.out.print("Enter your name: "); 
        salesPerson = k.next(); 

       System.out.print("Enter widgets sold this month: "); 
       widgetSold = k.nextInt();

       System.out.print("Enter widgets return this month: "); 
       returnWidgets = k.nextInt();

       netWigetsSold = widgetSold - returnWidgets;

       if (netWigetsSold > 0 && netWigetsSold < 100) 
       {
            commissionRate = 0.10;  
       }
       else 
            if (netWigetsSold < 199)
            {
                commissionRate = 0.15; 
            }
            else 
                if (netWigetsSold < 299)
                {
                    commissionRate = 0.20; 
                }
                else 
                
                    {
                        commissionRate = 0.25; 
                    }

        widgetSalesAmount = netWigetsSold * WIDGETSPRICE; 
        commissionAmount = commissionRate * widgetSalesAmount; 
        monthlySalary = commissionAmount + baseSalery; 
        
        
        System.out.println("Sales Person: "+ salesPerson);
        System.out.println("Net Widgets Sold: "+ netWigetsSold);
        System.out.println("Widgets Sales Amount: "+ widgetSalesAmount);
        System.out.println("Commission Amount: "+ commissionAmount);
        System.out.println("Monthly Salary: "+ monthlySalary); 

        System.out.print("Would you like to run this progarm again? Enter yes or no: ");
        again = k.next(); 


        }
        System.out.println("Program has exited");


// System.out.println(salesPerson);
 //System.out.println(widgetSold);
 //System.out.println(returnWidgets);

    }

    
}