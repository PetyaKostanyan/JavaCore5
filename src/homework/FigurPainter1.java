package homework;

public class FigurPainter1 {
    public static void main(String[] args) {
                // exercise 1
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j <i+1; j++) {
                System.out.print("x ");
            }
        }
        System.out.println();
                    //exercise 2
                for (int i = 0; i < 4; i++) {
            for (int j = 4; j >i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println();
                //exercise 3
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println();
               //exercise 4
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" x");
            }
            System.out.println();
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
        }
        System.out.println();
              //exercise 5
        for (int i = 0; i < 3; i++) {
            for (int j = 4; j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" x");
            }
            System.out.println();
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
        }

    }
    }


