package randomTask;

import java.util.*;
public class AddingToArrayScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements? (Max is 20)");
        int response = scanner.nextInt();

        while(response >20 || response <= 0){

            System.out.println("Invalid number, try again ");
            response = scanner.nextInt();

        }
        int[] numbers = new int [response];
        fillArrayOfIntegers(numbers);
        printArrayOfIntegers(numbers);
    }

    private static void printArrayOfIntegers(int[] numbers) {
        System.out.println("The elements are: ");
        System.out.println(Arrays.toString(numbers));
    }


    private static void fillArrayOfIntegers(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < numbers.length;i++)
            numbers[i] = scanner.nextInt();

    }
}