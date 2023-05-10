package edu.unifor.clysman.matrix;

import edu.unifor.clysman.linear.LinearAlgebra;
import edu.unifor.clysman.linear.Matrix;

public class Reflection {
    private final LinearAlgebra la;

    public Reflection() {
        la = new LinearAlgebra();
    }

    public Matrix reflect2dx(Matrix m) {
        Matrix r = new Matrix(2, 2);
        r.set(0, 0, -1);
        r.set(1, 1, 1);

        return la.dot(r, m);
    }

    public Matrix reflect2dy(Matrix m) {
        Matrix r = new Matrix(2, 2);
        r.set(0, 0, 1);
        r.set(1, 1, -1);

        return la.dot(r, m);
    }

    public Matrix reflect3dx(Matrix m) {
        Matrix r = new Matrix(3, 3);
        r.set(0, 0, -1);
        r.set(1, 1, 1);
        r.set(2, 2, 1);

        return la.dot(r, m);
    }

    public Matrix reflect3dy(Matrix m) {
        Matrix r = new Matrix(3, 3);
        r.set(0, 0, 1);
        r.set(1, 1, -1);
        r.set(2, 2, 1);

        return la.dot(r, m);
    }

    public Matrix reflect3dz(Matrix m) {
        Matrix r = new Matrix(3, 3);
        r.set(0, 0, 1);
        r.set(1, 1, 1);
        r.set(2, 2, -1);

        return la.dot(r, m);
    }
}
