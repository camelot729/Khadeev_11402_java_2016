package Task002;

import org.junit.*;

/**
 * Created by Kamil on 25.02.16.
 */
public class Matrix2x2Test {
    private final double EPS = 1e-9;

    @Test
    public void defaultMatrixShouldContaintZeroValues() {
        Matrix2x2 mat = new Matrix2x2();

        Assert.assertEquals(0, mat.getA()[0][0], EPS);
        Assert.assertEquals(0, mat.getA()[0][1], EPS);
        Assert.assertEquals(0, mat.getA()[1][0], EPS);
        Assert.assertEquals(0, mat.getA()[1][1], EPS);
    }

    @Test
    public void checkMatrixShouldContaintSomeNumberValues() {
        Matrix2x2 mat = new Matrix2x2(3);

        Assert.assertEquals(3, mat.getA()[0][0], EPS);
        Assert.assertEquals(3, mat.getA()[0][1], EPS);
        Assert.assertEquals(3, mat.getA()[1][0], EPS);
        Assert.assertEquals(3, mat.getA()[1][1], EPS);
    }

    @Test
    public void checkMatrixShouldContaintToSomeNumbersValues() {
        Matrix2x2 mat = new Matrix2x2(1, 2, 3, 4);

        Assert.assertEquals(1, mat.getA()[0][0], EPS);
        Assert.assertEquals(2, mat.getA()[0][1], EPS);
        Assert.assertEquals(3, mat.getA()[1][0], EPS);
        Assert.assertEquals(4, mat.getA()[1][1], EPS);
    }

    @Test
    public void addMatrixShouldContaintWithAnotherMatrix() {
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        Matrix2x2 m2 = new Matrix2x2(4, 3, 2, 1);

        Matrix2x2 m3 = m1.add(m2);

        Assert.assertEquals(5, m3.getA()[0][0], EPS);
        Assert.assertEquals(5, m3.getA()[0][1], EPS);
        Assert.assertEquals(5, m3.getA()[1][0], EPS);
        Assert.assertEquals(5, m3.getA()[1][1], EPS);
    }

    @Test
    public void addMatrixSouldContaintWithAnotherMatrix2(){
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        Matrix2x2 m2 = new Matrix2x2(4, 3, 2, 1);

        m1.add2(m2);

        Assert.assertEquals(5, m1.getA()[0][0], EPS);
        Assert.assertEquals(5, m1.getA()[0][1], EPS);
        Assert.assertEquals(5, m1.getA()[1][0], EPS);
        Assert.assertEquals(5, m1.getA()[1][1], EPS);
    }

    @Test
    public void subMatrixShouldContaintWithAnotherMatrix() {
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        Matrix2x2 m2 = new Matrix2x2(4, 3, 2, 1);

        Matrix2x2 m3 = m1.sub(m2);

        Assert.assertEquals(-3, m3.getA()[0][0], EPS);
        Assert.assertEquals(-1, m3.getA()[0][1], EPS);
        Assert.assertEquals(1, m3.getA()[1][0], EPS);
        Assert.assertEquals(3, m3.getA()[1][1], EPS);
    }


    @Test
    public void subMatrixSouldContaintWithAnotherMatrix2(){
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        Matrix2x2 m2 = new Matrix2x2(4, 3, 2, 1);

        m1.sub2(m2);

        Assert.assertEquals(-3, m1.getA()[0][0], EPS);
        Assert.assertEquals(-1, m1.getA()[0][1], EPS);
        Assert.assertEquals(1, m1.getA()[1][0], EPS);
        Assert.assertEquals(3, m1.getA()[1][1], EPS);
    }


    @Test
    public void multNumberShouldConraintMatrixWithSingleNumber(){
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        double d = 1;

        Matrix2x2 m3 = m1.multNumber(d);

        Assert.assertEquals(1, m3.getA()[0][0], EPS);
        Assert.assertEquals(2, m3.getA()[0][1], EPS);
        Assert.assertEquals(3, m3.getA()[1][0], EPS);
        Assert.assertEquals(4, m3.getA()[1][1], EPS);
    }

    @Test
    public void multNumberShouldConraintMatrixWithSingleNumber2(){
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        int d = 1;

        m1.multNumber2(d);

        Assert.assertEquals(1, m1.getA()[0][0], EPS);
        Assert.assertEquals(2, m1.getA()[0][1], EPS);
        Assert.assertEquals(3, m1.getA()[1][0], EPS);
        Assert.assertEquals(4, m1.getA()[1][1], EPS);
    }


    @Test
    public void multMatrixShouldContaintWithAnotherMatrix() {
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        Matrix2x2 m2 = new Matrix2x2(4, 3, 2, 1);

        Matrix2x2 m3 = m1.mult(m2);

        Assert.assertEquals(8, m3.getA()[0][0], EPS);
        Assert.assertEquals(5, m3.getA()[0][1], EPS);
        Assert.assertEquals(20, m3.getA()[1][0], EPS);
        Assert.assertEquals(13, m3.getA()[1][1], EPS);
    }

    @Test
    public void multMatrixShouldContaintWithAnotherMatrix2() {
        Matrix2x2 m1 = new Matrix2x2(1, 2, 3, 4);
        Matrix2x2 m2 = new Matrix2x2(4, 3, 2, 1);

        m1.mult2(m2);

        Assert.assertEquals(8, m1.getA()[0][0], EPS);
        Assert.assertEquals(5, m1.getA()[0][1], EPS);
        Assert.assertEquals(20, m1.getA()[1][0], EPS);
        Assert.assertEquals(13, m1.getA()[1][1], EPS);
    }

    @Test
    public void detShouldCountCheckDetMatrix(){
        Matrix2x2 m1 = new Matrix2x2(1);

        double det = m1.det();

        Assert.assertEquals(0,det, EPS);
    }


    @Test
    public void transponShoudCountFoundTranspMatrix(){
        Matrix2x2 m1 = new Matrix2x2(1,2,3,4);
        m1.transpon();
        Assert.assertEquals(1, m1.getA()[0][0], EPS);
        Assert.assertEquals(3, m1.getA()[0][1], EPS);
        Assert.assertEquals(2, m1.getA()[1][0], EPS);
        Assert.assertEquals(4, m1.getA()[1][1], EPS);
    }

    @Test
    public void inverseMatrixShouldCouldToMatrix(){
        Matrix2x2 m1 = new Matrix2x2(3,2,1,2);

        m1.inverseMatrix();
        Assert.assertNotEquals(0.5, m1.getA()[0][0], EPS);
        Assert.assertNotEquals(-0.5, m1.getA()[0][1], EPS);
        Assert.assertNotEquals(-0.25, m1.getA()[1][0], EPS);
        Assert.assertNotEquals(0.75, m1.getA()[1][1], EPS);
    }

    @Test
    public void multShouldCouldMultVectorToMatrix(){
        Matrix2x2 m1 = new Matrix2x2(1);
        Vector2D v1 = new Vector2D(1,1);

        m1.multVector(v1);

        Assert.assertEquals(1, m1.getA()[0][0], EPS);
        Assert.assertEquals(1, m1.getA()[0][1], EPS);
        Assert.assertEquals(1, m1.getA()[1][0], EPS);
        Assert.assertEquals(1, m1.getA()[1][1], EPS);
    }

}
