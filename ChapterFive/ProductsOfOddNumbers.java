package ChapterFive;

import static java.lang.String.format;

public class ProductsOfOddNumbers {
    public static void main(String[] args) {
        System.out.println(productOfOddIntegers());


    }

    public static int productOfOddIntegers(){
        int total = 0;
        for(int i = 1; i <= 15; i++){
            if (i % 2 == 1){
                total += i;
            }
        }
        return total;
    }

    public static void compoundInterest(double amount){
        double principal = 1000;
        double rate = 0.05;
        double year = 1;

        for(year = 1; year <= 10; year++){
            for(rate = 0.05; rate <= 0.1; rate++){
                amount = principal * Math.pow(1.0 + year, rate);
            }

        }
        System.out.printf("%4d%,20.2f%n", amount, year);
    }

}
