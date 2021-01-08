package models;

import javax.persistence.*;

@Entity
@Table (name="seat")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @JoinColumn(name = "passanger_id")
    private Passenger passenger;

    public Seat() {
    }

    public long getId() {
        return id;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Passenger getPassenger() {
        return passenger;
    }
}
