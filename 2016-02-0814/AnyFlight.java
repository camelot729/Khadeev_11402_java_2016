/**
 * Created by Kamil on 16.02.16.
 */
public class AnyFlight implements Flight {

    String from = "?";
    String to = "?";


    Flight flight = null;

    public AnyFlight(String from, String to ){
        this.from = from;
        this.to = to;
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
