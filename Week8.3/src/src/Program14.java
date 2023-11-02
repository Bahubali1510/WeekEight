package src;/*Write a java program to print the numbers between 1 to 100 which can be divided by 3and
5 separately.*/

public class Program14 {
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);    }

        for (int i=1; i<=100;i++)
        {
            if (i%3 ==0){
                System.out.println("Number is devided by 3" + i);
            } else if (i%5 ==0) {
                System.out.println("Number is devided by 5" +i);
            }

            }
        }
}
