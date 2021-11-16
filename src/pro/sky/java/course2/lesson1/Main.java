package pro.sky.java.course2.lesson1;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Transport[] transports = new Transport[]{
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1",6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1",2),
                new Bicycle("bicycle2",2),
        };

        ServiceStation station = new ServiceStation();

        for (Transport transport: transports) {
            station.check(transport);
        }
    }
}