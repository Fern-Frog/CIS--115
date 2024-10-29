
/**
 * M5HW1_Schwab
 */
import java.util.Scanner;
public class M5HW1_Schwab 

{
    public static void main(String[] args)
    {
        String again = "yes";

        while (again.equalsIgnoreCase("yes")); 
        {

        double average = 90;
        char grade;
        Scanner k = new Scanner(System.in);


        int num_grades, count = 1, grade_num, sum = 0; 

        System.out.print("How many grades would you like to be average? ");
        num_grades = k.nextInt();

        do 
        {
            System.out.print("Enter grade" + count + ": ");
            grade_num = k.nextInt();
                while ( grade_num < 0 || grade_num > 100)
                {
                    System.out.println("Invalid grade");
                    System.out.print("Reenter grade: ");
                    grade_num = k.nextInt();
                }
            sum += grade_num; 
            count++; 


        } while (count <= num_grades);

        average = sum / num_grades;

    
            if (average >= 90)
                {
                    grade = 'A';
                }
            else if (average >= 80)
                {
                    grade = 'B';
                }
            else if (average >= 70)
                {
                    grade = 'C';
                }
            else if (average >= 60)
                {
                    grade = 'D';
                }
            else
                {
                    grade = 'F';
                }
            
            System.out.println("Grade is " + grade);

            System.out.print("Would you like to run this program again? Enter yes or no: ");
            again = k.next();
    }
    System.out.println("Program has exited");
}
}