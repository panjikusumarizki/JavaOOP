package programmer.command.line.application;

import static programmer.command.line.data.Application.PROCESSORS;
import static programmer.command.line.data.Constant.*;
import programmer.command.line.data.Country;
import programmer.command.line.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,1,2,3,4,5));

        Country.City city = new Country.City();
        city.setName("Bandung");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
