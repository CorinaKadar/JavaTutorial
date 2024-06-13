package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structuri alternative: If.. Then.. Else../Switch..Case..
    //If se bazeaza pe conditie, switch se bazeaza pe valoare in cazul in care stim valorile si sunt mai putine (ex: zilele saptamanii ce pot fi doar 7: 1-Luni, 2-Marti .. )
    //Switch ii mult mai structurat, mai usor de citit, sintaxa e mai simplificata
    //Switch cu if poti sa schimbi dar if cu switch nu poti sa schimbi pt ca nu acopera conditiile if-ului
    //Switch se poate folosii la site-uri cu meniuri/submeniuri
    //Switch ii mai rapid decat if pt ca sare direct la cazul cerut si parcurge de acolo pe cand if parcurgea toate conditiile de la inceput

    @Test
    public void metodaTest() {
        //verificNrMaiMare();
        //verificNrMaiMareV2(11);
        //verificNrMaiMareV2(8);
//        verificNrPar(7);
//        verificNrPar(6);
//        verificNrPar(0);
//        verificNrPar(-1);
//        verificNrPar(-4);
        zileSaptamana(2);
        zileSaptamana(8);
    }

    //verificam daca un numar este mai mare decat 10
    public void verificNrMaiMare() {
        if (15 > 10) {
            System.out.println("Numarul 15 ii mai mare ca 10");
        } else {
            System.out.println("Numarul 15 nu ii mai mare ca 10");
        }
    }

    //verificam daca un numar este mai mare decat 10 - V2
    public void verificNrMaiMareV2(Integer nr) {
        if (nr > 10) {
            System.out.println("Numarul " + nr + " ii mai mare ca 10");
        } else {
            System.out.println("Numarul " + nr + " nu ii mai mare ca 10");
        }
    }

    //verificam daca un nr este par si pozitiv
    public void verificNrPar(Integer nr) {
        //daca vrem sa luam catul impartirii = /(divide)
        //daca vrem sa luam restul impartirii = %(modulo)
        if (nr > 0 ) {
            if (nr % 2 == 0) { // verificam daca ii pozitiv
                System.out.println("Numarul " + nr + " este par si pozitiv.");
            }
            else {
                System.out.println("Numarul " + nr + " este impar si pozitiv.");
            }
        } else if (nr < 0 ) { // devine un nou if, o noua conditie
            if (nr % 2 == 0) { // verificam daca ii negativ
                System.out.println("Numarul " + nr + " este par si negativ.");
            } else {
                System.out.println("Numarul " + nr + " este impar si negativ.");
            }
        } else { // tine de primul if din metoda
            System.out.println("Numarul este 0.");
        }
    }
    //Definim zilele saptamanii
    public void zileSaptamana (Integer zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este Luni");
                break; // intrerupe executia
            case 2:
                System.out.println("Astazi este Marti");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi");
                break;
            case 5:
                System.out.println("Astazi este Vineri");
                break;
            case 6:
                System.out.println("Astazi este Sambata");
                break;
            case 7:
                System.out.println("Astazi este Duminica");
                break;
            default:
                System.out.println("Nu exista valoarea introdusa");
        }
    }
}
