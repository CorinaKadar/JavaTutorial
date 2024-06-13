package Obiect;

import org.testng.annotations.Test;

public class SportivTest {

    @Test
    public void metodaTest(){
        // Instantiem un obiect de tipul sportiv (numele clasei)
        // CTRL + click pe Sportiv te duce in clasa Sportiv initiala
        Sportiv Ionut = new Sportiv("Popescu", "Ionut", 17, "M", "Baschet", true);
        Ionut.prezentareSportiv();
        Ionut.verificareVarsta();
        Ionut.marireSalar(10);
        System.out.println("----------------------------------");

        // Daca vrem sa facem update la o valoare dar sa pastram si valoarea initiala
        Ionut.varsta = 31;
        Ionut.tipSport = "Fotbal";
        Ionut.prezentareSportiv();
        Ionut.verificareVarsta();
        Ionut.marireSalar(10);
        System.out.println("----------------------------------");

        Sportiv Alina = new Sportiv("Pop", "Alina", 20, "F", "Dans", false);
        Alina.prezentareSportiv();
        Alina.verificareVarsta();
        Alina.marireSalar(10);

        System.out.println("----------------------------------");
        Sportiv Kira = new Sportiv("Kad", "Kira", 10, "F", "Dans", true, 10000);
        Kira.prezentareSportiv();
        Kira.verificareVarsta();
        Kira.marireSalar(10);

    }

}
