package src;

import java.util.Scanner;

/*Take input of age of 3 people by user and determine oldest and youngest among
them.*/
public class Question7 {
    int person1;
    int person2;
    int person3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of person1");
        int person1 = sc.nextInt();
        System.out.println("Enter age of person2");
        int person2 = sc.nextInt();
        System.out.println("Enter age of person3");
        int person3 = sc.nextInt();

        if (person1 == person2 && person2 == person3) {
            System.out.println("You all have same age");
        } else if (person1 > person2 && person1 > person3) {
            System.out.println("person1 is oldest");

        } else if (person2 > person1 && person2 > person3) {
            System.out.println(" person2 is oldest ");
        } else if (person3 > person2 && person3 > person1) {
            System.out.println("Person3 is oldest");
        } else {
            System.out.println("other person is youngest among three");
        }
        if (person1 < person2 && person1 < person3) {
            System.out.println("Person1 is youngest");
        } else if (person2 < person1 && person2 < person3) {
            System.out.println("Person2 is youngest");
        } else if (person3 < person2 && person3 < person1) {
            System.out.println("Person3 is youngest");
        } else {
            System.out.println("There is more than one person with the same age, and they are the youngest.");
        }
    }
}
