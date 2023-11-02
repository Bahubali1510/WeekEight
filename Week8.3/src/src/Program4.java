package src;

import java.util.Scanner;

/*Write if else condition and print your group name in console else others group name.*/
public class Program4 {

    public static void main(String[] args){
        String Group= "Codebuster";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your group name");
        String yourGroup = sc.next();

if ("Codebuster".equals(yourGroup)){
    System.out.println("This is your group");
}
else {
    System.out.println("Other Group");
}
    }
}
