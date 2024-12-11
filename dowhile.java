import java.util.Scanner;
public class dowhile 
{

    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        char choice = 'y';
        
        while(choice == 'y')
        {
            int num, count = 1, total = 0, value;
            System.out.println("Do While example");
            System.out.print("How many numbers would you like to add together? ");
            num = k.nextInt();
            do 
            {
                System.out.print("Enter number " + count + ": ");
                value = k.nextInt();
                total += value;
                count++;
                
            } while (count <= num);
            
            System.out.println(total);
            System.out.println(count);
            System.out.print("Run program again? Enter y/n: ");
            choice = k.next().charAt(0);
            choice = Character.toLowerCase(choice);
        }
        System.out.println("Program has exited");
    }
}