package variabilaMetoda;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public Float pret;
    public Integer an;
    public Boolean esteDecapotabila;
    public Double greutate;

    @Test
    public void metodaTest(){
    System.out.println("===Descrie o masina===");
    afisareMasina();  //afiseaza valorile hardcoded
        System.out.println(" ");
    System.out.println("===Exemplul 2===");  //cand dorim actiunea sa aiba loc tot timpul dar datele sa fie diferite
    afisareOriceMasina("BMW", "a",12.13, 11.11f, 2011, true);
        System.out.println(" ");
    System.out.println("===Exemplul 3===");
    afisareOriceMasina("H", "b",22.33, 22.22f, 2012, false);

    }

    // Descriem o masina -->
    public void afisareMasina() {
        marca = "Mercedes";
        model = "GLS";
        pret = 2565.5f;
        an = 2010;
        esteDecapotabila = true;
        greutate = 54.0;

        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Pretul masinii este " + pret);
        System.out.println("Anul masinii este " + an);
        System.out.println("Este masina decapotabila? " + esteDecapotabila);
        System.out.println("Greutatea masinii este " + greutate);

    }

    //Descriem orice masina-->
    //cand dorim actiunea sa aiba loc tot timpul dar datele sa fie diferite -->
    public void afisareOriceMasina(String marca, String model, Double greutate, Float pret, Integer an, Boolean esteDecapotabila){

        System.out.println("Marca masinii este " + marca); //actiune
        System.out.println("Modelul masinii este " + model);
        System.out.println("Pretul masinii este " + pret);
        System.out.println("Anul masinii este " + an);
        System.out.println("Este masina decapotabila? " + esteDecapotabila);
        System.out.println("Greutatea masinii este " + greutate);

    }



}
