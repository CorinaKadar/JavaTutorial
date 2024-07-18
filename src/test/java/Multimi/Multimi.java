package Multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {

    // Multimi = array, list(arraylist), map

    @Test
    public void metodaTest() {
        //afisareColegiArray();
        //afisareColegiArrayList();
        //obiecteMap();
        //tariOrase();
        afisareColegiArrayList2();

    }

    //afisam numele colegilor de la curs (array)
    //array functioneaza pe primitive si wrapper objects
    //o singra multime cu un element sau cu focusul pe un singur element
    public void afisareColegiArray() {
        String[] colegi = new String[6]; //array de stringuri cand apare String[]
        colegi[0] = "Larisa";
        colegi[1] = "Robert";
        colegi[2] = "Daniel";
        colegi[3] = "Vlad";
        colegi[4] = "Corina";
        colegi[5] = "Alex";
        for (Integer index = 0; index < colegi.length; index++) { // length ofera dinamic dimensiunea multimii
            System.out.println("Numele cursantului este " + colegi[index]);
        }
    }

    //afisam numele colegilor de la curs (arraylist)
    //array list functioneaza pe wrapper objects (Integer)
    //se foloseste Integer in loc de int pt ca lista nu poate sa functioneze pe primitiva (int)
    //o singra multime cu un element sau cu focusul pe un singur element
    public void afisareColegiArrayList() {
        List<String> colegi = new ArrayList<>(); // la List ii valoarea cu <E>
        colegi.add("Larisa");
        colegi.add("Robert");
        colegi.add("Daniel");
        colegi.add("Vlad");
        colegi.add("Corina");
        colegi.add("Alex");
        for (Integer index = 0; index < colegi.size(); index++) { // size ofera dinamic dimensiunea multimii - echivalent cu lenght de la array
            System.out.println("Numele cursantului este " + colegi.get(index));
        }
    }

    public void afisareColegiArrayList2() {
        List<String> colegi = Arrays.asList("Larisa", "Corina", "Vlad");
        for (Integer index = 0; index < colegi.size(); index++) {
            System.out.println("Numele cursantului este " + colegi.get(index));
        }
    }

    //Structura compusa de tipul key-value --> Map = multime ce ofera posibilitatea maparii imformatiei de tip key(masina)-value(BMW)
    //Se foloseste pt o multime ce nu se poate identifica in aceasi categorie
    //des folosite cand se citesc fisiere
    public void obiecteMap(){
        Map<String, String> obiecte = new HashMap<>();  //key-value raport 1:1 String-String in cazul dat
        obiecte.put("Fruct", "Mar");
        obiecte.put("Masina", "BMW");
        obiecte.put("Telefon", "Samsung");
        obiecte.put("Banca", "BT");
        for (String key: obiecte.keySet()){
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + obiecte.get(key));
        }
    }

    //afisam tari cu orase aferente
    public void tariOrase(){
        Map<String, List<String>> tari = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Cluj");
        oraseRomania.add("Iasi");
        oraseRomania.add("Timisoara");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano");
        oraseItalia.add("Roma");
        oraseItalia.add("Verona");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Valencia");
        oraseSpania.add("Madrid");

        tari.put("Romania", oraseRomania);
        tari.put("Italia", oraseItalia);
        tari.put("Spania", oraseSpania);

        for (String key: tari.keySet()){
            System.out.println("Cheia: Tara este " + key);
            System.out.println("Valoarea: Orasele sunt " + tari.get(key));
        }


    }
}


