package src;

/*Write a Java program to calculate the average value of array elements.*/
public class Program22 {
    public static void main(String[] args) {
        int array []= {1,2,3,4,5};
        double sum = 0;
        for (int i=0; i< array.length; i ++){
            sum += array[i];
        }
        System.out.println("Sum of array is:" +sum);

        double average = sum/ array.length;
        System.out.println("Average of array is:" + average);
    }
}

