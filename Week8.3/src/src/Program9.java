package src;/*Write java program using for loop and print your group name 10 times.*/

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        String group_name;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your group name");
        String group = sc.next();
        for(i=0; i<10; i++){
            System.out.println("Group Name:" + group);
        }
    }
}
