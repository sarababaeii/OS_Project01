import java.util.Random;

public class Matrix {

    private int rows;
    private int columns;
    private int[][] entries;

    public Matrix(int rows, int columns, int[][] entries) {
        this.rows = rows;
        this.columns = columns;
        this.entries = entries;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getEntry(int row, int column) {
        return entries[row][column];
    }

    public void setEntry(int row, int column, int value) {
        entries[row][column] = value;
    }

    public static Matrix generateRandomMatrix(int rows, int columns) {
        int[][] entries = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                entries[i][j] = random.nextInt(100) * 10;
            }
        }
        return new Matrix(rows, columns, entries);
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(entries[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
