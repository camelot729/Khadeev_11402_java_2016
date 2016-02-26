package Task004;

/**
 * Created by Kamil on 16.02.16.
 */
public class Boing700 extends Boing{
    public Boing700(String name, Integer colPas, String numAir, String from, String to,Cargo cargo, Passanger passanger) {
        super(name, colPas, numAir, from, to, cargo, passanger);
        this.name = "700";
        this.colPas = 700;
        this.from ="Moscow";
        this.to="Kazan";
    }
}
