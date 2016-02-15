/**
 * Created by Kamil on 16.02.16.
 */
public class KazanAirport extends Airport{

    public KazanAirport(String name, String country, String city, Rooms rooms, Personal personal) {
        super(name, country, city, rooms, personal);
        this.country = "Russia";
        this.city = "Kazan";
    }
}
