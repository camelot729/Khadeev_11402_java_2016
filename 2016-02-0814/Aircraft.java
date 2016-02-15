import java.util.SplittableRandom;

/**
 * Created by Kamil on 15.02.16.
 */
public interface Aircraft {

    String numberAircraft = null;
    String fromCountry = null;
    String toCountry = null;

    Integer numberOfPassanger = null;

    String getNumberAircraft(Aircraft aircraft);
    String getFromCountry(Aircraft aircraft);
    String getToCountry(Aircraft aircraft);
    Integer getNumberOfPassanger(Aircraft aircraft);
}
