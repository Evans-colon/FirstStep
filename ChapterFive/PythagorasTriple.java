package ChapterFive;

import ChapterThree.Employee;

public class PythagorasTriple {
    public static void main(String[] args) {
        String[] strings = {"started", "starting", "ended", "ending"};


        for (String string : strings) {
            if (string.startsWith("st"))
                System.out.printf("\"%s\" starts with \"st\"%n", string);
        }
    }
}

//        String letters = "abcdefghiabcdefghijklmabcdefgh";
//        System.out.println(letters.indexOf('c',5));
//        System.out.println(letters.indexOf("def", 5));



