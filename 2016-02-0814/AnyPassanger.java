/**
 * Created by Kamil on 16.02.16.
 */
public class AnyPassanger implements Passanger, Flight {

    String name = null;
    Integer age = null;
    String classP = null;
    Flight flight = null;
    public AnyPassanger(String name, Integer age, String classP, Flight flight){
        this.name = name;
        this.age = age;
        this.classP = classP;
        this.flight = flight;
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
    public Integer getNumberFlight(Flight flight) {
        return null;
    }

    @Override
    public Integer getColPassanger(Flight flight) {
        return null;
    }

    @Override
    public String getFrom(Flight flight) {
        return null;
    }

    @Override
    public String getTo(Flight flight) {
        return null;
    }
}
