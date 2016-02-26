package Task002;

/**
 * Created by Kamil on 25.02.16.
 */
public class Matrix2x2 {

    private double[][] a = new double[2][2];

    public Matrix2x2() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.a[i][j] = 0;
            }
        }
    }

    public Matrix2x2(double c) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.a[i][j] = c;
            }
        }
    }

    public Matrix2x2(double a, double b, double c, double d) {
        this.a[0][0] = a;
        this.a[0][1] = b;
        this.a[1][0] = c;
        this.a[1][1] = d;
    }

    public Matrix2x2(double[][] b) {
        if (b.length == 2 && b[1].length == 2 && b[0].length == 2) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    this.a[i][j] = b[i][j];
                }
            }
        } else {
            System.out.println("Invalid data");
        }
    }



    public double[][] getA() {
        return a;
    }



    public double getA(int a, int b) {
        double k = this.a[a][b];
        return k;
    }


    public Matrix2x2 add(Matrix2x2 matrix2x2) {
        double[][] m = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = matrix2x2.getA(i, j) + this.a[i][j];
            }
        }
        Matrix2x2 mat = new Matrix2x2(m);
        return mat;
    }

    public void add2(Matrix2x2 matrix2x2) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.a[i][j] += matrix2x2.getA(i, j);
            }
        }
    }


    public Matrix2x2 sub(Matrix2x2 matrix2x2) {
        double[][] m = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = this.a[i][j] - matrix2x2.getA(i, j);
            }
        }
        Matrix2x2 mat = new Matrix2x2(m);
        return mat;
    }

    public void sub2(Matrix2x2 matrix2x2) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.a[i][j] -= matrix2x2.getA(i, j);
            }
        }
    }

    public void multNumber2(int p) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.a[i][j] *= p;
            }
        }
    }

    public Matrix2x2 multNumber(double p) {
        double[][] m = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = this.a[i][j] * p;
            }
        }
        Matrix2x2 mat = new Matrix2x2(m);
        return mat;
    }

    public Matrix2x2 mult(Matrix2x2 matrix2x2) {
        double[][] m = new double[2][2];
        m[0][0] = this.a[0][0] * matrix2x2.getA(0, 0) + this.a[0][1] * matrix2x2.getA(1, 0);
        m[0][1] = this.a[0][0] * matrix2x2.getA(0, 1) + this.a[0][1] * matrix2x2.getA(1, 1);
        m[1][0] = this.a[1][0] * matrix2x2.getA(0, 0) + this.a[1][1] * matrix2x2.getA(1, 0);
        m[1][1] = this.a[1][0] * matrix2x2.getA(0, 1) + this.a[1][1] * matrix2x2.getA(1, 1);
        Matrix2x2 mat = new Matrix2x2(m);
        return mat;
    }

    public void mult2(Matrix2x2 matrix2x2) {
        double[][] m = new double[2][2];
        m[0][0] = this.a[0][0] * matrix2x2.getA(0, 0) + this.a[0][1] * matrix2x2.getA(1, 0);
        m[0][1] = this.a[0][0] * matrix2x2.getA(0, 1) + this.a[0][1] * matrix2x2.getA(1, 1);
        m[1][0] = this.a[1][0] * matrix2x2.getA(0, 0) + this.a[1][1] * matrix2x2.getA(1, 0);
        m[1][1] = this.a[1][0] * matrix2x2.getA(0, 1) + this.a[1][1] * matrix2x2.getA(1, 1);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.a[i][j] = m[i][j];
            }
        }
    }

    public double det() {
        double det = 1;
        Matrix2x2 de = this.equivalentDIagonal();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == j) {
                    det *= de.a[i][j];
                }
            }
        }
        return det;
    }

    public Matrix2x2 equivalentDIagonal() {
        double[][] m = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = this.a[i][j];
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = i + 1; j < 2; j++) {
                double c = m[j][i] / m[i][i];
                for (int k = 0; k < 2; k++) {
                    m[j][k] = m[j][k] - m[i][k] * c;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i != j) {
                    m[i][j] = 0;
                }
            }
        }
        Matrix2x2 mat = new Matrix2x2(m);
        return mat;
    }

    public void transpon() {
        double c = this.a[1][0];
        this.a[1][0] = this.a[0][1];
        this.a[0][1] = c;
    }

    public Matrix2x2 inverseMatrix() {
        double[][] m = new double[2][2];
        double c = this.det();
        if (c == 0) {
            System.out.println("Обратной матрицы не существует");
            return new Matrix2x2();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = this.a[i][j];
            }
        }
        Matrix2x2 mat = new Matrix2x2(m);
        mat.transpon();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if ((i + j )% 2 == 0) {
                    mat.a[i][j] = mat.a [i][j] * 1.0 / c;
                } else {
                    mat.a[i][j] = mat.a [i][j] * (-1.0) / c;
                }
            }
        }
        return mat;
    }

    public Vector2D multVector(Vector2D vector2D) {
        double c = this.a[0][0] * vector2D.getX() + this.a[0][1] * vector2D.getY();
        double d = this.a[1][0] * vector2D.getX() + this.a[1][1] * vector2D.getY();
        Vector2D v = new Vector2D(c, d);
        return v;

    }


}