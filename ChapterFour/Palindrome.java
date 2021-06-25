package ChapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please, enter the integer you want to confirm: ");
        int fiveDigitNumber = input.nextInt();
        System.out.println(displayNumber(fiveDigitNumber));

    }

    public static int displayNumber(int fiveDigitNumber) {
        int modulo = 0;
        int result = 0;


        if (fiveDigitNumber > 0 && fiveDigitNumber <= 99999)
            while (fiveDigitNumber > 0) {

                modulo = fiveDigitNumber % 10;
                result = modulo + result;
                fiveDigitNumber = fiveDigitNumber / 10;
                if (fiveDigitNumber == result) {
                    System.out.println("correct value");
                }
            }
        return result;
    }
}


