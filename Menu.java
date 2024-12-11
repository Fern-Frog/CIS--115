package cameron_m6cw3;

/**
 * Anthony Cameron
 * cameron_M6CW3
 * 3-29-21
 * The program will generate a menu
 * 
 */
import java.util.Scanner;
public class Menu 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String keep_going = "yes";
        while(keep_going.equalsIgnoreCase("yes"))
        {
            displayMenu();
            System.out.print("Do you want to run the program again? Enter yes or no: ");
            keep_going = in.nextLine();
        }
        System.out.println("The program has terminated!");
    }
    public static void displayMenu()
    {
        //System.out.println("This method is called Display Menu");
        System.out.println("1) Option 1\n2) Option 2\n3) Option 3\n4) Exit");
        System.out.print("Selection: ");
        Scanner in = new Scanner(System.in);
        
        switch(in.nextInt() )
        {
            case 1:
                System.out.println("You picked option 1");
                option1();
                break;
            case 2:
                System.out.println("You picked option 2");
                break;
            case 3:
                System.out.println("You picked option 3");
                break;
            case 4:
                System.out.println("Exiting the menu");
                break;
            default:
                System.out.println("Unreognized option..Try again");
                System.out.println("");
                displayMenu();
                break;
        }
    }
    public static void option1()
    {
        System.out.println("You are in in the option1 method");
    }
    
}

















