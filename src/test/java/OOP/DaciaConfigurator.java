package OOP;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;

public class DaciaConfigurator extends MasinaConfigurator{

    // Copilul o preluat informatiile din parinte si prin incapsulare hotaram ce sa fie vizibil si ce se poate modifica
    // Facem proprietatile copilului private si hotaram ce vrem sa se afiseze (toate) si ce vrem sa se poata modifica (versiune, motor, culoare, jante, interior, echipamente si accesorii)
    // Set face modificari pe proprietatea din parinte
    // Get face vizibila (poate fi apelata) proprietatea din parinte: ex: getModel()
    private String versiune;
    private String motor;
    private String culoare;
    private String jante;
    private String interior;
    private List<String> echipamente;
    private List<String> accesorii;
    private Double pretStandard; // il mutam din parinte (MasinaConfigurator) in copil ca sa poate fi apelat cu setter, daca nu ii mutat nu il gasim in optiuni
    private Double pretFinal; // il mutam din parinte (MasinaConfigurator) in copil ca sa poate fi apelat cu setter, daca nu ii mutat nu il gasim in optiuni

    public DaciaConfigurator(String marca, String model, Integer an, String versiune, String motor, String culoare, String jante, String interior,
                             List<String> echipamente, List<String> accesorii) {
        super(marca, model, an);
        this.versiune=versiune;
        this.motor=motor;
        this.culoare=culoare;
        this.jante=jante;
        this.interior=interior;
        this.echipamente=echipamente;
        this.accesorii=accesorii;
    }

    public void infoDacia(){
        infoMasina();
        System.out.println("Versiunea masinii este: " + versiune);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Jantele masinii sunt: " + jante);
        System.out.println("Interiorul masinii este: " + interior);
        System.out.println("Echipamentele masinii sunt: ");
        for (Integer i = 0; i < echipamente.size(); i++){
            System.out.println(echipamente.get(i));
        }

        System.out.println("Accesoriile masinii sunt: ");
        for (Integer j = 0; j < accesorii.size(); j++) {
            System.out.println(accesorii.get(j));
        }
        calculPretStandard();
        calculPretFinal();
    }

    // Trebuie sa determinam pretul standard in functie de modelul masinii Dacia
    // Fiecare model are o versiune asa ca facem un nested if -> if model - if versiune
    // Folosim .equals pt ca avem String

