package models;

import java.util.Objects;

public abstract class Person {
    protected String id; // Using protected access modifier.
    protected String firstName;
    protected String lastName;
    protected Gender gender;
    protected Country country;

    public Person(String id, String firstName, String lastName, Gender gender,
                  Country country){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    abstract public void walk(); // Defining an abstract method
}
