package Association.nurses.Association.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private int duration;
    private String location;
    private String title;

    @OneToMany
    private List<Guest> guests;

    public <T> Event(String communityHealthOutreach, LocalDate of, int i, String communityCenter, List<T> list) {

    }

    public <T> Event(String nursingInnovationsConference, LocalDate of, int i, String conferenceHallA, List<T> list, List<T> list1) {

    }

    public Event(String annualHealthExpo, LocalDate of, int i, String expoCenterB, Object o) {
    }

    public Event() {


    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
