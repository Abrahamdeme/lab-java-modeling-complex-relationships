package Association.nurses.Association.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String district;
    @OneToOne
    private Member president;

    @OneToMany
    private List<Member> members;

    public <T> Chapter(String southDistrictChapter, String southDistrict, Member member3, List<T> list) {

    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
