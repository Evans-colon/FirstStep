package ChapterSix;

import java.util.Scanner;

public class ChapterSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please, enter the one side of the right angle: ");
        double oneSide = input.nextInt();

        System.out.println("please, enter the other side of the right angle: ");
        double otherSide = input.nextInt();

        double result = hypotenuse(oneSide, otherSide);
        System.out.println("the length of the hypotenuse is " + result);

    }

    public static double hypotenuse(double oneSide, double otherSide) {
        double hypotenuse;
        hypotenuse = Math.pow(oneSide, 2) + Math.pow(otherSide, 2);
        return hypotenuse;
    }


    public static boolean isMultiple(int firstInteger, int secondInteger) {
        if (secondInteger % firstInteger == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }


    public static double circleArea(double radius) {
        return 3.142 * Math.pow(radius, 2);
    }

    public static double division(double firstNumber, double secondNumber){
        return firstNumber / secondNumber;
    }

    public static double modulo(double firstNumber, double secondNumber){
        return firstNumber % secondNumber;
    }

    public static String displayDigit(int number){
         double result = 0;
         double secondResult = 0;
         do {
             result = modulo(number, 10);
             secondResult = division(result, 10);
             return secondResult + " " + result;
         }while(number != 0);
    }

    public static int minimum3(int firstNumber, int secondNumber, int thirdNumber){
        return Math.min(Math.min(firstNumber,secondNumber),thirdNumber);
    }

    

}


