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
            System.out.print("Do you want to run the program again? Enter yes oe no: "); 
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
        System.out.println("1) M6HW1: ");
        System.out.println("2) M6HW2: ");
        System.out.println("3) M6HW3: ");
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
                System.out.println("");
                System.out.println ( "You picked M6HW2" );
                System.out.println ( "" );
                displayMenu();
                break;
            case 3:
                System.out.println("");
                System.out.println ( "You picked M6HW3" );
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
        System.out.println("");
        System.out.println("");
        System.out.println ( "You picked M6HW1" );
        System.out.println ( "" );
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
}