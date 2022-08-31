package programmer.command.line.application;

import programmer.command.line.data.City;
import programmer.command.line.data.Location;

public class LocationApp {
    public static void main(String[] args) {

        //var location = new Location();
        var city = new City();
        city.name = "Bandung";

        System.out.println(city.name);
    }
}
