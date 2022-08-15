package day1;

import week3.Person;

import java.util.List;

public class Film extends Produs {

    private String gender;

    private double durata;
    private List<Person> actori;


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    public List<Person> getActori() {
        return actori;
    }

    public void setActori(List<Person> actori) {
        this.actori = actori;
    }

    //overriding
    public String getNume() {
        return nume.toUpperCase();
    }

}
