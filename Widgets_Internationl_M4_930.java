/**
 * Alta Schwab 
 * 9/30/2024
 * Widgets_Internationl_M4_930
 * This progrom will calculate the total sales for a sales transaction 
 */
// import sanner utility to get input from the keyboard 
import java.util.Scanner;
 public class Widgets_Internationl_M4_930 
{

    public static void main(String[] args) 
    {
       // variebles 
       int quarter1, quarter2, quarter3, quarter4, annual_widgets; 
       double salesTax, salesAmount, total; 
       //Constant variebles 
       final double TAX = 0.07, PRICE = 4.79; 
       //create scanner varieble to get input from keyboard 
       Scanner keyboard = new Scanner(System.in); 

       //input from the user 
       System.out.print("Enter sales for quarter one: ");
       quarter1 = keyboard.nextInt();
       System.out.print("Enter sales for quarter two: ");
       quarter2 = keyboard.nextInt();
       System.out.print("Enter sales for quarter three: ");
       quarter3 = keyboard.nextInt();
       System.out.print("Enter sales for quarter four: ");
       quarter4 = keyboard.nextInt();
       

       //calculations 
       annual_widgets = quarter1 + quarter2 + quarter3 + quarter4; 
       salesAmount = annual_widgets * PRICE;
       salesTax = salesAmount * TAX; 
       total = salesTax + salesAmount; 

       // output 
       System.out.println("Annual Widgets Sold: " + annual_widgets);
       System.out.println("Widgets Sales Amount: " + salesAmount);
       System.out.println("Sales Tax Collected: " + salesTax); 
       System.out.println("Total Amount: " + total);
       keyboard.close();



       /* 
       System.out.println(quarter1);
       System.out.println(quarter2);
       System.out.println(quarter3);
       System.out.println(quarter4);
       */






    }
}