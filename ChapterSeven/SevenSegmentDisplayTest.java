package ChapterSeven;

import java.util.InputMismatchException;

public class SevenSegmentDisplayTest {
    public static void main(String[] args) throws Exception {
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
//        try {
//            sevenSegmentDisplay.setValue("101111101111");
//            sevenSegmentDisplay.display();
//
//        } catch (IllegalArgumentException e) {
//            System.out.println("incorrect value");
//        }
//
//        try {
//            sevenSegmentDisplay.setValue("11111002");
//            sevenSegmentDisplay.display();
//
//        } catch (InputMismatchException e) {
//            System.out.println("incorrect input");
//        }

        sevenSegmentDisplay.divisionAndModulo(255);
    sevenSegmentDisplay.display();

    }

}
