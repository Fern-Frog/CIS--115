import java.util.Scanner;
public class schwab_practice_final 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        double Rate, Gross_Pay;
        int Hours;


        displayInfo();
        Rate = getRate(in);
        Hours = getHours(in);
        Gross_Pay = calcuateGrossPay(Rate, Hours);
        displayRHGrossPay(Rate, Hours, Gross_Pay);

        
    }
    public static void displayInfo()
    {
        System.out.println("Alta");
        System.out.println("12/4/2024");
        System.out.println("Calculate gross pay of an individual");
    }
    public static double getRate(Scanner in)
    {
        double rate;
        System.out.print("Enter the pay rate: ");
        rate =in.nextDouble();
        return rate;
    }
    public static Integer getHours(Scanner in)
    {
        int hours;
        System.out.print("Enter hours worked: ");
        hours =in.nextInt();
        return hours;
    }
    public static double calcuateGrossPay(Double Rate, Integer Hours)
    {
        double grossPay;
        grossPay = Rate * Hours;
        return grossPay; 
    }
    public static void displayRHGrossPay(Double Rate, Integer Hours, Double Gross_Pay)
    {
        System.out.println("The pay rate is $" + Rate);
        System.out.println("The hours worked are " + Hours);
        System.out.println("The gross pay is $" + Gross_Pay);
    }


}