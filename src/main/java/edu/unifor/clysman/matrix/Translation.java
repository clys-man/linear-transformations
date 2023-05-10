package edu.unifor.clysman.matrix;

import edu.unifor.clysman.linear.LinearAlgebra;
import edu.unifor.clysman.linear.Matrix;

public class Translation {
    private final LinearAlgebra la;

    public Translation() {
        la = new LinearAlgebra();
    }

    public Matrix translate2d(Matrix m, double tx, double ty) {
        Matrix t = new Matrix(3, 3);
        t.set(0, 2, tx);
        t.set(1, 2, ty);

        return la.dot(m, t);
    }

    public Matrix translate3d(Matrix m, double tx, double ty, double tz) {
        Matrix t = new Matrix(4, 4);
        t.set(0, 3, tx);
        t.set(1, 3, ty);
        t.set(2, 3, tz);

        return la.dot(m, t);
    }
}
