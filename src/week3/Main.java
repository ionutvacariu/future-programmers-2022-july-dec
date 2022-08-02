package week3;

import day1.Joc;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int j = 3;

        int a = i;
        i = j;
        j = a;

        System.out.println(i); // aici trebuie sa aiba valoarea initiala a lui J
        System.out.println(j);// aici trebuie sa aiba valoarea initiala a lui I

        Joc joc = new Joc();


    }
}
