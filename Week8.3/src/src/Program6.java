package src;

import java.util.Scanner;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%*/
public class Program6 {
    String name;
    int employeeId;
    double HRA; double TA; double DA;
    double PF; double Grosssalary;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee name");
        String name= sc.next();

        System.out.println("Enter Employee ID");
        int employeeId = sc.nextInt();

        System.out.println("Enter Basic Salary");
        double basicSalary = sc.nextDouble();

        double HRA = 0.10 * basicSalary;
        double TA = 0.08 * basicSalary;
        double DA = 0.09 * basicSalary;
        double PF = 0.20 * basicSalary;
        double GrossSalary = basicSalary + HRA + TA + DA - PF;

        System.out.println("| Salary Slip |");
        System.out.println("| |");
        System.out.println("| |");
        System.out.println("| Employee Id : " + employeeId+ " |");
        System.out.println("| Employee Name : " + name + " |");
        System.out.println("| |");
        System.out.println("| |");
        System.out.println("| Basic Salary : " + basicSalary + " |");
        System.out.println("| HRA 10% : " + HRA + " |");
        System.out.println("| TA 8% : " + TA + " |");
        System.out.println("| DA 9% : " + DA + " |");
        System.out.println("| PF - 20% : " + PF + " |");
        System.out.println("| |");
        System.out.println("| |");
        System.out.println("| Gross Salary : " + GrossSalary + " |");
        System.out.println("|===========================|");



    }

}
