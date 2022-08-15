package day1.alt;


import day1.*;

public class Main {

    public static void main(String[] args) {


        // at the end, vom avea 2 librarii cu cate x jocuri in fiecare
        Biblioteca b = new Biblioteca();
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
    }
}
