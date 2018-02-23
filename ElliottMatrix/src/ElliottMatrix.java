/**
 * Matrix class that allows for creation of matrices, getting and setting of values, addition, subtraction, scalar
 * multiplication, matrix multiplication, and transposing.
 */
public class ElliottMatrix {

    private double[][] matrixArr;
    public int height;
    public int width;

    /**
     * Constructs a matrix of the inputted size
     * @param rows
     * @param cols
     */
    public ElliottMatrix(int rows, int cols) {
        matrixArr = new double[rows][cols];
        this.height = rows + 1;
        this.width = cols + 1;
    }

    /**
     * Sets the value of a point/coordinate/index/element/whatever of a matrix
     *
     * @param row
     * @param col
     * @param val
     * @throws MatrixException
     */
    public void set(int row, int col, double val) throws MatrixException {
        if (row > height || col > width) {
            throw new MatrixException("Invalid dimensional parameters");
        }
        matrixArr[row - 1][col - 1] = val;
    }

    /**
     * Gets the value of a given point/coordinate/element/index/whatever (I don't know matrix terminology)
     *
     * @param row
     * @param col
     * @return
     * @throws MatrixException
     */
    public double get(int row, int col) throws MatrixException {
        if (row > height || col > width) {
            throw new MatrixException("Invalid dimensional parameters");
        }
        //Matrices ARE NOT zero based
        double gottenVal = matrixArr[row - 1][col - 1];
        return gottenVal;
    }

    /**
     * Adds two matrices, throws error if either matrix is null or if the matrices are not of equal length
     *
     * @param one
     * @param two
     * @return
     * @throws MatrixException
     */
    public static ElliottMatrix add(ElliottMatrix one, ElliottMatrix two) throws MatrixException {
        if (one == null || two == null || one.height != two.height || one.width != two.width) {
            throw new MatrixException("Invalid matrix parameter or incompatible matrix dimensions");
        }
        ElliottMatrix combinedMatrix = new ElliottMatrix(one.height - 1, one.width - 1);
        for (int i = 1; i < one.height; i++) {
            for (int j = 1; j < one.width; j++) {
                combinedMatrix.set(i, j, one.get(i, j) + two.get(i, j));
            }
        }
        return combinedMatrix;
    }

    /**
     * Subtracts two matrices, throws error if either matrix is null or if the matrices are not of equal length
     *
     * @param one
     * @param two
     * @return ElliottMatrix differenceMatrix
     * @throws MatrixException
     */
    public static ElliottMatrix sub(ElliottMatrix one, ElliottMatrix two) throws MatrixException {
        if (one == null || two == null || one.height != two.height || one.width != two.width) {
            throw new MatrixException("Invalid matrix parameter or incompatible matrix dimensions");
        }
        ElliottMatrix differenceMatrix = new ElliottMatrix(one.height - 1, one.width - 1);
        for (int i = 1; i < one.height; i++) {
            for (int j = 1; j < one.width; j++) {
                differenceMatrix.set(i, j, one.get(i, j) - two.get(i, j));
            }
        }
        return differenceMatrix;
    }

    /**
     * Multiplies two matrices together, throws error if inputs are null or cannot be multiplied together
     *
     * @param one
     * @param two
     * @return ElliottMatrix productMatrix
     * @throws MatrixException
     */
    public static ElliottMatrix mult(ElliottMatrix one, ElliottMatrix two) throws MatrixException {
        if (one == null || two == null || one.width != two.height) {
            throw new MatrixException("Cannot multiply matrices, either null parameters or incompatible matrices");
        }
        //Determine size of product matrix
        int correctHeight = one.height - 1;
        int correctWidth = two.width - 1;
        ElliottMatrix productMatrix = new ElliottMatrix(correctWidth, correctHeight);

        for (int i = 1; i < one.height; i++) {
            for (int j = 1; j < two.width; j++) {
                double newVal = 0;
                for (int k = 1; k < one.width; k++) {
                    newVal += one.get(i, k) * two.get(k, j);
                }
                productMatrix.set(i, j, newVal);
            }
        }
        return productMatrix;
    }

    /**
     * Performs scalar multiplication on a matrix using a given double, throws error if input is null
     *
     * @param matrix
     * @param scalar
     * @return ElliottMatrix matrix
     * @throws MatrixException
     */
    public static ElliottMatrix mult(ElliottMatrix matrix, double scalar) throws MatrixException {
        if (matrix == null) {
            throw new MatrixException("Invalid matrix parameter");
        }
        ElliottMatrix scalaredMatrix = new ElliottMatrix(matrix.height - 1, matrix.width - 1);
        for (int i = 1; i < scalaredMatrix.height; i++) {
            for (int j = 1; j < scalaredMatrix.width; j++) {
                scalaredMatrix.set(i, j, matrix.get(i, j) * scalar);
            }
        }
        return scalaredMatrix;
    }

    /**
     * Returns a transposed matrix, throws error if the inputted matrix is null
     *
     * @param matrix
     * @return ElliottMatrix transposedMatrix
     * @throws MatrixException
     */
    public static ElliottMatrix transpose(ElliottMatrix matrix) throws MatrixException {
        if (matrix == null) {
            throw new MatrixException("Invalid matrix parameter");
        }
        ElliottMatrix transposedMatrix = new ElliottMatrix(matrix.width - 1, matrix.height - 1);
        for (int i = 1; i < matrix.height; i++) {
            for (int j = 1; j < matrix.width; j++) {
                transposedMatrix.set(j, i, matrix.get(i, j));
            }
        }
        return transposedMatrix;
    }
}
