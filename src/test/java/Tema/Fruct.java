package Tema;

import org.testng.annotations.Test;

public class Fruct {

    //descrie 6-7 fruncte folosind schema cu parametrii folosita in cursul 3

    public String numeFruct;
    public Character initialaFruct;
    public Double cantitate;
    public Integer bucati;
    public Float nutrienti;
    public Boolean esteExotic;

public void afisareFruct(){
    numeFruct = "Mere";
    initialaFruct = 'M';
    cantitate = 11.11;
    bucati = 111;
    nutrienti = 111.11f;
    esteExotic = false;

    System.out.println("Numele fructului: " + numeFruct);
    System.out.println("Initiala fructului: " + initialaFruct);
    System.out.println("Cantitate: " + cantitate + " kg");
    System.out.println("Bucati: " + bucati);
    System.out.println("Continut de nutrienti: " + nutrienti);
    System.out.println("Este Exotic? " + esteExotic);
}

public void afisareMultipleFructe(String numeFruct, Character initialaFruct, Double cantitate, Integer bucati, Float nutrienti, Boolean esteExotic, String culoareFruct){

    System.out.println("Numele fructului: " + numeFruct);
    System.out.println("Initiala fructului: " + initialaFruct);
    System.out.println("Cantitate: " + cantitate + " kg");
    System.out.println("Bucati: " + bucati);
    System.out.println("Continut de nutrienti: " + nutrienti);
    System.out.println("Este Exotic? " + esteExotic);
    System.out.println("Culoarea fructului: " + culoareFruct);

}

@Test
public void afisareFructeTest () {
    System.out.println("---> Fruct 1: ");
    afisareFruct();
    System.out.println(" ");

    System.out.println("---> Fruct 2: ");
    afisareMultipleFructe("Pere", 'P', 22.22, 222, 222.22f, false, "Galben" );
    System.out.println(" ");

    System.out.println("---> Fruct 3: ");
    afisareMultipleFructe("Banane", 'B', 33.33, 333, 333.33f, true, "Galben" );
    System.out.println(" ");

    System.out.println("---> Fruct 4: ");
    afisareMultipleFructe("Capsuni", 'C', 44.44, 444, 444.44f, false, "Rosu" );
    System.out.println(" ");

    System.out.println("---> Fruct 5: ");
    afisareMultipleFructe("Kiwi", 'K', 55.55, 555, 555.55f, true, "Maro" );
    System.out.println(" ");

    System.out.println("---> Fruct 6: ");
    afisareMultipleFructe("Portocale", 'P', 66.66, 666, 666.66f, true, "Portocaliu" );
    System.out.println(" ");

    System.out.println("---> Fruct 7: ");
    afisareMultipleFructe("Cirese", 'C', 77.77, 777, 777.77f, false, "Rosu" );

}

}
