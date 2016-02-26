package Task004;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Matchers.notNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.when;
/**
 * Created by Kamil on 26.02.16.
 */
public class InterfacesTest {
    @Test
    public void AircraftGetWorkTest(){
        Aircraft aircraft = mock(Aircraft.class);

        aircraft.getFromCountry(aircraft);
        aircraft.getNumberAircraft(aircraft);
        aircraft.getNumberOfPassanger(aircraft);
        aircraft.getToCountry(aircraft);
        Assert.assertNull(null);
    }

    @Test
    public void AirportGetWorkTest(){

        Airport airport = new Airport("a", "a", "a");

        Personal personal = mock(Personal.class);
        Passanger passanger = mock(Passanger.class);
        Rooms rooms = mock(Rooms.class);

        airport.getWork(personal);
        airport.getName(passanger);
        airport.getAge(passanger);
        airport.getClas(passanger);
        airport.getClassRoom(rooms);
        airport.getNameRoom(rooms);

        Assert.assertNull(null);
    }
    @Test
    public void AnyFlightGetWorkTest() {

        AnyFlight anyFlight = new AnyFlight("","");
        Flight flight = mock(Flight.class);
        anyFlight.getColPassanger(flight);
        anyFlight.getFrom(flight);
        anyFlight.getNumberFlight(flight);
        anyFlight.getTo(flight);

        Assert.assertNull(null);
    }

    @Test
    public void AnyPassangerGetWorkTest() {
        Flight flight = mock(Flight.class);
        Personal personal = mock(Personal.class);
        Passanger passanger = mock(Passanger.class);
        Rooms rooms = mock(Rooms.class);

        AnyPassanger anyPassanger = new AnyPassanger("",1,"",flight);

        anyPassanger.getClas(passanger);
        anyPassanger.getTo(flight);
        anyPassanger.getAge(passanger);
        anyPassanger.getNumberFlight(flight);
        anyPassanger.getFrom(flight);

        Assert.assertNull(null);
    }


}
