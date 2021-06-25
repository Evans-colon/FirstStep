package MethodExercises;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please, enter investment amount: ");
        double investmentAmount = input.nextInt();

        System.out.println("please, enter the number of months: ");
        double months = input.nextInt();

        System.out.println("please, enter interest rate: ");
        int years = input.nextInt();

        double futureAmount = futureInvestmentValue(investmentAmount, months, years);

        System.out.println("your future investment amount is: " + futureAmount);

    }


    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureInvestmentValue = 0;
        for (int i = 0; i <= 30; i++) {
            futureInvestmentValue = (investmentAmount * monthlyInterestRate / 12 * years);

        }

        return futureInvestmentValue;

    }


    public static void displaySortedNumber(double num1, double num2, double num3) {
        int temp;
        if (num1 > num2) {
            temp = (int) num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = (int) num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = (int) num2;
            num2 = num3;
            num3 = temp;
        }

    }

    public static int FinancialApplication(double years) {
        double tuition = 10_000;
        double rate = 0.05;
        years = 0;


        for (int i = 0; i <= 10; i++) ;
        double tuitionAmount = tuition * rate * years;
        return (int) tuitionAmount;
    }
}



//
//    public static int highestScore(int[] scores, int[] studentName){
//        for(int i = 0; i <= scores.length; i++){
//            for(int j = 0; j <= scores)
//        }
//
//        }
//    }

