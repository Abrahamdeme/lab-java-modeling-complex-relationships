package Association.nurses.Association.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Conference extends Event {
    @OneToMany
    private List<Speaker> speakers;

    public <T> Conference(String nursingInnovationsConference, LocalDate of, int i, String conferenceHallA, List<T> list, List<T> list1) {
            super(nursingInnovationsConference, of, i, conferenceHallA, list, list1);
    }

    public Conference() {
        super();
    }

    public Conference(String annualHealthExpo, LocalDate of, int i, String expoCenterB, Object o) {
        super(annualHealthExpo, of, i, expoCenterB, o);
    }

    public Conference(String annualHealthExpo, LocalDate of, int i, String expoCenterB, List<?> or, Object o, Object o1) {

    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
