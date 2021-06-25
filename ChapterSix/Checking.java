package ChapterSix;

import java.util.Scanner;

public class Checking {
    public static void main(String[] args) {
        int[] array = {23, 29, 13, 19, 98, 10, 100};
        int currentMinimum = array[0];
        for(int i = 0; i < args.length; i++){
            if(currentMinimum > array[i]){
                currentMinimum = array[i];
            }
        }
    }
}

