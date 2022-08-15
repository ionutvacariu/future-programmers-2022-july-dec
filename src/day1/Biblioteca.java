package day1;

public class Biblioteca {

    Joc[] jocuri = new Joc[20];
    Film[] filme;
    Carti[] carti;


    Produs[] p = new Produs[20];

    public Produs[] getP() {
        return p;
    }

    public void setP(Produs[] p) {
        this.p = p;
    }

    String nume;

    /*
    Adauga jocul j, in lista/vectorul jocuri
    la prima pozitie libera.

    ce se intampla daca incerc sa adug un al 21-lea joc? -- de tratat cazul cu
    sout(nu mai sunt pozitii libere)

    inainte de a adauga un joc, verifica daca numele acestuia
    este deja in vector

    tema ptr weekend:
    daca vectorul actual a ajuns la capacitate maxima -- cream un nou vector
        de dimensiune dubla, si adaugam jocul j in noul vecotr.
     */
    public void addGame(Joc j) {
        for (int i = 0; i < jocuri.length; i++) {
            if (jocuri[i] == null) {
                jocuri[i] = j;
                break;

            }
        }

        Joc[] temp = new Joc[jocuri.length * 2];
        //for --> mutam din jocuri in temp
        jocuri = temp;

    }

    public void add(Produs j) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] == null) {
                p[i] = j;
                break;

            }
        }
    }

    /*
    Sterge jocul din biblioteca dupa numele acestuia

    ce se intampla daca numele nu exista ?

    Dupa fiecare remove reusit toate elementele de DUPA trebuie mutate la stanga, astfel incat sa NU ramana spatii “goale” in vector.
     */
    public void remove(String numeJoc) {

    }
}