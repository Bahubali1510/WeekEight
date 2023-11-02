package src;

import java.util.Scanner;

/*Write a Java program which input any number between 1 to 7 and it print The Daysname
MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.*/
public class Program16 {
    public static void main(String[] args) {
        int day ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter week days from 1 to 7");
        int days = sc.nextInt();

                switch (days){
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Week contains only 1 to 7 days");
                }

    }
}
