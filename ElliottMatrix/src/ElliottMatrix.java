public class ElliottMatrix {
    /**
     *
     * @param rows
     * @param cols
     */
    public ElliottMatrix(int rows, int cols){

    }

    /**
     * Empty (temporary???) constructor
     */
    public ElliottMatrix(){

    }

    /**
     *
     * @param row
     * @param col
     * @param val
     * @throws MatrixException
     */
    public void set(int row, int col, double val) throws MatrixException{

    }

    /**
     *
     * @param row
     * @param col
     * @return
     * @throws MatrixException
     */
    public double get(int row, int col) throws MatrixException{
        double gottenVal = 0;
        return gottenVal;
    }

    /**
     *
     * @param one
     * @param two
     * @return
     * @throws MatrixException
     */
    public ElliottMatrix add(ElliottMatrix one, ElliottMatrix two) throws MatrixException{
        ElliottMatrix combinedMatrix = new ElliottMatrix();
        return combinedMatrix;
    }

    /**
     *
     * @param one
     * @param two
     * @return
     * @throws MatrixException
     */
    public ElliottMatrix sub(ElliottMatrix one, ElliottMatrix two) throws MatrixException{
        ElliottMatrix differenceMatrix = new ElliottMatrix();
        return differenceMatrix;
    }

    /**
     *
     * @param one
     * @param two
     * @return
     * @throws MatrixException
     */
    public ElliottMatrix mult(ElliottMatrix one, ElliottMatrix two) throws MatrixException{
        ElliottMatrix productMatrix = new ElliottMatrix();
        return productMatrix;
    }

    /**
     *
     * @param matrix
     * @param scalar
     * @return
     * @throws MatrixException
     */
    public ElliottMatrix mult(ElliottMatrix matrix, double scalar) throws MatrixException{
        ElliottMatrix productMatrix = new ElliottMatrix();
        return productMatrix;
    }

    /**
     *
     * @param matrix
     * @return
     * @throws MatrixException
     */
    public ElliottMatrix transpose(ElliottMatrix matrix) throws MatrixException{
        ElliottMatrix transposedMatrix = new ElliottMatrix();
        return transposedMatrix;
    }
}
