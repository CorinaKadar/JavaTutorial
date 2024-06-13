package Tema.Tema1;

import org.testng.annotations.Test;

public class Homework1 {

    @Test
    public void test1(){
        helloWorld();
        varstaTa();
        numePrenume();
        salutM();
        hHello();
        charZ();
        afisareR();
        salariuAngajat("Andrei", 10000);
        salariuAngajat("Norbert", 20000);
        idDepartamentAngajat("Popescu", 10101, "Resurse Umane");
        idDepartamentAngajat("Pop", 20202, "Financiar");
        numarDepartament(288);
        numarDepartament(286);
        ecuatie();
    }

   // 1. Hello World
    public void helloWorld() {
        String HW = "Hello World";
        System.out.println(HW);
    }

    // --> Am cerut metodei sa-mi returneze o variabila de tip String. Cand metoda va fi apelata va fi tratata ca si un string
//    public String helloWorld(){
//        String HW = "Hello World";
//        return HW;
//    }

    // 2. Varsta ta (numar)
    public void varstaTa(){
        Integer varsta = 30;
        System.out.println("Varsta: " + varsta + " ani");
    }

    // 3. Numele si prenumele pe 2 randuri
    public void numePrenume(){
        String nume = "Kadar";
        String prenume = "Corina";
        System.out.println("Nume: " + nume);
        System.out.println("Prenume: " + prenume);
    }

    // 4. Adauga la "Salut" caracterul "M" la final
    public void salutM(){
        String salut = "Salut";
        Character ch = 'M';
        System.out.println(salut + ch);

        //salutNew = salut + ch;
        //System.out.println(salutNew);
    }

    // 5. Adauga la "Hello" caracterul "H" la inceput
    public void hHello(){
        String hello = "Hello";
        Character chh = 'H';
        System.out.println(chh + hello);

        //helloNew = hello + chh;
        //System.out.println(helloNew);
    }

    // 6. Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"
    public void charZ(){
        String myStr = "Ana are mere,pere,prune";

        //afiseaza noul rezultat dupa replace dar nu salveaza valoarea
        //System.out.println(myStr.replace("Ana are mere,pere,prune", "AnaZ areZ mereZ,pereZ,pruneZ"));

        // variabilei initiale i-am atribuit o noua valoare/structura apoi l-am afisat
        myStr = myStr.replace("Ana are mere,pere,prune","AnaZ areZ mereZ,pereZ,pruneZ" );
        System.out.println(myStr);

        //Afisare Z dupa fiecare vocala din Stringul "Ana are mere,pere,prune"
        //myStr = myStr.replace("A", "AZ").replace("a", "aZ").replace("e", "eZ").replace("u", "uZ");
        //System.out.println(myStr);
    }

    // 7. Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!"
    public void afisareR(){
        String afisare = " Poti pleca acasa dupa ce iti verific munca!";
        System.out.println(afisare);
    }

    // --> Am cerut metodei sa-mi returneze o variabila de tip String. Cand metoda va fi apelata va fi tratata ca si un string
//    public String afisareR(){
//        String afisare = " Poti pleca acasa dupa ce iti verific munca!";
//        return afisare;
//    }

    // 8. Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;
    public void salariuAngajat(String prenume, Integer salariu){
        if (prenume == "Andrei"){ //prenume.equels("Andrei")
            System.out.println(prenume + " - Salariul angajatului este: " + salariu + " lei.");
        } else {
            System.out.println(prenume);
        }
    }

    // 9. Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"
    public void idDepartamentAngajat(String nume, Integer id, String departament){
        if (nume == "Popescu"){
            System.out.println(nume + " - ID-ul angajatului este " + id + " aflat in Departamentul " + departament);
        } else {
            System.out.println(nume);
        }
    }

    // 10. Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;
    public void numarDepartament(Integer numar){
        if (numar > 287){
            System.out.println("Numarul departamentului este " + numar);
        }
    }

    // Afisati in consola rezultatul ecuatiei:[2+(3*4)-3]/3 ?
    public void ecuatie(){
        Double rezultat = (2.0 +(3.0 *4.0)-3.0)/3.0;
        System.out.println("Rezultatul corect este: " + rezultat);
    }
}
