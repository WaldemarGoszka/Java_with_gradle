package zajavka.oop.Excesises.Ex3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square(10);
        Square square3 = new Square(15);

        Square[] squares = new Square[5];
        squares[0] = square1;
        squares[1] = square1;
        squares[2] = square2;
        squares[3] = square2;
        squares[4] = square3;
        System.out.println(Arrays.toString(squares));
        for (int i = 0; i < squares.length; i++) {
            if(squares[i] == null) {
                continue;
            }
            for (int j = i+1; j < squares.length ; j++) {
                if (squares[i].aeraCalculate() == squares[j].aeraCalculate()) {
                    squares[j] = null;
                }


            }
        }
        System.out.println(Arrays.toString(squares));
    }
}
