package ChapterSeven;


import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double commission = 0.09;
        double baseSalary = 200;
        double grossSales = 0;
        double totalSalary = 0;


        int[] sales = new int[9];

        do{

        System.out.println("please, enter the sales for the week. enter -1 to exit: ");
        grossSales = input.nextInt();

            totalSalary = baseSalary + (grossSales * commission);

            System.out.println("Do you wish to continue? enter -1 to exit: ");
            grossSales = input.nextInt();

            if (grossSales != 0) {

                for (int counter = 0; counter < sales.length; counter++) {
                    if (totalSalary >= 200 && totalSalary <= 299) {
                        ++sales[0];

                    } else if (totalSalary >= 300 && totalSalary <= 399) {
                        ++sales[1];

                    } else if (totalSalary >= 400 && totalSalary <= 499) {
                        ++sales[2];

                    } else if (totalSalary >= 500 && totalSalary <= 599) {
                        ++sales[3];

                    } else if (totalSalary >= 600 && totalSalary <= 699) {
                        ++sales[4];

                    } else if (totalSalary >= 700 && totalSalary <= 799) {
                        ++sales[5];

                    } else if (totalSalary >= 800 && totalSalary <= 899) {
                        ++sales[6];

                    } else if (totalSalary >= 900 && totalSalary <= 999) {
                        ++sales[7];

                    } else {
                        ++sales[8];

                    }

                    System.out.println(sales[0]);

                }


            }
        }while (grossSales != 1);
    }
}























