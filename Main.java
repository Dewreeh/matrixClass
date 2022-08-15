public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 2);
        matrix1.printMatrix();
        matrix1.comMatrix(500);
        matrix1.printMatrix();
        System.out.printf("\n" + String.valueOf(matrix1.getElement(1, 1)));
        Matrix matrix2 = new Matrix(3, 2);
        Matrix matrixSum = matrix1.sumMatrixes(matrix2);
        matrix2.printMatrix();
        matrixSum.printMatrix();
        Matrix matrix3 = new Matrix(3, 2);
        matrix3.printMatrix();
        matrix3.fillMatrix();
        matrix3.printMatrix();

        System.out.printf("\nHello world!");
    }
}