package ChapterSeven;

public class GradeExam {
    public static void main(String[] args) {
        String[][] answers = {
                {"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
                {"E", "D", "D", "A", "C", "B", "E", "E", "A", "E"},
                {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
                {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
                {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"}};

        String[] keys = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        for (int row = 0; row < answers.length; row++) {
            int gradeOneStudentCount = 0;
            for (int column = 0; column < answers[row].length; column++) {
                if (answers[row][column] == keys[column])
                    gradeOneStudentCount++;
            }
            System.out.println("student " + row + " 's total score is " + gradeOneStudentCount);
        }


    }
}
