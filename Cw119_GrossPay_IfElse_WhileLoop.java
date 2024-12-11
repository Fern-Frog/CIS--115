package cw119_grosspay_ifelse_whileloop;

import java.util.Scanner;

/**
 * Anthony Cameron
 * 11-9-2021
 * CW1119_GrossPay_IfElse
 * This program will calculate the gross pay based 
 * on hours worked and pay rate
 * Added while loop to run program again
 * 
 */
public class Cw119_GrossPay_IfElse_WhileLoop 
{

    public static void main(String[] args) 
    {
        String keep_going = "yes";
        while (keep_going.equalsIgnoreCase("yes"))
        {
            Scanner in = new Scanner(System.in);
            System.out.println();
            grossPayWhile();
            System.out.print("Do you want to run the program again? "
                    + "Enter yes or no ");
            keep_going = in.nextLine();
        }
        System.out.println("The program has terminated!");
    }
    public static void grossPayWhile()
    {
        System.out.println("Gross Pay Calculator");
        System.out.println();
        
        // variables
        Scanner in = new Scanner(System.in);
        double grossPay, ovtPay, hours, rate, basePay;
        
        //input
        System.out.print("Enter your hour's worked: ");
        hours = in.nextDouble();
        System.out.print("Enter your pay rate: ");
        rate = in.nextDouble();
        //System.out.println(hours + "\t" + rate);
        // processing or calculations
        if (hours > 40)
        {
            basePay = 40 * rate;
            ovtPay = (hours - 40) * (rate * 1.5);
            grossPay = basePay + ovtPay;
            // alternate statement
            //grossPay = (hours * rate) + (hours - 40) * (rate * 1.5);
            
        }
        else
        {
            grossPay = hours * rate;
        }
        System.out.println("Your gross pay is " + grossPay);
    }
    
}
