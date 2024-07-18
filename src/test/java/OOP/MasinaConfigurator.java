package OOP;

public class MasinaConfigurator {

    private String marca;
    private String model;
    private Integer an;


    // Pretul final si Pretul standard se stabileste de catre producator, nu de catre client, asa ca NU le adaugam in MasinaConfigurator
    public MasinaConfigurator(String marca, String model, Integer an) {
        this.marca = marca;
        this.model = model;
        this.an = an;
    }

    // OOP = programare orientata obiect
    // OOP = 4 principii: Mostenire, Encapsulare, Pilimorfism si Abstractizare

    // Mostenire: conceptul prin care o clasa mosteneste o alta clasa
    // Clasa care este mostenita = parinte
    // Clasa care mosteneste = copil
    // In Java putem mostenii o singura clasa
    // Mostenirea se realizeaza cu cuvantul "extends"
    // Cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte
    // Copilul va avea acces la proprietatile/metodele din clasa parinte (daca se foloseste public/protected/default in parinte)
    // Ca sa apelam constructorul din parinte in copil se foloseste cuvantul "super"

    // Pretul nu poate fi modificat de catre client, strict doar de catre producator iar pt a fixa acest lucru folosim incapsularea
    // Incapsulare = conceptul prin care putem sa setam anumite restrictii de vizibilitate pt proprietati/metode
    // Access control: public, private (vizibil la incapsulare -  incapsuleaza toate proprietatile sa fie vizibile numai in interiorul clasei, adica numa parintele le vede)
    // Folosind "private" incapsuleaza toate proprietatile ca sa fie vizibile doar in interiorul clasei
    // Incapsulam informatiile si noi decidem ce vrem si ce nu vrem sa poata fi modificat -> pretStandard si pretFinal, precum si marca, model si an devin private
    // By default in OOP trebuie sa le facem private apoi pe parcurs oferim vizibilitate cu getter si setter, stabilim ce vrem sa fie vizibil si ce vrem sa se modifice
    // Prin get stabilim ce vrem sa fie vizibil la client: marca, model, an, pretStandard si pretFinal
    // Prin set stabilim ce se poate modifica: marca, model, an
    // Click dreapta - Generate - Getter / Setter / Getter and Setter

    public void infoMasina(){
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul masinii este: " + an);
    }

    // Getter - ce vrem sa facem vizibil - marca, model si an sunt vizibile la client
    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public Integer getAn() {
        return an;
    }

    //Setter - ce vrem sa se poata modifica - marca, model si an POT fi modificate de catre client (daca se razgandeste)
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAn(Integer an) {
        this.an = an;
    }
}
