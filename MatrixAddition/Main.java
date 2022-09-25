import java.util.Date;

public class Main {

    public static void main(String[] args) {
        int m = 5, n = 10;
        Matrix m1 = Matrix.generateRandomMatrix(m, n);
        Matrix m2 = Matrix.generateRandomMatrix(m, n);
        Matrix result = new Matrix(m, n, new int[m][n]);

        Date start = new Date();
        ParallelThreadsCreator.add(m1, m2, result);
        Date end = new Date();

        m1.print();
        m2.print();
        result.print();

        System.out.println("Time taken in milli seconds: " + (end.getTime() - start.getTime()));
    }
}