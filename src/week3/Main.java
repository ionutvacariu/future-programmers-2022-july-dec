package week3;

import day1.Joc;

public class Main {
    public static void main(String[] args) {

        //Alexandra -- draw the STACK/HEAP
        String a = " ASDASD";
        String b = " ASDASD";
        //atunci cand un string se construieste cu new --> se pune in heap-ul normal, nu in SP
        String c = new String(" ASDASD");

        int i = 0;
        // variabila ++ --> intai foloseste valoarea, apoi incrementeaza
        System.out.println(i++);
        // ++ variabila --> intai incrementeaza valoarea, apoi foloseste
        System.out.println(i++);
        if (++i == 3 && ++i == 3) {
            System.out.println("AICI" + i);
        }
        System.out.println(i);

        increment(i);
        System.out.println(i);
        // 4

        //____________________________
        //apel constructor default
        Joc j = new Joc();
        // apel constr cu parametri
        Joc j1 = new Joc(200);

        Person p = new Person("va", "IO", "194833888333");
//        p.setNume("ASDASDASD");
        modificarePers(p);
        System.out.println(p.getNume()); // ==> VA
    }

    static void modificarePers(Person nume) {
        //this.nume --> nu poate fi facut, "this" nu exista, deoarece metoda este statica deci nu va fi apelata "pentru " o instanta care sa fie this
        nume.setNume(nume.getNume().toUpperCase());

    }

    // modificator_de_acces static/non_static tip_returnat denumir (tip_param param, tip_param2 param2){ corp functie }


    static void increment(int a) {
        a = ++a;
        System.out.println(a);
        // 5
    }
}
