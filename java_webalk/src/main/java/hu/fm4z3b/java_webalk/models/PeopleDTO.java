package hu.fm4z3b.java_webalk.models;

import jakarta.validation.constraints.NotEmpty;

public class PeopleDTO {
    @NotEmpty(message = "The firstname is required")
    private String firstname;

    @NotEmpty(message = "The lastname is required")
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
