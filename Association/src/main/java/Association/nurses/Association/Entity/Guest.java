package Association.nurses.Association.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Guest {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private GuestStatus status;

    public Guest(String emilyGreen, GuestStatus guestStatus) {

    }

    public GuestStatus getStatus() {
        return status;
    }

    public void setStatus(GuestStatus status) {
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
