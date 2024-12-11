import java.util.Scanner;
public class M6HW3_Schwab 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        String employeeName; 
        Integer widgetSold, widgetReturn, netWidgetSold;
        Double commissionRate = 0.10, netSales, baseSalary = 500.0; 

        System.out.print("Enter employee's name: ");
        employeeName = in.nextLine(); 

        System.out.print("Enter widgets sold: ");
        widgetSold = in.nextInt();

        System.out.print("Enter widgets return: ");
        widgetReturn = in.nextInt(); 

        netWidgetSold = widgetSold - widgetReturn; 
        netSales = (netWidgetSold * commissionRate) + baseSalary; 

        System.out.println("Employee's name: " + employeeName);
        System.out.println("Net widget sold: " + netWidgetSold);
        System.out.println("Total commission: " + netSales);



    }
}