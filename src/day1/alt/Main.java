package day1.alt;


import day1.*;
import week3.Person;

public class Main {

    public static void main(String[] args) {


        // at the end, vom avea 2 librarii cu cate x jocuri in fiecare
        Biblioteca b = citireFisier();
        Joc j = new Joc();
        j.setNume("GiGeL");
        Film f = new Film();
        f.setNume("orice");

        Carti c = new Carti();
        c.setNume("Cartea mea");
        b.add(f);
        b.add(j);
        b.add(c);

        for (Produs p : b.getP()) {
            System.out.println(p.getNume());

            if (p instanceof Film) {
                double durata = ((Film) b.getP()[0]).getDurata();
            } else if (p instanceof Joc) {
                ((Joc) p).isMultiplayer();
            }
        }


        String opt = key.read();

        if (opt.equals("citire_fisier")) {
            Biblioteca citita = citireFisier();
        }
    }

    private static Biblioteca citireFisier() {
        Biblioteca b = new Biblioteca();
        while (am linii de citit){
            // afisare
            Produs p = citireLinieFisier();

            b.add(p);
        }
        return b;
    }

    private static Produs citireLinieFisier() {
        String[] s = citireSiSplit();
        if (s[0].equals("Film")) {
            Film f = new Film();
            f.setNume(s[1]);
            f.setDurata(Double.valueOf(s[2]));

            String[] actori = s[3].split(";");
            for (String a : actori) {

                String[] pers = a.split(".");
                Person p = new Person(pers[0], pers[1], pers[2]);

                f.getActori().add(p);
            }
            return f;
        }
        return null;
    }
}
