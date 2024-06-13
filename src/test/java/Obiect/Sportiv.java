package Obiect;

public class Sportiv {

    // Programarea orientata obiect se bazeaza pe interactiunea cu obiecte
    // Obiect = instanta unei clase
    // Putem definii un obiect doar daca avem un constructor
    // Constructorul = are ca rol sa initializeze atributele unei clase
    // Intr-o clasa recunoastem un constructor dupa numele acestuia
    // Contructorul este de cele mai multe ori public
    // Intr-o clasa pot sa fie mai multi constructori diferentiati dupa numarul sau tipul de parametrii
    // Intr-o clasa avem un constructor by default fara parametrii
    // In momentul in care se defineste un obiect, se apeleaza constructorul din clasa
    // Dintr-o clasa putem definii mai multe obiecte
    // Obiectele se diferentiaza prin nume si valorile date
    // Un obiect se instanteaza folosind cuvantul "new"
    // Un obiect se poate definii in orice clasa din orice pachet
    // In momentul cand instantiem un obiect puteam avea acces la toate variabilele/metodele din clasa

    public String nume;
    public String prenume;
    public Integer varsta;
    public String sex;
    public String tipSport;
    public Boolean teamEvent;
    public Integer salar;

    // Constructor
    // this. se poate genera automat prin click dreapta - generate - constructor - select all

    public Sportiv (String nume, String prenume, Integer varsta, String sex, String tipSport, Boolean teamEvent){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.tipSport = tipSport;
        this.teamEvent = teamEvent;
    }

    public Sportiv(String nume, String prenume, Integer varsta, String sex, String tipSport, Boolean teamEvent, Integer salar) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.tipSport = tipSport;
        this.teamEvent = teamEvent;
        this.salar = salar;
    }

    public void prezentareSportiv () {
        System.out.println("Numele sportivului este " + nume);
        System.out.println("Prenumele sportivului este " + prenume);
        System.out.println("Varsta sportivului este " + varsta + " ani");
        System.out.println("Sexul sportivului este " + sex);
        System.out.println("Tipul de sport practicat este " + tipSport);
        System.out.println("Este un sport de echipa? " + teamEvent);
        if (salar != null){
            System.out.println("Salarul sportivului este " + salar);
        }
    }

    public void verificareVarsta(){
        if (varsta >= 18){
            System.out.println("Sportivul ii major");
        }
        else {
            System.out.println("Sportivul ii minor");
        }
    }

    public void marireSalar (Integer procent){
        if (salar != null){
            Integer marire = (salar * procent)/100;
            salar = salar + marire;
            System.out.println("Salariul dupa marire este " + salar);
        }
        else {
            System.out.println("Sportivul nu are salar");
        }
    }

}
