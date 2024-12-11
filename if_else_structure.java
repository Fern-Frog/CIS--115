/**
 * if_else_structure
 */
import java.util.Scanner;
public class if_else_structure 
{

    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        //nested_if_else(k);
        //standard_if_else(k);
       //switch_method();
    }
    public static void nested_if_else(Scanner k)
    {
        double testscore;
        double grade1, grade2, grade3;
        char grade;
        System.out.print("Enter a grade: ");
        grade1 = k.nextDouble();
        System.out.print("Enter a grade: ");
        grade2 = k.nextDouble();
        System.out.print("Enter a grade: ");
        grade3 = k.nextDouble();
        testscore = (grade1 + grade2 + grade3 )/3;
        System.out.println(testscore);
        if (testscore >= 89.5 && testscore <= 100.0)
            {
                grade = 'A';
            }
        else 
            if (testscore >= 79.5 && testscore < 89.5) 
                {
                    grade = 'B';
                }
            else 
                if (testscore >= 69.5 && testscore < 79.5)
                    {
                        grade = 'C';
                    }
                else 
                    if (testscore >= 59.5 && testscore < 69.5)
                        {
                            grade = 'D';
                        }
                    else 
                        if (testscore >=0 && testscore < 59.5)
                        {
                            grade = 'F';
                        }
                        else
                        {
                            grade ='I';
                        }
        System.out.println("Grade is an " + grade);
    }
    public static void standard_if_else(Scanner k)
    {
        int testscore;
        int grade1, grade2, grade3;
        char grade;
        System.out.print("Enter a grade: ");
        grade1 = k.nextInt();
        System.out.print("Enter a grade: ");
        grade2 = k.nextInt();
        System.out.print("Enter a grade: ");
        grade3 = k.nextInt();
        testscore = (grade1 + grade2 + grade3 )/3;
        System.out.println(testscore);
        if (testscore >= 90)
        {
            grade = 'A';
        }
        else if (testscore >= 80)
        {
            grade = 'B';
        }
        else if (testscore >= 70)
        {
            grade = 'C';
        }
         else if (testscore >= 60)
        {
            grade = 'D';
        }
         else 
         {
          grade = 'F';
         }
        System.out.println("Grade is an " + grade);
    }
    
    public static void switch_method()
    {
            int month = 8;
            String monthString;
        switch (month) 
        {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
    }
}

    
