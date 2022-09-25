//package com.java.w3schools.blog.java.program.to.threads.matrix;

public class RowAddWorker implements Runnable {

    private final Matrix result;
    private final Matrix matrix1;
    private final Matrix matrix2;
    private final int row;

    public RowAddWorker(Matrix result, Matrix matrix1, Matrix matrix2, int row) {
        this.result = result;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.row = row;
    }

    @Override
    public void run() {
        for (int i = 0; i < matrix1.getColumns(); i++) {
            int a = matrix1.getEntry(row, i);
            int b = matrix2.getEntry(row, i);
            result.setEntry(row, i, a + b);
        }
    }
}