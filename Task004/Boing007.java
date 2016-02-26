package Task004;

/**
 * Created by Kamil on 16.02.16.
 */
public class Boing007 extends Boing{

    public Boing007(String name, Integer colPas, String numAir, String from, String to,Cargo cargo, Passanger passanger) {
        super(name, colPas, numAir, from, to, cargo, passanger);
        this.name = "007";
        this.colPas = 7;
        this.from ="Kazan";
        this.to="Moscow";
    }
}
