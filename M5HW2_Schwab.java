/**
 * Alta Schwab 
 * M5HW2_Schwab
 * 30/10/2024
 * Updated Widget salary program to inclued loops
 */
import java.util.Scanner;
public class M5HW2_Schwab {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in); 
        String again = "yes"; 

        while(again.equalsIgnoreCase("yes"))
        {

        String salesPerson; 
        int widgetSold = 0, returnWidgets = 0, sum_widget_sold = 0, sum_widget_return = 0, count; 
        double netWigetsSold, widgetSalesAmount, commissionRate, commissionAmount, baseSalery = 2000, monthlySalary; 
        final double WIDGETSPRICE = 4.79; 

        System.out.print("Enter your name: "); 
        salesPerson = k.next(); 

        for (count = 1; count <=4; count++)
        {
            System.out.print("Enter widgets sold in week" + count + ": " );
            widgetSold = k.nextInt(); 
            sum_widget_sold += widgetSold; 
        }

        System.out.println();

        for (count = 1; count <=4; count++)
        {
            System.out.print("Enter widgets returned in week" + count + ": ");
            returnWidgets = k.nextInt();
            sum_widget_return += returnWidgets; 
        }

        System.out.println();

        netWigetsSold = sum_widget_sold - sum_widget_return;

 /* 
       System.out.print("Enter widgets sold this month: "); 
       widgetSold = k.nextInt();

       System.out.print("Enter widgets return this month: "); 
       returnWidgets = k.nextInt();

       netWigetsSold = widgetSold - returnWidgets;
*/ 
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