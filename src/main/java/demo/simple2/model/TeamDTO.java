package demo.simple2.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;


public class TeamDTO {

    private Long id;

    @NotNull
    @Size(max = 255)
    private String teamId;

    @NotNull
    @Size(max = 255)
    private String name;

    private List<Long> teamPersons;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(final String teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Long> getTeamPersons() {
        return teamPersons;
    }

    public void setTeamPersons(final List<Long> teamPersons) {
        this.teamPersons = teamPersons;
    }

}
