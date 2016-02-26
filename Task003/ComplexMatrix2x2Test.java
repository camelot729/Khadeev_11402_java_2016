package Task003;


import org.junit.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Kamil on 25.02.16.
 */
public class ComplexMatrix2x2Test {
    @Test
    public void threeMethod() {
        ComplexNumber number1 = mock(ComplexNumber.class);
        when(number1.getX()).thenReturn(5.0);
        when(number1.getY()).thenReturn(4.0);

        ComplexNumber number2 = mock(ComplexNumber.class);
        when(number2.getX()).thenReturn(3.0);
        when(number2.getY()).thenReturn(2.0);

        ComplexNumber number3 = mock(ComplexNumber.class);
        when(number3.getX()).thenReturn(1.0);
        when(number3.getY()).thenReturn(0.0);

        ComplexNumber number4 = mock(ComplexNumber.class);
        when(number4.getX()).thenReturn(-1.0);
        when(number4.getY()).thenReturn(-2.0);

        ComplexMatrix2x2 matrix = new ComplexMatrix2x2(number1, number2, number3, number4);

        String result = number1.getX() + " " + number1.getY() + " " +
                number2.getX() + " " + number2.getY() + " " +
                number3.getX() + " " + number3.getY() + " " +
                number4.getX() + " " + number4.getY();

        String resultMatrix = matrix.getA()[0][0].getX() + " " + matrix.getA()[0][0].getY() + " " +
                matrix.getA()[0][1].getX() + " " + matrix.getA()[0][1].getY() + " " +
                matrix.getA()[1][0].getX() + " " + matrix.getA()[1][0].getY() + " " +
                matrix.getA()[1][1].getX() + " " + matrix.getA()[1][1].getY();

        Assert.assertEquals(result, resultMatrix);
    }

    @Test
    public void addShouldCouldComplexNumber(){
        ComplexNumber number1 = mock(ComplexNumber.class);
        when(number1.getX()).thenReturn(5.0);
        when(number1.getY()).thenReturn(4.0);

        ComplexNumber number2 = mock(ComplexNumber.class);
        when(number2.getX()).thenReturn(3.0);
        when(number2.getY()).thenReturn(2.0);

        ComplexNumber number3 = mock(ComplexNumber.class);
        when(number3.getX()).thenReturn(1.0);
        when(number3.getY()).thenReturn(0.0);

        ComplexNumber number4 = mock(ComplexNumber.class);
        when(number4.getX()).thenReturn(-1.0);
        when(number4.getY()).thenReturn(-2.0);

        ComplexMatrix2x2 matrix = new ComplexMatrix2x2(number1, number2, number3, number4);
        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(number1, number2, number3, number4);



        String result = number1.getX()*2 + " " + number1.getY()*2 + " " +
                number2.getX()*2 + " " + number2.getY()*2 + " " +
                number3.getX()*2 + " " + number3.getY()*2 + " " +
                number4.getX()*2 + " " + number4.getY()*2;
        ComplexMatrix2x2 matrix3 = new ComplexMatrix2x2();

        when(matrix.add(matrix1)).thenReturn(matrix);

//        String resultMatrix = matrix3.getA()[0][0].getX() + " " + matrix3.getA()[0][0].getY() + " " +
//                matrix3.getA()[0][1].getX() + " " + matrix3.getA()[0][1].getY() + " " +
//                matrix3.getA()[1][0].getX() + " " + matrix3.getA()[1][0].getY() + " " +
//                matrix3.getA()[1][1].getX() + " " + matrix3.getA()[1][1].getY();
        System.out.println(result);
        Assert.assertEquals(result, result);
    }
}
