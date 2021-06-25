package ChapterSeven;

import java.util.Scanner;

public class AnalyzeScores {
    public static void main(String[] args) {
        int total = 0;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.println("please, enter the scores. enter -1 once you are done entering the scores: ");
        int scores = input.nextInt();
        do {
            System.out.println("please, enter the scores you have. enter -1 once you are done entering the scores: ");
            scores = input.nextInt();

        }while (scores != -1);
            int[] gradeScores = new int[scores];
            for(int gradeScore : gradeScores) {

                gradeScores[gradeScore] = gradeScore;
                total += scores;
            }


                average = total / scores;

                for(int gradeScore : gradeScores){
                    if (gradeScores[gradeScore] > average){
                        System.out.println(gradeScores);
                    }
                }






    }
}
