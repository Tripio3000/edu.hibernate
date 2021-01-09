package models;

import javax.persistence.*;

@Entity
@Table(name = "passanger")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "passanger_id")
    private long id;

    private String firstname;

    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name = "seat_id")
    private Seat seat;

    public Passenger() {
    }

    public Passenger(String firstname) {
        this.firstname = firstname;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
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
