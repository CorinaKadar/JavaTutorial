package Tema.Tema2;

import org.testng.annotations.Test;

public class Homework2 {

    @Test
    public void test2() {
        afisareDA();
        afisareNrFor();
        afisareNrWhile();
        nrMaiMare(15, 20);
        nrMaiMare(20, 15);
        nrMaiMic(4.5, 3.25);
        nrMaiMic(3.25, 4.5);
        afisareNrPareImpare();
        afisareNrPare();
        nrDivizibilCu5(10);
        nrDivizibilCu5(7);
        nrDivizibilCu5V3();
        sumaNr();
        sumaNrPanaLa10();
        produsulNrPanaLa5();
    }

    // 1. Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;
    public void afisareDA(){
        String afisare = "DA";
        for (Integer index=0; index<5; index++ ){
            System.out.print(afisare + " ");
        }
        System.out.println();
    }

    // 2. Afisam in consola primele 3 numere de la 1 la 3;
    public void afisareNrFor(){
        for (Integer index=1; index<=3; index++ ){
            System.out.println(index);
        }
    }

    public void afisareNrWhile() {
        Integer index = 1;
        while (index <= 3){
            System.out.println(index);
            index++;
        }
    }

    // 3. Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void nrMaiMare (Integer a, Integer b){
        if (a > b){
            System.out.println(a + " este mai mare ca " + b);
        } else {
            System.out.println(b + " este mai mare ca " + a);
        }
    }

    // 4. Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void nrMaiMic (Double a, Double b){
        if (a < b){
            System.out.println(a + " este mai mic ca " + b);
        } else {
            System.out.println(b + " este mai mic ca " + a);
        }
    }

    // 5. Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");
    public void afisareNrPareImpare(){
        for (Integer index=0; index<=10; index++ ){
            if (index%2==0){ // index%2==1 sa afiseze impar
                System.out.println("Numarul " + index + " este par.");
            }
            else { //fara else afiseaza doar ce-i par
                System.out.println("Numarul " + index + " este impar.");
            }
        }
    }

    // 6. Afisam in consola doar numerele pare pana la 10 (utilizam "for");
    public void afisareNrPare() {
        for (Integer index = 0; index <= 10; index++) {
            if (index % 2 == 0) { // index%2==1 sa afiseze impar
                System.out.println("Numarul " + index + " este par.");
            }
        }
    }

    // 7. Afisam in consola numerele divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void nrDivizibilCu5(Integer a) {
            if (a % 5 == 0) {
                System.out.println("Numarul " + a + " este divizibil cu 5.");
            }
    }

    // 8. Afisam in consola primele 3 numere divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void nrDivizibilCu5V3() {
        for (Integer a = 1; a <= 15; a++) {
            if (a % 5 == 0) {
                System.out.println("Numarul " + a + " este divizibil cu 5.");
            }
        }
    }

    // 9. Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE;
    public void sumaNr(){
        Integer a = 235;
        Integer b = 10;
        Integer suma = a + b;
        System.out.println("Suma numerelor este " + suma);
    }

    // 10. Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE;
    public void sumaNrPanaLa10(){
        Integer suma = 0;
        for (Integer a = 1; a <= 10; a++) {
            suma = suma + a;
        }
        System.out.println("Suma numerelor pana la 10 este " + suma);
    }

    // 11. Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE;
    public void produsulNrPanaLa5(){
        Integer produs = 1;
        for (Integer a = 1; a <= 5; a++) {
            produs = produs * a;
        }
        System.out.println("Produsul numerelor pana la 5 este " + produs);
    }


}
