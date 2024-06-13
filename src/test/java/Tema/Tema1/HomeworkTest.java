package Tema.Tema1;

import org.testng.annotations.Test;

public class HomeworkTest {

    @Test
    public void test1(){
        Homework1 homew1 = new Homework1();
        //variabilele definite de o clasa devin obiecte apoi am atribuit obiectului referinta catre clasa, astfel se pot apela metodele si proprietatile dintr-o clasa

        System.out.println("1. Hello World");
        homew1.helloWorld();
        homew1.afisareR();
        //System.out.println(homew1.helloWorld() + homew1.afisareR()); //-- apelare in cazul in care am cerut metodelor sa-mi returneze o variabila -> Return
        System.out.println();

        System.out.println("2. Varsta ta (numar)");
        homew1.varstaTa();
        homew1.afisareR();
        System.out.println();

        System.out.println("3. Numele si prenumele pe 2 randuri");
        homew1.numePrenume();
        homew1.afisareR();
        System.out.println();

        System.out.println("4. Adauga la 'Salut' caracterul 'M' la final");
        homew1.salutM();
        homew1.afisareR();
        System.out.println();

        System.out.println("5. Adauga la 'Hello' caracterul 'H' la inceput");
        homew1.hHello();
        homew1.afisareR();
        System.out.println();

        System.out.println("6. Adauga la 'Ana are mere,pere,prune' dupa fiecare vocala de la finalul cuvantului caracterul 'Z'");
        homew1.charZ();
        homew1.afisareR();
        System.out.println();

        System.out.println("7. Adauga la toate rezultatele obtinute ' Poti pleca acasa dupa ce iti verific munca!'");
        homew1.afisareR();
        System.out.println();

        System.out.println("8. Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;");
        homew1.salariuAngajat("Andrei", 10000);
        homew1.salariuAngajat("Norbert", 20000);
        homew1.afisareR();
        System.out.println();

        System.out.println("9. Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este 'Popescu'");
        homew1.idDepartamentAngajat("Popescu", 10101, "Resurse Umane");
        homew1.idDepartamentAngajat("Pop", 20202, "Financiar");
        homew1.afisareR();
        System.out.println();

        System.out.println("10. Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;");
        homew1.numarDepartament(288);
        homew1.numarDepartament(286);
        homew1.afisareR();
        System.out.println();

        System.out.println("Afisati in consola rezultatul ecuatiei:[2+(3*4)-3]/3");
        homew1.ecuatie();
    }
}
