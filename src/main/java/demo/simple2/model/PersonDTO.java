package demo.simple2.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class PersonDTO {

    private Long id;

    @NotNull
    @Size(max = 255)
    private String personId;

    @NotNull
    @Size(max = 255)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
