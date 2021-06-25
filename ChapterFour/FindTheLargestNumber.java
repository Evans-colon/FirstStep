package ChapterFour;

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("kindly enter the first integer: ");
        int number = input.nextInt();

        while(count <= 10){
            System.out.println("kindly enter another integer: ");
            int secondNumber = input.nextInt();
            int largestNumber = number;

            if(secondNumber > largestNumber){
                largestNumber = secondNumber;
                count++;
            }
            System.out.println(largestNumber);
        }


    }
}
