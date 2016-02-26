package Task002;

import org.junit.*;


/**
 * Created by Kamil on 16.02.16.
 */
public class Vector2DTest {
    private final double EPS = 1e-9;

    @Test
    public void defaultVectorShouldHaveZeroLength(){
        Vector2D v = new Vector2D();
        Assert.assertEquals(0, v.length(), EPS);

    }

    @Test
    public void vectorLengthShouldBeSQRTOSumOfSqrsOfXY() {
    }
    @Test
    public void constructorShouldSaveSecondParamInAttributeX(){
        Vector2D v = new Vector2D(5,7);
        Assert.assertEquals(7, v.getY(), EPS);
    }

    @Test(expected = NullPointerException.class)
    public void checkNullPointerEx(){
        Vector2D c = null;
        System.out.println(c.length());
    }

    @Test
    public void stupidTest(){
        Vector2D v = new Vector2D(2,2);
        Assume.assumeTrue(v.getX() == v.getY());
    }

    @Test
    public void checkMethodAddVector2DInAttributeX(){
        Vector2D v = new Vector2D(4,5);
        Vector2D v1 = new Vector2D(3,4);
        Vector2D v2 = v.addVector2D(v1);
        Assert.assertEquals(7, v2.getX(), EPS);
;    }

    @Test
    public void checkMethodAddVector2DInAttributeY(){
        Vector2D v = new Vector2D(4,5);
        Vector2D v1 = new Vector2D(3,4);
        Vector2D v2 = v.addVector2D(v1);
        Assert.assertEquals(9, v2.getY(), EPS);
    }

    @Test
    public void checkMethodMultVector2DtoSingleNumberInAttributeX(){
        Vector2D v = new Vector2D(4,5);
        int x = 2;
        Vector2D v2 = v.multVector2DtoSingleNumber(x);
        Assert.assertEquals(8, v2.getX(), EPS);
    }

    @Test
    public void checkMethodMultVector2DtoSingleNumberInAttributeY(){
        Vector2D v = new Vector2D(4,5);
        int x = 2;
        Vector2D v2 = v.multVector2DtoSingleNumber(x);
        Assert.assertEquals(10, v2.getY(), EPS);
    }



}
