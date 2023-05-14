import java.util.Scanner;
public class JFT4Ex3 {
    public static void main(String args[]){
        String employeeName = "";
        String ppsNum="1245141TA";
        String department="IT";
        int hoursWorked=0;
        int hoursOvertime=0;
        final double HOURRATE = 29.35;
        final double OVERTIME = HOURRATE * 1.5;

        //Objects
        Scanner keyboard = new Scanner(System.in);

        //Input
        System.out.println("Please enter your name: ");
        employeeName = keyboard.nextLine();

        System.out.println("Please enter your PPS Number: ");
        ppsNum = keyboard.nextLine();

        System.out.println("Please enter your department: ");
        department = keyboard.nextLine();

        System.out.println("Please enter your hous worked on normal time: ");
        hoursWorked = keyboard.nextInt();

        System.out.println("Please enter your hous worked on overtime: ");
        hoursOvertime = keyboard.nextInt();

        
        //Compute
        double grossPay = (hoursWorked*HOURRATE)+(hoursOvertime*OVERTIME);
        double taxPayable = ((hoursWorked*HOURRATE)+(hoursOvertime*OVERTIME))*0.35;
        double netPay= grossPay - taxPayable;

        //Output

        System.out.println("********************** Salary Report **********************");
        System.out.println();

        System.out.println("********************** Employee Details **********************");
        System.out.println("Employee name: " +employeeName);
        System.out.println("Employee PPS No: " +ppsNum);
        System.out.println("Employee Department: " +department);
        System.out.println();

        System.out.println("********************** Hours Worked **********************");
        System.out.println("No. of basic hours worked: " +hoursWorked);
        System.out.println("The hourly rate of basic pay is: " +HOURRATE);
        System.out.println("Basic salary: " + (hoursWorked*HOURRATE));
        System.out.println("No. of overtime hours worked: " + hoursOvertime);
        System.out.println("The hourly rate of overtime pay is at time and a half");
        System.out.println("Overtime salary: " + (hoursOvertime*OVERTIME));
        System.out.println();

        keyboard.close();
        
        System.out.println("********************** Take home Pay **********************");
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Income Tax Payable: " + taxPayable);
        System.out.println("Net Pay: " + netPay);

    


    }
}
