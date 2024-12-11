import java.util.Scanner;
public class P6HW2_Schwab 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        Integer lastMonth, endMonth, thisMonth;
        String homeownerName; 
        Double perGallon = 0.20, charge;
        final Integer BASEFEE = 50; 

        System.out.print("Enter homeower's name: ");
        homeownerName = in.nextLine();

        System.out.print("Enter the previous month reading: ");
        lastMonth = in.nextInt();

        System.out.print("Enter the reading from the end of this month: ");
        endMonth = in.nextInt();

        thisMonth = endMonth - lastMonth; 
        charge = (thisMonth * perGallon) + BASEFEE; 

        System.out.println("Homeowner's name: " + homeownerName);
        System.out.println("Previous reading: "+ lastMonth);
        System.out.println("Current reading: " + endMonth);
        System.out.println("Charge for this month: $" + charge);

        

    }
}