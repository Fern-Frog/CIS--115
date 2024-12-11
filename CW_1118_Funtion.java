import java.util.Scanner;
public class CW_1118_Funtion 
{

    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        //System.out.println("Alta");
        double area;
        displayInfo();
        area = getArea(k);
        //System.out.println(area);
        displayArea(area);
        k.close();


    }
    public static void displayInfo()
    {
        System.out.println("");
        System.out.println("Alta Schwab");
        System.out.println("11-18-2024");
        System.out.println("cw111824.java");
        System.out.println("This program will demo methods and functions");
        System.out.println("");
    }
    public static double getArea(Scanner k)
    {
        
        double area;
        System.out.print("Enter the area of the square: ");
        area = k.nextDouble();
       
        return area;
    }
    public static void displayArea(double areaSquare)
    {
        System.out.println("The area of the square is " + areaSquare);
    }
    
}


