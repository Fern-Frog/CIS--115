import java.util.Scanner; 
public class M6HW4_Schwab 
{
    public static void main(String[] args) 
    {
        runProgram();
    }
    public static void runProgram()
    {
        System.out.println("Method Project");
        Scanner in = new Scanner (System.in);
        String again = "yes"; 
        while(again.equalsIgnoreCase("yes"))
        {
            displayMenu();
            System.out.println();
            System.out.print("Do you want to run the program again? Enter yes or no: "); 
            again = in.next();
            System.out.println(); 

        }
    System.out.println("Program has terminated!");    
    }
    public static void displayMenu()
    {
        System.out.println();
        System.out.println("Menu");
        System.out.println();
//change the programs name
        System.out.println("1) calculate gross pay for employee: ");
        System.out.println("2) calculate  homeowner’s monthly bill for water meter: ");
        System.out.println("3) calculate the commission for an employee: ");
        System.out.println("4) Exit: ");
        System.out.println();
        System.out.print("Selection: ");
        Scanner in = new Scanner(System.in);

        switch (in.nextInt())
         {
            case 1:
                getM6HW1();
                displayMenu();
                break;
            case 2:
                getM6HW2();
                displayMenu();
                break;
            case 3:
                getM6HW3();
                System.out.println ( "" );
                displayMenu();
               break;
            case 4:
                System.out.println("");
                System.out.println ( "Exiting the program" );
                break;
            default:
                System.out.println("");
                System.out.println ( "Unrecognized option..Try again" );
                System.out.println("");
                displayMenu();
                //break;
        }
    }

    public static void getM6HW1()
    {
        Scanner in = new Scanner(System.in);
        // add your code here for M6HW1
        
        String employeeName;
        double rate, hours, grossPay; 

        System.out.print("Enter employee's name: ");
        employeeName = in.nextLine();

        System.out.print("Enter the pay rate: ");
        rate = in.nextDouble();

        System.out.print("Enter the number of hours work: ");
        hours = in.nextDouble();

        grossPay = hours * rate;

        System.out.println("Employee's name:" + employeeName);
        System.out.println("Pay rate" + rate);
        System.out.println("Hours work: " + hours);
        System.out.println("Gross pay: " + grossPay);
    }
    public static void getM6HW2()
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
    public static void getM6HW3()
    {
        Scanner in = new Scanner (System.in);
        String employeeName; 
        Integer widgetSold, widgetReturn, netWidgetSold;
        Double commissionRate = 0.10, netSales, baseSalary = 500.0; 

        System.out.print("Enter employee's name: ");
        employeeName = in.nextLine(); 

        System.out.print("Enter widgets sold: ");
        widgetSold = in.nextInt();

        System.out.print("Enter widgets return: ");
        widgetReturn = in.nextInt(); 

        netWidgetSold = widgetSold - widgetReturn; 
        netSales = (netWidgetSold * commissionRate) + baseSalary; 

        System.out.println("Employee's name: " + employeeName);
        System.out.println("Net widget sold: " + netWidgetSold);
        System.out.println("Total commission: " + netSales);
    }


}