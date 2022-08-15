import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public int[][] matrix;
    int columns;
    int rows;
    public Matrix(int columns, int rows){
        this.columns = columns;
        this.rows = rows;
        matrix = new int[columns][rows];
        Random random = new Random();
        for(int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                this.matrix[i][j] = random.nextInt(100);
            }
        }
    }

    public void printMatrix(){
        System.out.printf("-------------\n");
        for(int i = 0; i < columns; i++){
            System.out.printf("\n");
            for(int j = 0; j < rows; j++){
                System.out.printf(String.valueOf(matrix[i][j]) + "\t");
            }
        }
        System.out.printf("\n-------------");
    }
    public int getElement(int column, int row){
        return this.matrix[column][row];
    }
    public void setElement(int column, int row, int number){
        this.matrix[column][row] = number;
    }

    public void comMatrix(int n){
        for(int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                this.setElement(i, j, matrix[i][j]*n);
            }
        }
    }

    public Matrix sumMatrixes(Matrix secondMatrix){
        Matrix sumOfTheMatrix = new Matrix(this.columns, this.rows);
        for(int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                sumOfTheMatrix.setElement(i, j, matrix[i][j]+secondMatrix.getElement(i, j));
            }
        }
        return sumOfTheMatrix;

    }
    public void fillMatrix(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < this.columns; i++){
            System.out.printf("\nFilling the string number %d \n", i+1);
            for(int j = 0; j < this.rows; j++){
                this.setElement(i, j, scanner.nextInt());
                this.matrix[i][j] = scanner.nextInt();
            }
        }
    }

}
