package Task003;

/**
 * Created by Kamil on 25.02.16.
 */
public class ComplexVector2D {


    private ComplexNumber x;
    private ComplexNumber y;

    public String toString(){
        return ("<" + this.com1.toString() + ";" + this.com2.toString() + ">");
    }

    public ComplexNumber getCom1() {
        return com1;
    }

    public void setCom1(ComplexNumber com1) {
        this.com1 = com1;
    }

    public ComplexNumber getCom2() {
        return com2;
    }

    public void setCom2(ComplexNumber com2) {
        this.com2 = com2;
    }

    private ComplexNumber com1;
    private ComplexNumber com2;

    public ComplexVector2D(ComplexNumber c1, ComplexNumber c2) {
        com1 = c1;
        com2 = c2;
    }

    public ComplexVector2D(){
        this(new ComplexNumber(),new ComplexNumber());
    }

    public ComplexVector2D add(ComplexVector2D c) {
        ComplexVector2D a = new ComplexVector2D();
        a.com1 = this.com1.add(c.getCom1());
        a.com2 = this.com2.add(c.getCom2());
        return a;
    }

    public ComplexNumber scalarProduct(ComplexVector2D c) {
        ComplexNumber sc = this.com1.mult(c.getCom1());
        ComplexNumber sc1 = this.com2.mult(c.getCom2());
        return sc.add(sc1);
    }

    public boolean equals(ComplexVector2D c){
        if(this.com1.equals(c.getCom1()) && this.com2.equals(c.getCom2())) {
            return true;
        }else{
            return false;
        }
    }

    public ComplexNumber getX() {
        return x;
    }

    public ComplexNumber getY() {
        return y;
    }
}
