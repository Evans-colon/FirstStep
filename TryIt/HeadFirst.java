package TryIt;

import java.util.ArrayList;
import java.util.Scanner;

public class HeadFirst {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("pine-apple");
        myList.add("apple");
        myList.add("grape");
        myList.add("bread");

        if(myList.get(2) == myList.get(1))
            myList.add("goat");
        else{
            myList.remove(1);


            char[] fruit = {'p', 'e', 'a', 'r'};
            String vegetable = "pear";
            String list = new String(fruit);
            String myFruit = new String();
            System.out.println(list.compareTo(myFruit));

            String s3 = list.concat(vegetable);
            System.out.println(list.startsWith("pe"));

            StringBuffer stringBuffer = new StringBuffer("morning");
            stringBuffer.isEmpty();
            System.out.println(stringBuffer.isEmpty());
            stringBuffer.insert(0,"good");
            System.out.println(stringBuffer);

        }
    }

    public StringBuilder reverse(int[] number){


        number = new int[]{2, 5, 3, 1, 8};
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.reverse();

        do{
            try{
                System.out.println("please, enter an integer");
                int numerator= input.nextInt;
            }
        }

    }

    public static int quotient(int numerator, int denominator){
        throw ArithmeticException
        {
        return numerator/denominator;
    }


}

