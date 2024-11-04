
import java.util.Scanner;
public class cw114methods
 {

    public static void main(String[] args) 
    {
        //call the get while loop method
        getWhileLoop();

    }
    public static void getWhileLoop()
    {
        //System.out.println("Get while Loop Code \n");
        Scanner in = new Scanner(System.in);
        char keep_going = 'y';
        while (keep_going == 'y')
        {

            displayMenu();
            System.out.println();
            System.out.print("Do you want to run the program again? Enter y or n: "); 
            keep_going = in.next().toLowerCase().charAt(0);

        } 
        System.out.println();
        System.out.println("Program has terrinated!");
    }
    public static void displayMenu() 
    {
        System.out.println("\n Menu Program! \n");
        System.out.println("Menu");
        System.out.println();
        System.out.println("1) Option 1 \n2) Option 2 \n3) Option 3 \n4) Exit  ");
        System.out.println();
        System.out.print("Selection: ");
        Scanner in = new Scanner(System.in); 
        switch(in.nextInt())
        {
            case 1: 
                System.out.println();
                System.out.println("You picked Option 1");
                displayMenu();
                break;
            case 2: 
                System.out.println();
                System.out.println("You picked Option 2");
                displayMenu();
                break;
            case 3: 
                System.out.println();
                System.out.println("You picked Option 3");
                displayMenu();
                break;
            case 4: 
                System.out.println();
                System.out.println("Exiting the program!");
                displayMenu();
                break;
            default:
                System.out.println("Unrecognized option...Try again");
                System.out.println();
                displayMenu();

        }
    }
}