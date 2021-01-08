import Services.PassangerService;
import models.Passenger;
import models.Seat;
import org.hibernate.SessionFactory;
import util.*;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();

//        PassangerService passangerService = new PassangerService();
//        Passenger passenger1 = new Passenger("Alex", "Kon");
//        passangerService.saveUser(passenger1);
//        Seat seat1 = new Seat();
//        seat1.setPassenger(passenger1);
//        passenger1.setSeat(seat1);
    }
}
