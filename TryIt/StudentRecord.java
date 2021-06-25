package TryIt;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.Scanner;

public class StudentRecord {
    public void saveRecords(){
        try(Formatter formatter = new Formatter("student_records.txt");
            Scanner input = new Scanner(System.in)){
            System.out.println("Enter students records and hold ENTER + CTRL + D to stop");
            formatter.format("%s %s %s %s %s%n", "firstname", "lastname", "level", "Birth Year", "Age");

            while(input.hasNext()){
                String firstname = input.next();
                String lastname = input.next();
                int level = input.nextInt();
                int yearOfBirth = input.nextInt();

                formatter.format("%s %s %d %d %5%n", firstname, lastname, level, yearOfBirth, LocalDate.now().getYear() - yearOfBirth);

            }
        }

        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StudentRecord studentRecord = new StudentRecord();
        studentRecord.saveRecords();
    }
}
