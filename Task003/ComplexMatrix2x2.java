package Task003;

/**-
 * @author Danil Khisamov
 *         11-402
 */
public class ComplexMatrix2x2 {
    private ComplexNumber[][] a = new ComplexNumber[2][2];

    public ComplexMatrix2x2() {
        this(new ComplexNumber(), new ComplexNumber(), new ComplexNumber(), new ComplexNumber());
    }

    public ComplexMatrix2x2(ComplexNumber a) {
        this(a, a, a, a);
    }

    public ComplexMatrix2x2(ComplexNumber a0, ComplexNumber a1, ComplexNumber a2, ComplexNumber a3) {
        this.a[0][0] = a0;
        this.a[0][1] = a1;
        this.a[1][0] = a2;
        this.a[1][1] = a3;
    }

    public ComplexMatrix2x2 add(ComplexMatrix2x2 mat) {
        int i, j;
        ComplexMatrix2x2 res = new ComplexMatrix2x2();
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                res.a[i][j] = a[i][j].add(mat.a[i][j]);
            }
        }
        return res;
    }

    public ComplexMatrix2x2 mult(ComplexMatrix2x2 mat) {
        int i, j, k;
        ComplexMatrix2x2 res = new ComplexMatrix2x2();
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                for (k = 0; k < 2; k++) {
                    res.a[i][j] = res.a[i][j].add(a[i][k].mult(mat.a[k][j]));
                }
            }
        }
        return res;
    }

    public ComplexNumber det() {
        return (a[0][0].mult(a[1][1])).sub(a[1][0].mult(a[0][1]));
    }

    public ComplexVector2D multVector(ComplexVector2D vec) {
        ComplexMatrix2x2 vector = new ComplexMatrix2x2(vec.getX(), new ComplexNumber(), vec.getY(), new ComplexNumber());
        ComplexMatrix2x2 res = mult(vector);
        return new ComplexVector2D(res.a[0][0], res.a[1][0]);
    }

    public void printMatrix() {
        String x = a[0][0].toString() + " " + a[0][1].toString();
        System.out.println(x);
        x = a[1][0].toString() + " " + a[1][1].toString();
        System.out.println(x);
    }

    public ComplexNumber[][] getA() {
        return a;
    }
}
