package ChapterSeven;

import java.util.Random;
import java.util.Scanner;

public class ReverseNumberEntered {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


    }

    public static void reverseNumber(int userInput) {
        Scanner input = new Scanner(System.in);
        System.out.println("please, enter the number of integers you want to appear in reverse order. enter -1 to stop input: ");
        int array = input.nextInt();


        int[] reverseNumber = new int[array];
        do {
            System.out.println("please, enter the integers you want to enter: ");
            userInput = input.nextInt();
            for (int i = reverseNumber.length - 1; i >= 0; i--) {
                reverseNumber[i] = i;
            }

        } while (array != -1);

    }

    public static void occurrenceOfNumbers(int userInput){
        Scanner input = new Scanner(System.in);
        System.out.println("please, enter the number of integers you want to appear in reverse order. enter 0 to stop input: ");
        int occurrence = input.nextInt();

        int[] reverseNumber = new int[occurrence];

        do {
            System.out.println("please, enter the integers you want to enter: ");
            userInput = input.nextInt();
            for (int i = 0; i < reverseNumber.length; i++) {
                if(reverseNumber[userInput] == reverseNumber.length - 1){
                    System.out.println(reverseNumber[userInput] + "occurs " + reverseNumber[i] + "times");
                }

                }
            }while(occurrence == 0);

    }


    public static void CountSingleDigit(int userInput){
        Random random = new Random();
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10) * 100;
            System.out.println(array[i]);
        }

    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
    return min;

    }
}

