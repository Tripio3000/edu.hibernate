package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "passangers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "passanger_id")
    private long id;

    private String firstname;

    @OneToMany (mappedBy = "passenger", cascade=CascadeType.ALL)
//    @JoinColumn(name = "seat_id")
    private List<Seat> seats;

    public Passenger() {
    }

    public Passenger(String firstname) {
        this.firstname = firstname;
        seats = new ArrayList<>();
    }

    public void addSeat(Seat seat) {
        seat.setPassenger(this);
        seats.add(seat);
    }

    public void removeSeat(Seat seat) {
        seats.remove(seat);
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

}
