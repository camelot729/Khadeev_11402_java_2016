import jdk.nashorn.internal.objects.NativeUint16Array;

/**
 * Created by Kamil on 16.02.16.
 */
public class Boing implements Aircraft,Passanger, Cargo {

    String name = null;
    Integer colPas = null;
    String numAir = null;
    String to = null;
    String from = null;

    Passanger passanger = null;
    Cargo cargo = null;
    public Boing(String name, Integer colPas, String numAir, String from, String to, Cargo cargo, Passanger passanger){
        this.name = name;
        this.colPas =colPas;
        this.from = from;
        this.numAir = numAir;
        this.to = to;
        this.passanger = passanger;
        this.cargo = cargo;
    }

    @Override
    public String getName(Passanger passanger) {
        return null;
    }

    @Override
    public String getAge(Passanger passanger) {
        return null;
    }

    @Override
    public String getClas(Passanger passanger) {
        return null;
    }

    @Override
    public String getNumberAircraft(Aircraft aircraft) {
        return null;
    }

    @Override
    public String getFromCountry(Aircraft aircraft) {
        return null;
    }

    @Override
    public String getToCountry(Aircraft aircraft) {
        return null;
    }

    @Override
    public Integer getNumberOfPassanger(Aircraft aircraft) {
        return null;
    }

    @Override
    public String WhoseCargo(Passanger passanger) {
        return null;
    }

    @Override
    public String numberFlight(Flight flight) {
        return null;
    }
}
