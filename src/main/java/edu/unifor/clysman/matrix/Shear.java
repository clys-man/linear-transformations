package edu.unifor.clysman.matrix;

import edu.unifor.clysman.linear.LinearAlgebra;
import edu.unifor.clysman.linear.Matrix;

public class Shear {
    private final LinearAlgebra la;

    public Shear() {
        la = new LinearAlgebra();
    }

    public Matrix shearing2dx(Matrix m, double kx) {
        Matrix s = new Matrix(2, 2);
        s.set(0, 0, 1);
        s.set(0, 1, kx);
        s.set(1, 1, 1);

        return la.dot(s, m);
    }

    public Matrix shearing2dy(Matrix m, double ky) {
        Matrix s = new Matrix(2, 2);
        s.set(0, 0, 1);
        s.set(1, 0, ky);
        s.set(1, 1, 1);

        return la.dot(s, m);
    }
}
