package src;/*Declare array and store any 5 countries and print them in console.*/

public class Program2 {
    public static void main(String[] args) {
        String[] countries = {"India, Uk, Aus, USA, NZ"};
        System.out.println("List of the countries");
        for (int i = 0; i < countries.length; i++){
            System.out.println(countries[i]);
        }
    }

}
