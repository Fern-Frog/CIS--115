import java.util.Scanner; 
public class schwabFinalExam
 {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Double cac, adv, mart, saleStaff;
        Integer newC;

        displayInfo();
        adv = getAdvertisingCost(in);
        System.out.println(adv);
        mart = getMarketingCost(in);
        System.out.println(mart);
        saleStaff = getSalesStaffComm(in);
        System.out.println(saleStaff);
        newC = getNewCustomers(in);
        System.out.println(newC);
        cac = calCustomerAcqCost(in,adv, mart, saleStaff, newC);
        System.out.println(cac);
        displayCAC(adv, mart, saleStaff, newC,cac);

        
    }
    public static void displayInfo()
    {
        System.out.println("Alta Schwab");
        System.out.println("12/11/2024");
        System.out.println("schwabFinalExam");
        System.out.println("calculating the customer acquisition cost, with input from the user ");
    }
    public static double getAdvertisingCost(Scanner in)
    {
        double totalCost; 
        System.out.print("Enter the advertising cost: ");
        totalCost = in.nextDouble();
        return totalCost;
    }
    public static double getMarketingCost(Scanner in)
    {
        double mart, totalMart=0; 
        Integer count; 

        for (count=1; count <= 4; count++)
        {
            System.out.print("Enter marketing cost for employee " + count + ": ");
            mart = in.nextDouble();
            totalMart += mart;
        }
    return totalMart;
    }
    public static double getSalesStaffComm(Scanner in)
    {
        double totalComm=0, comm; 
        Integer count=1, times; 
        System.out.print("How many sales staff commissions do you want to enter in: ");
        times = in.nextInt();
        do
        {
            System.out.print("Enter sales staff commissions " + count + ": ");
            comm = in.nextDouble();
            totalComm += comm;
            count++;
        }
        while (count <= times);
        return totalComm;
    }
    public static Integer getNewCustomers(Scanner in)
    {
        Integer newC;
        System.out.print("Enter the number of new customers: ");
        newC = in.nextInt();
        return newC;
    }
    public static double calCustomerAcqCost(Scanner in,double adv,double mart,double saleStaff,Integer newC)
    {
        double cac;
        cac = (adv + mart + saleStaff) / newC;
        return cac;
    }
    public static void displayCAC(double adv,double mart,double saleStaff,Integer newC,double cac)
    {
        System.out.println("Advertising Cost: $" + adv);
        System.out.println("Marking Personnel Salaries: $" + mart);
        System.out.println("Sales Staff Commissions: $" + saleStaff);
        System.out.println("New Customers Acquired: " + newC);
        System.out.println("Customer Acquisition Cost: $" + cac);
    }
}