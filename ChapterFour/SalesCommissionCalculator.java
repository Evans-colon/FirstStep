package ChapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        double salesEarningPerWeek = 200;
        double grossSales = salesEarningPerWeek * 0.9;
        double salesForTheWeek = 0;
        double totalEarningForTheWeek = 0;
        int counter = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("kindly input the sales for the week. enter -1 to end entry: ");
        salesForTheWeek = input.nextDouble();

        while(salesForTheWeek != -1){
            totalEarningForTheWeek += salesForTheWeek + grossSales;
            counter++;

            System.out.println("kindly input the sales for the week. enter -1 to end entry: ");
            salesForTheWeek = input.nextDouble();

        }
        System.out.println(totalEarningForTheWeek);

        }

    }

