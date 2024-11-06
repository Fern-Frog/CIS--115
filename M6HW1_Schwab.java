import java.util.Scanner;
public class M6HW1_Schwab 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        String employeeName;
        double rate, hours, grossPay; 

        System.out.print("Enter employee's name: ");
        employeeName = in.nextLine();

        System.out.print("Enter the pay rate: ");
        rate = in.nextDouble();

        System.out.print("Enter the number of hours work: ");
        hours = in.nextDouble();

        grossPay = hours * rate;

        System.out.println();
        System.out.println("Employee's name:" + employeeName);
        System.out.println("Pay rate: " + rate);
        System.out.println("Hours work: " + hours);
        System.out.println("Gross pay: " + grossPay);

    }
}