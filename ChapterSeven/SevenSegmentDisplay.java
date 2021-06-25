package ChapterSeven;

public class SevenSegmentDisplay {
    int[][] electronics = new int[5][4];

    public void display() {
        for (int[] electronic : electronics) {
            for (int column : electronic) {
                if (column == 1) System.out.print("# ");
                if (column == 0) System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void writeOnA() {
        for (int i = 0; i < 4; i++) {
            electronics[0][i] = 1;
        }

    }

    public void writeOnB() {
        for (int i = 0; i < 3; i++) {
            electronics[i][3] = 1;
        }

    }

    public void writeOnC() {
        for (int i = 2; i < 5; i++) {
            electronics[i][3] = 1;
        }

    }

    public void writeOnD() {
        for (int i = 0; i < 4; i++) {
            electronics[4][i] = 1;
        }

    }

    public void writeOnE() {
        for (int i = 2; i < 5; i++) {
            electronics[i][0] = 1;
        }

    }

    public void writeOnF() {
        for (int i = 0; i < 3; i++) {
            electronics[i][0] = 1;
        }
    }

    public void writeOnG() {
        for (int i = 0; i < 4; i++) {
            electronics[2][i] = 1;


        }
    }


    public void setValue(String number) throws Exception {
        for (int i = 0; i < number.length(); i++) {
//
//            if (number.length() > 8) {
//                throw new IllegalArgumentException("incorrect value");
//            }
////            if (number.charAt(7) == '0'){
////                return;
////            }
//            if(number.charAt(i) != '1' || number.charAt(i) != '0'){
//                throw new InputMismatchException("incorrect input");
//            }
            if (number.charAt(i) == '1') {
                switch (i) {
                    case 0 -> writeOnA();
                    case 1 -> writeOnB();
                    case 2 -> writeOnC();
                    case 3 -> writeOnD();
                    case 4 -> writeOnE();
                    case 5 -> writeOnF();
                    case 6 -> writeOnG();
                }

            }
        }
    }


    public void divisionAndModulo(int userInput) {
        int[] divisionAndModulo = new int[userInput];
        int index = 0;
        while (userInput > 0) {
            divisionAndModulo[index++] = userInput % 2;
            userInput = userInput / 2;

            for (int i = index - 1; i >= 0; i--) {
                System.out.println(divisionAndModulo[i]);
            }

        }

    }
}















