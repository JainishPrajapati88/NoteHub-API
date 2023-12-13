package com.techiesbytes.NoteHub;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class NoteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Please add heading.it's important.")
    private String heading;

    @NotBlank(message = "What dumb you are. Note without description???")
    private String description;

    public NoteEntity()
    {

    }

    public NoteEntity(Long id, String heading, String description) {
        this.id = id;
        this.heading = heading;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "NoteEntity{" +
                "id=" + id +
                ", heading='" + heading + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
