package edu.unifor.clysman.matrix;

import edu.unifor.clysman.linear.LinearAlgebra;
import edu.unifor.clysman.linear.Matrix;

public class Projection {

    private final LinearAlgebra la;

    public Projection() {
        la = new LinearAlgebra();
    }

    public Matrix project2dx(Matrix m) {
        Matrix p = new Matrix(2, 2);
        p.set(0, 0, 1);

        return la.dot(p, m);
    }

    public Matrix project2dy(Matrix m) {
        Matrix p = new Matrix(2, 2);
        p.set(1, 1, 1);

        return la.dot(p, m);
    }

    public Matrix project3dx(Matrix m) {
        Matrix p = new Matrix(3, 3);
        p.set(0, 0, 1);
        p.set(1, 1, 1);

        return la.dot(p, m);
    }

    public Matrix project3dy(Matrix m) {
        Matrix p = new Matrix(3, 3);
        p.set(1, 1, 1);
        p.set(2, 2, 1);

        return la.dot(p, m);
    }

    public Matrix project3dz(Matrix m) {
        Matrix p = new Matrix(3, 3);
        p.set(1, 1, 1);
        p.set(2, 2, 1);

        return la.dot(p, m);
    }
}
