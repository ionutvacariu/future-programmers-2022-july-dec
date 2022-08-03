package week3;

public class Person {
    private String nume;
    private String prenume;
    private String cnp;
    private int varsta;
    //.... aici mai sunt cateva atribute

    public Person(String num, String prenume, String cnp) {

        nume = num;
        this.prenume = prenume;
        this.cnp = cnp;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
