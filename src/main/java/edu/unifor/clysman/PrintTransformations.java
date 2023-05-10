package edu.unifor.clysman;

import edu.unifor.clysman.linear.Matrix;
import edu.unifor.clysman.matrix.*;

public class PrintTransformations {
    public static void projection2dx() {
        Matrix m = new Matrix(2, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);

        Projection p = new Projection();
        Matrix m2 = p.project2dx(m);
        System.out.println("--- Projection 2Dx ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void projection2dy() {
        Matrix m = new Matrix(2, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);

        Projection p = new Projection();
        Matrix m2 = p.project2dy(m);
        System.out.println("--- Projection 2Dy ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void projection3dx() {
        Matrix m = new Matrix(3, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);
        m.set(2, 0, 1);

        Projection p = new Projection();
        Matrix m2 = p.project3dx(m);
        System.out.println("--- Projection 3Dx ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void projection3dy() {
        Matrix m = new Matrix(3, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);
        m.set(2, 0, 1);

        Projection p = new Projection();
        Matrix m2 = p.project3dy(m);
        System.out.println("--- Projection 3Dy ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void projection3dz() {
        Matrix m = new Matrix(3, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);
        m.set(2, 0, 1);

        Projection p = new Projection();
        Matrix m2 = p.project3dz(m);
        System.out.println("--- Projection 3Dz ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void reflection2dx() {
        Matrix m = new Matrix(2, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);

        Reflection p = new Reflection();
        Matrix m2 = p.reflect2dx(m);
        System.out.println("--- Reflection 2Dx ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void reflection2dy() {
        Matrix m = new Matrix(2, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);

        Reflection p = new Reflection();
        Matrix m2 = p.reflect2dy(m);
        System.out.println("--- Reflection 2Dy ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void reflection3dx() {
        Matrix m = new Matrix(3, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);
        m.set(2, 0, 1);

        Reflection p = new Reflection();
        Matrix m2 = p.reflect3dx(m);
        System.out.println("--- Reflection 3Dx ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void reflection3dy() {
        Matrix m = new Matrix(3, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);
        m.set(2, 0, 1);

        Reflection p = new Reflection();
        Matrix m2 = p.reflect3dy(m);
        System.out.println("--- Reflection 3Dy ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void reflection3dz() {
        Matrix m = new Matrix(3, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);
        m.set(2, 0, 1);

        Reflection p = new Reflection();
        Matrix m2 = p.reflect3dz(m);
        System.out.println("--- Reflection 3Dz ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void rotation2d() {
        Matrix m = new Matrix(2, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);

        Rotation p = new Rotation();
        Matrix m2 = p.rotate2d(m, 45);
        System.out.println("--- Rotation 2D ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void rotation3dx() {
        Matrix m = new Matrix(3, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);
        m.set(2, 0, 1);

        Rotation p = new Rotation();
        Matrix m2 = p.rotate3dx(m, 45);
        System.out.println("--- Rotation 3Dx ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void rotation3dy() {
        Matrix m = new Matrix(3, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);
        m.set(2, 0, 1);

        Rotation p = new Rotation();
        Matrix m2 = p.rotate3dy(m, 45);
        System.out.println("--- Rotation 3Dy ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void rotation3dz() {
        Matrix m = new Matrix(3, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);
        m.set(2, 0, 1);

        Rotation p = new Rotation();
        Matrix m2 = p.rotate3dz(m, 45);
        System.out.println("--- Rotation 3Dz ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void shear2dx() {
        Matrix m = new Matrix(2, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);

        Shear p = new Shear();
        Matrix m2 = p.shearing2dx(m, 1);
        System.out.println("--- Shear 2Dx ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void shear2dy() {
        Matrix m = new Matrix(2, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);

        Shear p = new Shear();
        Matrix m2 = p.shearing2dy(m, 1);
        System.out.println("--- Shear 2Dy ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void translation2d() {
        Matrix m = new Matrix(2, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);

        Translation p = new Translation();
        Matrix m2 = p.translate2d(m, 1, 1);
        System.out.println("--- Translation 2D ---");
        System.out.println(m);
        System.out.println(m2);
    }

    public static void translation3d() {
        Matrix m = new Matrix(3, 1);
        m.set(0, 0, 1);
        m.set(1, 0, 1);
        m.set(2, 0, 1);

        Translation p = new Translation();
        Matrix m2 = p.translate3d(m, 1, 1, 1);
        System.out.println("--- Translation 3D ---");
        System.out.println(m);
        System.out.println(m2);
    }
}
