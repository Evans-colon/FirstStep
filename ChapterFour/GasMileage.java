package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalGasConsumed = 0;
        double totalMilesCovered = 0;
        double totalGasMileage = 0;
        int counter = 0;

        System.out.println("please, enter the miles covered for each hour. kindly enter -1 to end your input: ");
        double miles = input.nextDouble();

        System.out.println("also, enter the gas used for each distance covered. kindly enter -1 to end your input: ");
        double gas = input.nextDouble();

        while (miles != -1 && gas != -1){
            totalMilesCovered += miles;
            counter++;

            System.out.println("please, enter the miles covered for each hour. kindly enter -1 to end your input: ");
            miles = input.nextDouble();

            totalGasConsumed += gas;
            counter++;

            System.out.println("also, enter the gas used for each distance covered. kindly enter -1 to end your input: ");
            gas = input.nextDouble();
        }


        if(counter != 0){
            totalGasMileage = totalGasConsumed * totalMilesCovered / counter;
        }

        System.out.println(totalGasMileage);
    }
}
