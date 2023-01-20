package Models;



import jakarta.persistence.*;

@Entity
@Table(name = "professor")


public class ProfessorModel {

    String names;
    String lastnames;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long id;
    Integer age;

    String subject;

    public ProfessorModel() {
    }

    public ProfessorModel(String names, String lastnames, Long id, Integer age, String subject) {
        this.names = names;
        this.lastnames = lastnames;
        this.id = id;
        this.age = age;
        this.subject = subject;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastnames() {
        return lastnames;
    }

    public void setLastnames(String lastnames) {
        this.lastnames = lastnames;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
