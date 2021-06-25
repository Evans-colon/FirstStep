package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    public static void main(String[] args) {
        int userInput;
        Scanner input = new Scanner(System.in);

        int firstNumber = generatePositiveDigit();
        int secondNumber = generatePositiveDigit();

        do {
            int result = firstNumber * secondNumber;
            System.out.println("how much is " + firstNumber + " * " + secondNumber);
            userInput = input.nextInt();


            if (userInput == result) {
                System.out.println("very good");
                firstNumber = generatePositiveDigit();
                secondNumber = generatePositiveDigit();

            } else if (userInput != -1) {
                System.out.println("Not correct. try again");

            }


        } while (userInput != -1);

    }

    public static int generatePositiveDigit() {
        SecureRandom random = new SecureRandom();
        int digit = random.nextInt(10);
        return digit;
    }
}









