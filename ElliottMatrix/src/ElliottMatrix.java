public class ElliottMatrix {

    private double[][] matrixArr;
    public int height;
    public int width;

    /**
     *
     * @param rows
     * @param cols
     */
    public ElliottMatrix(int rows, int cols){
        matrixArr = new double[rows][cols];
        this.height = rows;
        this.width = cols;
    }

    /**
     *
     * @param row
     * @param col
     * @param val
     * @throws MatrixException
     */
    public void set(int row, int col, double val) throws MatrixException{
        if(row > height || col > width){
            throw new MatrixException("Invalid dimensional parameters");
        }
        matrixArr[row - 1][col - 1] = val;
    }

    /**
     * Gets the value of a given
     *
     * @param row
     * @param col
     * @return
     * @throws MatrixException
     */
    public double get(int row, int col) throws MatrixException{
        if(row > height || col > width){
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
    public ElliottMatrix add(ElliottMatrix one, ElliottMatrix two) throws MatrixException{
        if(one == null || two == null || one.height != two.height || one.width != two.width){
            throw new MatrixException("Invalid matrix parameter or incompatible matrix dimensions");
        }
        ElliottMatrix combinedMatrix = new ElliottMatrix();
        for (int i = 0; i < one.height; i++) {
            for (int j = 0; j < one.width; j++) {
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
    public ElliottMatrix sub(ElliottMatrix one, ElliottMatrix two) throws MatrixException{
        if(one == null || two == null || one.height != two.height || one.width != two.width){
            throw new MatrixException("Invalid matrix parameter or incompatible matrix dimensions");
        }
        ElliottMatrix differenceMatrix = new ElliottMatrix(one.height, one.width);
        for (int i = 0; i < one.height; i++) {
            for (int j = 0; j < one.width; j++) {
                differenceMatrix.set(i, j, one.get(i, j) - two.get(i, j));
            }
        }
        return differenceMatrix;
    }

    /**
     * TODO
     * @param one
     * @param two
     * @return ElliottMatrix productMatrix
     * @throws MatrixException
     */
    public ElliottMatrix mult(ElliottMatrix one, ElliottMatrix two) throws MatrixException{
        ElliottMatrix productMatrix = new ElliottMatrix();
        return productMatrix;
    }

    /**
     * Performs scalar multiplication on a matrix using a given double
     *
     * @param matrix
     * @param scalar
     * @return ElliottMatrix matrix
     * @throws MatrixException
     */
    public ElliottMatrix mult(ElliottMatrix matrix, double scalar) throws MatrixException{
        if(matrix == null){
            throw new MatrixException("Invalid matrix parameter");
        }
        for(int i = 0; i < matrix.height; i++){
            for(int j = 0; j < matrix.width; j++){
                matrix.set(i, j, matrix.get(i, j) * scalar);
            }
        }
        return matrix;
    }

    /**
     * TODO
     * @param matrix
     * @return ElliottMatrix transposedMatrix
     * @throws MatrixException
     */
    public ElliottMatrix transpose(ElliottMatrix matrix) throws MatrixException{
        if(matrix == null){
            throw new MatrixException("Invalid matrix parameter");
        }
        ElliottMatrix transposedMatrix = new ElliottMatrix(matrix.width, matrix.height);
        for(int i = 0; i < matrix.height; i++){
            for (int j = 0; j < matrix.width; j++) {
                transposedMatrix.set(i, j, matrix.get(j, i));
            }
        }
        return transposedMatrix;
    }
}
