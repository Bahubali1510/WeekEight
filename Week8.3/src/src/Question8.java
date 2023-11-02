package src;/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/

import java.util.Scanner;

public class Question8 {
    int classes;
    int attendance;
    double percentage;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of classes held");
        int classes = sc.nextInt();
        System.out.println("Number of classes attended");
        int attendance = sc.nextInt();
        double percentage = (attendance / classes) * 100;

        if (percentage < 75) {
            System.out.println("Student will not allowed in exam");
        } else{
            System.out.println("Student will allow to give exam");
        }
    }
}