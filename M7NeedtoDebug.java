/**
 * M7Debug original file that is correct
 * Debug the java file to make sure it will execute correctly
 * The program asks the user for two values (a and b where c is the third value) for a right triangle to get the area and hypotenuse
 * The program will use methods and functions
 * You will need to debug the functions and methods
 * use the value 5 for Side A
 * Use the value 12 for side B
 * Thus, 13 should be value you will receive for hypotenuse
 */
import java.util.Scanner;
public class M7NeedtoDebug 
{

    public static void main(String[] args)
    {
        runMenu();
    }
    public static void runMenu()
    {
        Scanner in = new Scanner(System.in);
        String keep_going = "yes";
        while(keep_going.equalsIgnoreCase("yes"))
            {
                
                int sideA = getSideA(in);
                int sideB = getSideB(in);
                int area = calArea(sideA,sideB);
                double hyptoenuse = calHypotenuse(sideA,sideB);
                displayValues(sideA, sideB, area, hyptoenuse);
                
                System.out.println();
                System.out.print("Do you want to run the program again? Enter yes or no: ");
                keep_going = in.next();
                System.out.println();
            }
    in.close();
    System.out.println("Program has terminated!");
    }
    public static void display()
    {
        System.out.println();
        System.out.println("Your name");
        System.out.println();
        

    }
    public static int getSideA(Scanner in )
    {
       System.out.print("Enter side A of the right triangle: ");
        int sideA = in.nextInt();
       return sideA; 
    }
    public static int getSideB(Scanner in )
    {
       System.out.print("Enter side B of the right triangle: ");
        int sideB = in.nextInt();
       return sideB; 
    }
    public static Integer calArea( int a, int b )
    {
       return (a*b)*2; 
    }
    public static double calHypotenuse( double a, double b )
    {
        // hypotenuse must be double in the Math.hypot() function so values are received as double not integers
        // this function has no errors
       return Math.hypot(a, b); 
       
    }
    public static void displayValues(int sideA,int sideB,int area,double hypotenuse)
    {
        System.out.println();
        System.out.println("Side A is " + sideA);
        System.out.println("Side B is " + sideB);
        System.out.println("Area is " + area);
        System.out.println("Hypotenuse is " + hypotenuse);
        System.out.println();
    }

}