import javax.sound.midi.Soundbank;
import java.awt.*;

public class MatrixTest {
    public static void main(String args []){
        System.out.println("HELLO");
        try{
            ElliottMatrix FirstTestMatrix = new ElliottMatrix(2, 3);
            ElliottMatrix SecondTestMatrix = new ElliottMatrix(2, 3);
            for (int i = 1; i < FirstTestMatrix.height; i++) {
                for (int j = 1; j < FirstTestMatrix.width; j++) {
                    FirstTestMatrix.set(i, j, ((int) (Math.random() * 10)));
                }
            }
            printMatrix(FirstTestMatrix);

            for (int i = 1; i < SecondTestMatrix.height; i++) {
                for (int j = 1; j < SecondTestMatrix.width; j++) {
                    SecondTestMatrix.set(i, j, ((int) (Math.random() * 10)));
                }
            }
            printMatrix(SecondTestMatrix);
            System.out.println("\n\n\n\n");
            System.out.println("Added: ");
            printMatrix(ElliottMatrix.add(FirstTestMatrix, SecondTestMatrix));
            System.out.println("Subtracted: ");
            printMatrix(ElliottMatrix.sub(FirstTestMatrix, SecondTestMatrix));
            System.out.println("Scalar multiplied: ");
            printMatrix(ElliottMatrix.mult(FirstTestMatrix, 3));
            System.out.println("Transposed: ");
            ElliottMatrix TransposedFirstMatrix = ElliottMatrix.transpose(FirstTestMatrix);
            printMatrix(TransposedFirstMatrix);
            System.out.println("Matrix multiplied: ");
            printMatrix(ElliottMatrix.mult(FirstTestMatrix, TransposedFirstMatrix));
        }catch(MatrixException e){
            System.out.println("error with something " + e.getMessage());
        }
    }

    public static void printMatrix(ElliottMatrix matrix){
        try {
            System.out.println("Matrix " + matrix);
            for (int i = 1; i < matrix.height; i++) {
                for (int j = 1; j < matrix.width; j++) {
                    System.out.print(matrix.get(i, j) + ", ");
                }
                System.out.println("");
            }
        }catch (MatrixException e){
            System.out.println(e.getMessage());
        }
    }
}
