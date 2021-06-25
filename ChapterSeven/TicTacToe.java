package ChapterSeven;

import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {

        int[][] electronics = {{1, 1, 1, 1},
                                {1, 0, 0, 1},
                                {1, 1, 1, 1},
                                {1, 0, 0, 1},
                                {1, 1, 1, 1}};

        for (int[] electronic : electronics) {
            for (int column : electronic){
            if(column == 1) {
                System.out.print("# ");

            }else {
                System.out.print(" ");
            }

            }
            System.out.println();
            System.out.println();

        }



    }
}
