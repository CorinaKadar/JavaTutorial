package Obiect;

import java.util.List;
import java.util.Map;

public class Telefon {

    public String marca;
    public String model;
    public String culoare;
    public String memorie;
    public Integer pret;
    public Map<String, String> specificatiiTehnice;
    public List<String> accesorii;
    public Boolean produsResigilat;
    public String observatii;

    public Telefon(String marca, String model, String culoare, String memorie, Integer pret, Map<String, String> specificatiiTehnice, List<String> accesorii, Boolean produsResigilat) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.memorie = memorie;
        this.pret = pret;
        this.specificatiiTehnice = specificatiiTehnice;
        this.accesorii = accesorii;
        this.produsResigilat = produsResigilat;
    }

    public Telefon(String marca, String model, String culoare, String memorie, Integer pret, Map<String, String> specificatiiTehnice, List<String> accesorii, Boolean produsResigilat, String observatii) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.memorie = memorie;
        this.pret = pret;
        this.specificatiiTehnice = specificatiiTehnice;
        this.accesorii = accesorii;
        this.produsResigilat = produsResigilat;
        this.observatii = observatii;
    }

    public void infoTelefon() {
        System.out.println("Marca telefonului este " + marca);
        System.out.println("Modelul telefonului este " + model);
        System.out.println("Culoarea telefonului este " + culoare);
        System.out.println("Memoria telefonului este " + memorie);
        System.out.println("Pretul telefonului este " + pret + " lei");

        System.out.println("Specificatiile telefonului sunt: ");
        for (String key : specificatiiTehnice.keySet()) {
            System.out.println(key + " " + specificatiiTehnice.get(key));
        }

        System.out.println("Accesoriile din cutie sunt: ");
        for (Integer index = 0; index < accesorii.size(); index++) {
            System.out.println(accesorii.get(index));
        }

        if (produsResigilat){
            System.out.println("Produsul este resigilat: " + observatii);
        }
        else {
            System.out.println("Produsul este nou");
        }
    }

}
