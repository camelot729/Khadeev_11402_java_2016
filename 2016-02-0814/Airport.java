/**
 * Created by Kamil on 16.02.16.
 */
public class Airport implements Rooms, Personal,Passanger {
    String name = null;
    String country = "?";
    String city="?";
    Rooms rooms = null;
    Personal personal;
    public Airport(String name, String country, String city, Rooms rooms, Personal personal){
        this.name = name;
        this.country = country;
        this.city = city;
        this.rooms = rooms;
        this.personal = personal;
    }

    public Airport(String name, String country, String city) {
    }

    @Override
    public String getWork(Personal personal) {
        return null;
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
    public String getNameRoom(Rooms rooms) {
        return null;
    }

    @Override
    public String getClassRoom(Rooms rooms) {
        return null;
    }
}
