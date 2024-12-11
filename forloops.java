import java.util.Scanner;
public class forloops
{

    public static void main(String[] args) 
    {
       
        Scanner k = new Scanner(System.in);
        String choice = "yes";
        while(choice.equalsIgnoreCase("yes"))
        {
            // for loop examples
            //callForLoop();
            //callNumberSquared();
            //callTotal();
            callForClock();
            System.out.print("Run program again? Enter yes or no: ");
            choice = k.nextLine();
        }
        System.out.println("Program has exited");
        
    }
    public static void callForLoop()
    {
        int count;
        for (count = 0; count < 5; count++)
        {
            System.out.println(count + "\t" + "Test");
        }
        System.out.println(count);
    }
    public static void callNumberSquared()
    {
       int number;
        for (number = 10; number >= 1; number--)
        {
            System.out.println(number + "\t\t" + number * number);
        }
        System.out.println(number); 
    }
    public static void callTotal()
    {
       int number, total = 0;
        for (number = 1; number <= 5; number++)
        {
            total = number + total;
            System.out.println(number + "\t" + total);
        }
         
    }
    public static void callForClock()
    {
       int hours, minutes, seconds;
        for (hours = 0; hours <= 23; hours++)
        {
            for (minutes = 0; minutes <= 59; minutes++)
            {
                for (seconds = 0; seconds <= 59; seconds++)
                    {
                        System.out.println(hours + ":" + minutes + ":" + seconds);
                    }
            }
            
        }
         
    }
    
}
    
