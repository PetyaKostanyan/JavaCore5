package homework;

import java.util.stream.IntStream;

public class FigurePainter {
    public static void main(String[] args) {
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
