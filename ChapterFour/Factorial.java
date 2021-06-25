package ChapterFour;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please, enter a non negative integer");
        int nonNegativeInteger = input.nextInt();
        System.out.println(checkForFactorial(nonNegativeInteger));

    }

    public static int checkForFactorial(int nonNegativeInteger) {
        int counter = 1;
        while (nonNegativeInteger > 0) {
            if (counter <= nonNegativeInteger) {
                nonNegativeInteger = nonNegativeInteger * nonNegativeInteger - counter;
                counter++;


            }

        }
        return nonNegativeInteger;
    }
}


