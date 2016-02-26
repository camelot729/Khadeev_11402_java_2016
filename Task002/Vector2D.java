package Task002;

/**w
 * Created by Kamil on 16.02.16.
 */


public class Vector2D {

    public Vector2D(){

    }
    public Vector2D(double i, double i1){
        this.x = i;
        this.y = i1;
    }

    public double length(){
        return Math.sqrt(x*x + y*y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public Vector2D addVector2D(Vector2D vector2D){
        Vector2D v = new Vector2D();
        v.x = this.getX() + vector2D.getX();
        v.y = this.getY() + vector2D.getY();
        return v;
    }

    public Vector2D multVector2DtoSingleNumber(int x){
        Vector2D newVector = new Vector2D();
        newVector.x = this.getX() * x;
        newVector.y = this.getY() * x;
        return newVector;
    }



    private double x;
    private double y;
}
