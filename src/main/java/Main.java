import Services.PassangerService;
import models.Passenger;
import models.Seat;
import org.hibernate.SessionFactory;
import util.*;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();

        PassangerService passangerService = new PassangerService();
        Passenger passenger1 = new Passenger("Alex");
        Passenger passenger2 = new Passenger("Elena");

        passangerService.saveUser(passenger1);
        passangerService.saveUser(passenger2);

        Seat seat1 = new Seat();
        Seat seat2 = new Seat();

        seat1.setPassenger(passenger1);
        seat2.setPassenger(passenger2);

        passenger1.setSeat(seat1);
        passenger2.setSeat(seat2);

        passangerService.updateUser(passenger1);
        passangerService.updateUser(passenger2);
    }
}
