package day1;

public class Biblioteca {

    Joc[] jocuri = new Joc[20];
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
    void addGame(Joc j) {




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

    /*
    Sterge jocul din biblioteca dupa numele acestuia

    ce se intampla daca numele nu exista ?

    Dupa fiecare remove reusit toate elementele de DUPA trebuie mutate la stanga, astfel incat sa NU ramana spatii “goale” in vector.
     */
    void remove(String numeJoc) {

    }

}

