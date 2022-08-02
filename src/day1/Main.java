package day1;


public class Main {

    public static void main(String[] args) {

        // at the end, vom avea 2 librarii cu cate x jocuri in fiecare
        Biblioteca b = new Biblioteca();
        Joc j = new Joc();

        j.numeJoc = "dota";
        j.pret = 299;
        j.date = "1223/33/33";
        j.tipDeJoc = "RPG";

        b.addGame(j);

        System.out.println(b.jocuri[0].numeJoc);
        Biblioteca c = new Biblioteca();
        c.addGame(j);


        /*
        jocurile vor avea valori fixe, dar pentru apelul
        functiei de remove, jocul care se scoate
        va fi citit de la tastatura
         */
    }

}
