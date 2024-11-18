import java.util.Scanner;
public class CW1118_Funtioncn_grade 
{


    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        //System.out.println("Alta");
        displayInfo();
        int number, total;
        double avergae;
        number = getNumGrades(k);
        total = getTotal(k, number);
        avergae = getAvergae(number, total);
        displayValue(number, total, avergae);


        k.close();

    }
    public static void displayInfo()
    {
        System.out.println("");
        System.out.println("Alta Schwab");
        System.out.println("11-18-2024");
        System.out.println("cw1118grades.java");
        System.out.println("This program will determin the student's average and grade using functions");
        System.out.println("");
    }
    public static int getNumGrades(Scanner k)
    {
        int num;
        System.out.print("Enter number of grades to average: ");
        num = k.nextInt();
        return num; 
    }
    public static int getTotal(Scanner k, int num)
    {
        int i, grade, total=0;
        for(i=0; i < num; i++)
        {
            System.out.print("Enter a grade: ");
            grade = k.nextInt();
            total += grade; 
        }

        return total; 
    }
    public static double getAvergae(int num, double tot)
    {
        return tot / num;
    }

    public static void displayValue(int num, int total, double average)
    {
        System.out.println("Number of grades is " + num);
        System.out.println("Total of grades is " + total);
        System.out.println("Average of grades is " + average);

    }
}