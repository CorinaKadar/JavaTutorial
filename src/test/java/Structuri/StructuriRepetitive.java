package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //Structuri Repetitive = For, While, For Each

    @Test
    public void testMethod (){
    //afisareNrFor();
    //afisareNrWhile();
    //afisareNrPare();
    }

    //FOR - Afisam numerele pana la 15
    //For ruleaza atata timp cat este indeplinita conditia
    //index++ -> index=index+1
    //index-- -> index=index-1
    public void afisareNrFor(){
        //1. Care ii primul nr, de unde incepem, de la cat pornim
        //2. Cat timp printam, pana unde mergem
        //3. Incrementam valoarea initiala
        for (Integer index=0; index<=15; index++ ){
            System.out.println(index);
        }
    }

    //WHILE - Afisam numerele pana la 15
    //Atentie sa nu uitam incrementarea!
    //Predispus la infinity loop
    public void afisareNrWhile() {
        Integer index = 0;
        while (index <= 15){
            System.out.println(index);
            index++;
        }
    }
    //afisam numerele pare de la 0 la 20
    public void afisareNrPare(){
        for (Integer index=0; index<=20; index++ ){
            if (index%2==0){ // index%2==1 sa afiseze impar
                System.out.println("Numarul " + index + " este par.");
            }
            else { //fara else afiseaza doar ce-i par
                System.out.println("Numarul " + index + " este impar.");
            }
        }
    }
}


