package src;/*Same as above program-8 using switch statement.*/

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
            double number;
            int sign;
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter the number");
            double number1 = sc.nextDouble();

        if (number1 > 0) {
            sign = 1;
        } else if (number1 < 0) {
            sign = -1;
        } else {
            sign = 0;
        }

            switch (sign){
                case 1:
                    System.out.println("Number is positive");
                    break;
                case -1:
                    System.out.println("Number is negative");
                    break;
                case 0:
                        System.out.println("Number is zero");
                        break;
            }
    }
}
