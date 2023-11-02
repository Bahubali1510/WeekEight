package src;

/*Declare multidimensional array and store 5 countries and their capital and print them in
console.*/
public class Program3 {
    public static void main(String[] args) {
        String[][] countriesAndCapital =
                {{"India", "Uk", "Aus", "USA", "NZ"},
                        {"Delhi", "London", "Sydney", "New York", "Auckland"}};

        for (int i = 0; i < countriesAndCapital.length; i++) {
            String country = countriesAndCapital[i][0];
            String capital = countriesAndCapital[i][0];
            System.out.println("Country: " + country + ", Capital: " + capital);


        }
    }

}