    public void calculPretStandard(){

        // Folosind getModel scoatem informatia din parinte, il facem vizibil ->Anterior a fost: if (model.equals("Logan")){

        if (getModel().equals("Logan")){
            if (versiune.equals("Essential")){
                // Folosing
                pretStandard = 13.500;
            }
            if (versiune.equals("Expression")){
                pretStandard = 14.150;
            }
            if (versiune.equals("Journey")){
                pretStandard = 12.250;
            }
            if (versiune.equals("Journey+")){
                pretStandard = 15.700;
            }
        }

        if (getModel().equals("Duster")){
            if (versiune.equals("Essential")){
                pretStandard = 18.800;
            }
            if (versiune.equals("Expression")){
                pretStandard = 20.000;
            }
            if (versiune.equals("Journey")){
                pretStandard = 21.500;
            }
            if (versiune.equals("Extreme")){
                pretStandard = 22.000;
            }
        }
        // metoda de afisare a unei valori double 15.700 cu o precizie de 3 zecimale: 15.700 -> \n reprezinta enter sau new line
        //System.out.printf("Pretul standard este: %,.3f EUR\n", pretStandard);

        // Decimal Format
        //DecimalFormat df = new DecimalFormat(".000"); // Create a DecimalFormat instance with the desired pattern
        //String formattedValue = df.format(pretStandard); // Format the double value
        //System.out.println("Pretul standard este: " + formattedValue + " EUR"); // Print the formatted value: 15.700 daca pretStandard = 15.700

        // String Format
        String pretStandardFormattedValue = String.format("%.3f", pretStandard); // Use String.format to format the double value with three decimal places
        System.out.println("Pretul standard este: " + pretStandardFormattedValue + " EUR"); // Print the formatted value: 15.700 daca pretStandard = 15.700

    }
    public void calculPretFinal(){

        double pretOptiuni = 0.000;

        // In functie de model si versiunea sunt disponibile anumite culori, jante si interior
        // LOGAN - Essential
        if (getModel().equals("Logan")){
            if (versiune.equals("Essential")) {
                switch (culoare) {
                    case "Gri":
                        pretOptiuni += 0.460; // shortcut pt pretOptiuni = pretOptiuni + 0.460;
                        break;

                    case "Alb":
                        pretOptiuni += 0;
                        break;

                    case "Negru":
                        pretOptiuni += 0;
                        break;
                }
                switch (jante) {
                    case "Elma":
                        pretOptiuni += 0;
                        break;
                    case "Premium":
                        pretOptiuni += 2.000;
                        break;
                }
                switch (interior) {
                    case "Essential":
                        pretOptiuni += 0;
                        break;
                }
            }
        }
        // DUSTER - Essential
        if (getModel().equals("Duster")){
            if (versiune.equals("Essential")) {
                switch (culoare) {
                    case "Gri":
                        pretOptiuni += 0.500;
                        break;

                    case "Alb":
                        pretOptiuni += 0;
                        break;

                    case "Sandstone":
                        pretOptiuni += 0.700;
                        break;
                }
                switch (jante) {
                    case "Tergan":
                        pretOptiuni += 0;
                        break;
                    case "Premium":
                        pretOptiuni += 3.000;
                        break;
                }
                switch (interior) {
                    case "Essential":
                        pretOptiuni += 0;
                        break;
                }
            }
        }

        // Echipamente indiferent de model/versiune
        for (String echipamente : echipamente){
            switch (echipamente){
                case "Pachet Techno":
                    pretOptiuni += 1.100;
                    break;
                case "Pachet Clima":
                    pretOptiuni += 1.200;
                    break;
                case "Pachet Parking":
                    pretOptiuni += 1.300;
                    break;
                case "Pachet Confort":
                    pretOptiuni += 1.400;
                    break;
                case "Heated seats":
                    pretOptiuni += 1.500;
                    break;
            }
        }

        // Accesorii indiferent de model/versiune
        for (String accesorii : accesorii){
            switch (accesorii){
                case "Covorase":
                    pretOptiuni += 0.100;
                    break;
                case "Scrumiera":
                    pretOptiuni += 0.200;
                    break;
                case "Suport pahare":
                    pretOptiuni += 0.300;
                    break;
                case "Pachet trepte":
                    pretOptiuni += 0.400;
                    break;
                case "Antena rechin":
                    pretOptiuni += 0.500;
                    break;
                case "YouClip – bec":
                    pretOptiuni += 0.600;
                    break;
            }
        }
        pretFinal = pretStandard + pretOptiuni;
        String pretFinalFormattedValue = String.format("%.3f", pretFinal); // Use String.format to format the double value with three decimal places
        System.out.println("Pretul final este: " + pretFinalFormattedValue + " EUR"); // Print the formatted value

    }

    // Getter - ce vrem sa facem vizibil - versiune, motor, culoare, jante, interior, echipamente, accesorii, pretStandard si pretFinal sunt vizibile la client (pretStandard si pretFinal se pun doar in copil, nu se mai pun cu getter in parinte ca sa nu mai poata fi modificate in OOPTest)
    public String getVersiune() {
        return versiune;
    }

    public String getMotor() {
        return motor;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getJante() {
        return jante;
    }

    public String getInterior() {
        return interior;
    }

    public List<String> getEchipamente() {
        return echipamente;
    }

    public List<String> getAccesorii() {
        return accesorii;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }

    // Setter - ce vrem sa se poata modifica - versiune, motor, culoare, jante, interior, echipamente si accesorii POT fi modificate de catre client
    public void setVersiune(String versiune) {
        this.versiune = versiune;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setJante(String jante) {
        this.jante = jante;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setEchipamente(List<String> echipamente) {
        this.echipamente = echipamente;
    }

    public void setAccesorii(List<String> accesorii) {
        this.accesorii = accesorii;
    }
}
