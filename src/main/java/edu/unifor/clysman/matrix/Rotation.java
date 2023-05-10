package edu.unifor.clysman.matrix;

import edu.unifor.clysman.linear.LinearAlgebra;
import edu.unifor.clysman.linear.Matrix;

public class Rotation {
    private final LinearAlgebra la;

    public Rotation() {
        la = new LinearAlgebra();
    }

    public Matrix rotate2d(Matrix m, double angle) {
        Matrix r = new Matrix(2, 2);
        r.set(0, 0, Math.cos(angle));
        r.set(0, 1, -Math.sin(angle));
        r.set(1, 0, Math.sin(angle));
        r.set(1, 1, Math.cos(angle));
        return la.dot(r, m);
    }

    public Matrix rotate3dx(Matrix m, double angle) {
        Matrix r = new Matrix(3, 3);
        r.set(0, 0, 1);
        r.set(1, 1, Math.cos(angle));
        r.set(1, 2, -Math.sin(angle));
        r.set(2, 1, Math.sin(angle));
        r.set(2, 2, Math.cos(angle));
        return la.dot(r, m);
    }

    public Matrix rotate3dy(Matrix m, double angle) {
        Matrix r = new Matrix(3, 3);
        r.set(0, 0, Math.cos(angle));
        r.set(0, 2, Math.sin(angle));
        r.set(1, 1, 1);
        r.set(2, 0, -Math.sin(angle));
        r.set(2, 2, Math.cos(angle));
        return la.dot(r, m);
    }

    public Matrix rotate3dz(Matrix m, double angle) {
        Matrix r = new Matrix(3, 3);
        r.set(0, 0, Math.cos(angle));
        r.set(0, 1, -Math.sin(angle));
        r.set(1, 0, Math.sin(angle));
        r.set(1, 1, Math.cos(angle));
        r.set(2, 2, 1);
        return la.dot(r, m);
    }
}
