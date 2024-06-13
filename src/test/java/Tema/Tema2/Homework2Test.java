package Tema.Tema2;

import org.testng.annotations.Test;

public class Homework2Test {

    @Test
    public void test2() {
        Homework2 homew2 = new Homework2();
        //variabilele definite de o clasa devin obiecte apoi am atribuit obiectului referinta catre clasa, astfel se pot apela metodele si proprietatile dintr-o clasa

        System.out.println("1. Afisam in consola de 5 ori cuvantul 'DA' pe acelasi rand cu un spatiu intre;");
        homew2.afisareDA();
        System.out.println();

        System.out.println("2. Afisam in consola primele 3 numere de la 1 la 3;");
        //homew2.afisareNrFor();
        homew2.afisareNrWhile();
        System.out.println();

        System.out.println("3. Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;");
        homew2.nrMaiMare(15, 20);
        //homew2.nrMaiMare(20, 15);
        System.out.println();

        System.out.println("4. Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;");
        homew2.nrMaiMic(4.5, 3.25);
        //homew2.nrMaiMic(3.25, 4.5);
        System.out.println();

        System.out.println("5. Afisam in consola numerele pare si numerele impare pana la 10 (utilizam 'for');");
        homew2.afisareNrPareImpare();
        System.out.println();

        System.out.println("6. Afisam in consola doar numerele pare pana la 10 (utilizam 'for');");
        homew2.afisareNrPare();
        System.out.println();

        System.out.println("7. Afisam in consola numerele divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;");
        homew2.nrDivizibilCu5(10);
        homew2.nrDivizibilCu5(7);
        System.out.println();

        System.out.println("8. Afisam in consola primele 3 numere divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;");
        homew2.nrDivizibilCu5V3();
        System.out.println();

        System.out.println("9. Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE;");
        homew2.sumaNr();
        System.out.println();

        System.out.println("10. Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE;");
        homew2.sumaNrPanaLa10();
        System.out.println();

        System.out.println("11. Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE;");
        homew2.produsulNrPanaLa5();
    }
}
