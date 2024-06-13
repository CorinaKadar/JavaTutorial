package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {

    //Comentariu
    //Recunoastem o clasa intr-un fisier Java(ex.java) dupa cuvantul cheie class
    //Intr-un fisier java putem avea o multime de clase pe care le diferentiem prin numele lor
    //Nu este un practice bun in java sa avem intr-un fisier mai multe clase
    //In fiecare clasa trebuie sa definim un nume
    //Intelegem printr-o clasa ca fiind un sablon specific din viata reala
    //Intr-o clasa putem definii variabile si metode
    //Variabila = proprietatea/atributul unei clase
    //Intr-o clasa putem avea o multime de variabile
    //Variabilele se diferentiaza prin tip si nume
    //Variabilele pot sa fie de 2 feluri: global si local
    //Vabiabila Globala = proprietate vizibila oriunde in cod
    //Variabila Locala = proprietate vizibila doar in locul definit
    //Tipuri de date des folosite: String (sir de caractere), Integer (nr intreg), Double/Float (nr cu zecimale), Character (ex F sau M), Boolean
    //Diferenta dintre Double (64 bt) si Float (32 bt) ii cum se aloca valoarea lor in memorie si cate zecimale sunt necesare a fi vizibile


    public String nume;
    public String prenume;
    public Integer varsta; // definita in interiorul clasei devine by default variabila globala
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;

    //Metoda = actiunea unei clase
    //Intr-o clasa putem avea o multime de metode diferentiate prin numele acestora
    //Exista 2 tipuri de metode: void si return
    //Metoda Void = actiune pe care vrem sa o afisam/interpretam fara a fi nevoie sa o returnam
    //Pentru o metoda trebuie sa specificam un access control (Public), (), {}

    //@Test //adnotare recunoscuta din dependency pusa ulterior
    //public void descrieCursant () {
        //nume = "Kadar";
        //prenume = "Corina";
        //varsta = 30;
        //adresa = "123.! Coconut Lane";
        //inaltime = 1.65;
        //greutate = 58.00f; // f = conversie din double in float, prin f o vede ca Float
        //sex = 'F'; // '' pt Character (1 character) iar "" pt String
        // areRestante = false; daca ii pus de mai multe ori citeste doar ultima valoare atribuita
        //areRestante = true;

        //System.out.print(nume);
        //System.out.print(prenume);
        //System.out.print(varsta);
        //bucata de cod fara valoare momentan, pt a primii valoare si a aparea butonul de Run se pune @Test
        //print printeaza si ramane pe acelasi rand

        //System.out.println(nume);
        //System.out.println(prenume);
        //println printeaza si sare la randul urmator

        //System.out.print(nume + " " + prenume + " " + varsta); //concatenare

        //System.out.println(varsta); //sout
        //System.out.println(adresa);
        //System.out.println(inaltime);
        //System.out.println(greutate);
        //System.out.println(sex);
        //System.out.println(areRestante);

        //System.out.println("Numele cursantului este " + nume + "."); // concatenare -> customizare a afisarilor
        //System.out.println("Prenumele cursantului este " + prenume + ".");
        //System.out.println("Varsta cursantului este " + varsta + " ani.");
        //System.out.println("Adresa cursantului este " + adresa + ".");
        //System.out.println("Inaltimea cursantului este " + inaltime + " m.");
        //System.out.println("Greutatea cursantului este " + greutate + " kg.");
        //System.out.println("Sexul cursantului este " + sex + ".");
        //System.out.println("Are cursantul restante? " + areRestante);


    @Test //Curs3
    public void metodaTest() {
        descrieCursant(); // apelam/refolosim o metoda existenta
        primesteBursa();
    }

    public void primesteBursa() {

        Integer bursa = 1000; // definita in interiorul metodei devine variabila locala
        System.out.println("Bursa cursantului este " + bursa);
    }

    public void descrieCursant () {
        nume = "Kadar";
        prenume = "Corina";
        varsta = 30;
        adresa = "123.! Coconut Lane";
        inaltime = 1.65;
        greutate = 58.00f; // f = conversie din double in float, prin f o vede ca Float
        sex = 'F'; // '' pt Character (1 character) iar "" pt String
        // areRestante = false; daca ii pus de mai multe ori citeste doar ultima valoare atribuita
        areRestante = true;

        System.out.println("Numele cursantului este " + nume + "."); // concatenare -> customizare a afisarilor
        System.out.println("Prenumele cursantului este " + prenume + ".");
        System.out.println("Varsta cursantului este " + varsta + " ani.");
        System.out.println("Adresa cursantului este " + adresa + ".");
        System.out.println("Inaltimea cursantului este " + inaltime + " m.");
        System.out.println("Greutatea cursantului este " + greutate + " kg.");
        System.out.println("Sexul cursantului este " + sex + ".");
        System.out.println("Are cursantul restante? " + areRestante);

    }

}
