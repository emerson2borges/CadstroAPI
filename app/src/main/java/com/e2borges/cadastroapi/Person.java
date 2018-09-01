package com.e2borges.cadastroapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

    private Long id;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @Override
    public String toString() {
        return "Pessoa {" + '\n' +
                " Id: " + id + '\n' +
                " Nome: " + firstName + '\n' +
                " Sobrenome: " + lastName + '\n' +
                '}';

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
