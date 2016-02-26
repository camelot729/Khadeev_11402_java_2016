package Task004;

/**
 * Created by Kamil on 15.02.16.
 */
public interface Flight {

    Integer numberFlight =null;
    Integer colPassanger = null;
    String from = null;
    String to = null;

    Integer getNumberFlight(Flight flight);
    Integer getColPassanger(Flight flight);
    String getFrom(Flight flight);
    String getTo(Flight flight);


}
