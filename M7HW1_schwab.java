import java.util.Scanner;

public class M7HW1_schwab {

    public static void main(String[] args) 
    {
        runProgram();
    }
    public static void runProgram()
    {
        Scanner in = new Scanner(System.in);
        String keep_going = "yes";
        while(keep_going.equalsIgnoreCase("yes"))
            {
                displayInfo();
                String name; 
                int wid_sales, wid_return, wid_sold;
                double salesAmt, comm, salary, commRate;
                final double WIDGETSPRICE = 4.79, BASESALERY = 2000;
                name = getEmpName(in);
                wid_sales = getSales(in);
                wid_return = getReturns(in);
                wid_sold = calWidSold(wid_sales, wid_return);
                salesAmt = calWidSalesAmt(wid_sold, WIDGETSPRICE);
                commRate = calCommRate(wid_sales);
                comm = calComm(salesAmt, commRate);
                salary = calSalary(comm, BASESALERY);
                displayValue(name, wid_sales, wid_return, wid_sold, salesAmt, comm, salary);
                // all calls to your function/methods should come from runProgram()  method only
                System.out.println();
                System.out.print("Do you want to run the program again? Enter yes or no: ");
                keep_going = in.next();
                System.out.println();
            }
    in.close();
    System.out.println("Program has terminated!");
    }
    public static void displayInfo()
    {
        System.out.println();
        System.out.println("Your name");
        System.out.println();
        System.out.println("Program Description");
        System.out.println();
        

    }
    public static String getEmpName(Scanner in)
    {
        String EmpName;
        System.out.print("Enter salaes person's name: ");
        EmpName = in.nextLine();
        return EmpName;

    }
    public static int getSales(Scanner in)
    {
        int widgetSold, sum_widget_sold = 0, count;
        for (count = 1; count <=4; count++)
        {
            System.out.print("Enter widgets sold in week" + count + ": " );
            widgetSold = in.nextInt(); 
            sum_widget_sold += widgetSold; 
        }
        return sum_widget_sold;
    }
    public static int getReturns(Scanner in)
    {
        int returnWidgets, sum_widget_return = 0, count; 
        for (count = 1; count <=4; count++)
        {
            System.out.print("Enter widgets returned in week" + count + ": ");
            returnWidgets = in.nextInt();
            sum_widget_return += returnWidgets; 
        }
        return sum_widget_return;
    }
    public static int calWidSold(int wid_sales, int wid_return)
    {
        int netWigetsSold;
        netWigetsSold = wid_sales - wid_return;
        return netWigetsSold;
    }
    public static double calWidSalesAmt(int wid_sales, double WIDGETSPRICE)
    {
        double widgetSalesAmount;
        widgetSalesAmount = wid_sales * WIDGETSPRICE; 
        return widgetSalesAmount;
    }
    public static double calCommRate(int wid_sales)
    {
        double commissionRate;
        if (wid_sales > 0 && wid_sales < 100) 
        {
             commissionRate = 0.10;  
        }
        else 
             if (wid_sales < 199)
             {
                 commissionRate = 0.15; 
             }
             else 
                 if (wid_sales < 299)
                 {
                     commissionRate = 0.20; 
                 }
                 else 
                 
                     {
                         commissionRate = 0.25; 
                     }
        return commissionRate;
    }
    public static double calComm(double salesAmt, double commRate)
    {
        double commissionAmount;
        commissionAmount = commRate* salesAmt; 
        return commissionAmount;
    }
    public static double calSalary(double comm, double BASESALERY)
    {
        double monthlySalary;
        monthlySalary = comm + BASESALERY;
        return monthlySalary;
    }
    public static void displayValue(String name,int wid_sales,int wid_return,int wid_sold,double salesAmt,double comm,double salary)
    {
        System.out.println("Sales Person: " + name);
        System.out.println("Widgets Sold: " + wid_sales);
        System.out.println("Widgets Returned: " + wid_return);
        System.out.println("Net Widgets Sold: " +  wid_sold);
        System.out.println("Widgets Sales Amount: $" + salesAmt);
        System.out.println("Commission Amount: $" +  comm);
        System.out.println("Monthly Salary: $" +  salary);
    }


    // create your functions/methods here
}