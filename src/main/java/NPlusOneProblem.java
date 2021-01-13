import models.Passenger;
import models.Seat;
import org.hibernate.Session;
import util.*;

import java.util.List;

public class NPlusOneProblem {
    public static void main(String[] args) {
        try (Session session = hibernateUtil.getSessionFactory().openSession()) {
            List<Passenger> passengers = session.createQuery("From Passenger", Passenger.class).getResultList();

            for (Passenger passenger : passengers) {
                System.out.println("Passangers list:  ");

                System.out.println(passenger.getId() + passenger.getFirstname());
//                List<Seat> seats = passenger.getSeats();
//                System.out.println("Seats list:  ");
//                for (Seat seat : seats) {
//                    System.out.println(seat.getId());
//                }
            }
        }
    }
}
