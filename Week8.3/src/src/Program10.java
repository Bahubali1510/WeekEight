package src;

import java.util.Scanner;

/*Write a java program input sales id, seller's name, sales amount, and salary basic and then
fined this sales*/
public class Program10 {
    public static void main(String[] args) {
        double sales_id;
        String seller_name;
        double sales_amount;
        double salary_basic;
        double CommissionRate;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your sales id");
         sales_id = sc.nextDouble();

        System.out.println("Enter your seller name");
        seller_name= sc.next();

        System.out.println("Enter sales amount");
        sales_amount = sc.nextDouble();

        System.out.println("Enter basic salary");
        salary_basic= sc.nextDouble();

    if (sales_amount >= 50000){
    CommissionRate = 0.35;
        } else if (sales_amount >=30000) {
        CommissionRate = 0.20;
    } else if (sales_amount >=20000) {
        CommissionRate = 0.10;
    }
    else if (sales_amount >=10000) {
        CommissionRate = 0.5;
    }
    else if (sales_amount<10000) {
        CommissionRate = 0.2;
    }
        else{
            CommissionRate = 0.0;
        }

            double commission = sales_amount * CommissionRate;
            double totalSalary = salary_basic + commission;

            System.out.println("Sales ID: " + sales_id);
            System.out.println("Seller Name: " + seller_name);
            System.out.println("Sales Amount: " + sales_amount);
            System.out.println("Basic Salary: " + salary_basic);
            System.out.println("Commission Rate: " + (CommissionRate * 100) + "%");
            System.out.println("Commission: " + commission);
            System.out.println("Total Salary: " + totalSalary);
        }
    }



