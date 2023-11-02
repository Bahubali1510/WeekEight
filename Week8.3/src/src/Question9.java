package src;

import java.util.Scanner;

/* Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
*/
public class Question9 {
    String answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have medical cause? (Y or N)");
        String answer = sc.next();
        if(answer.equals("Y")){
            System.out.println("you are not allow to sit in exam");
        } else if (answer.equals("N")){
                System.out.println("you are not allow to sit in exam");
            }
            else {
                System.out.println("Please enter the valid input yes or no");
            }
        }
    }

