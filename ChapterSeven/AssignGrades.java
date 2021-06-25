package ChapterSeven;

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please, enter the total number of students scores you wish to enter: ");
        int numberOfStudents = input.nextInt();
        int[] studentGradingSystem = new int[numberOfStudents];



        System.out.println("please, enter the scores of the students in the right order: ");
        int studentsScores = input.nextInt();
        for(int counter = 0; counter < studentGradingSystem.length; counter++)
        studentGradingSystem[numberOfStudents] = studentsScores;

        for (int i = 0; i < studentGradingSystem.length; i++) {
            if (studentsScores >= 70) {
                System.out.println("student " + studentGradingSystem[i] + " score is " + studentsScores + " and the grade is " + "A");
            } else if (studentGradingSystem[numberOfStudents] >= 60) {
                System.out.println("student " + studentGradingSystem[i] + " score is " + studentsScores + " and the grade is " + "B");
            } else if (studentGradingSystem[numberOfStudents] >= 50) {
                System.out.println("student " + studentGradingSystem[i] + " score is " + studentsScores + " and the grade is " + "C");
            } else if (studentGradingSystem[numberOfStudents] >= 40) {
                System.out.println("student " + studentGradingSystem[i] + " score is " + studentsScores + " and the grade is " + "D");
            } else if (studentGradingSystem[numberOfStudents] >= 30) {
                System.out.println("student " + studentGradingSystem[i] + " score is " + studentsScores + " and the grade is " + "F");
            }

        }
    }
}
