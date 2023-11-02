package src;/* Print multiplication table of 24, 50 and 29 using loop.*/

public class Question2 {
    public static void main(String[] args) {
        int number1= 24;
        int number2= 50;
        int number3= 29;
        int i;

        for(i=1; i<=10; i++){
            System.out.println(number1 + "*" + i +"=" + (number1*i));

        }
        for(i=1; i<=10; i++){
            System.out.println(number2 + "*" + i +"=" + (number2*i));

        }
        for(i=1; i<=10; i++){
            System.out.println(number3 + "*" + i +"=" + (number3*i));

        }
    }
}