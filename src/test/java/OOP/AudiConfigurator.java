package OOP;

import java.util.List;

public class AudiConfigurator extends MasinaConfigurator {

    // Copilul o preluat informatiile din parinte si prin incapsulare hotaram ce sa fie vizibil si ce se poate modifica
    // Facem proprietatile copilului private si hotaram ce vrem sa se afiseze (toate) si ce vrem sa se poata modifica (liniaDeEchipare, motor, vopsea, jante, interior si echipamente)
    // Set face modificari pe proprietatea din parinte
    // Get face vizibila (poate fi apelata) proprietatea din parinte: ex: getModel()
    private String liniaDeEchipare;
    private String motor;
    private String vopsea;
    private String jante;
    private String interior;
    private List<String> echipamente;
    private Double pretStandard; // il mutam din parinte (MasinaConfigurator) in copil ca sa poate fi apelat cu setter, daca nu ii mutat nu il gasim in optiuni
    private Double pretFinal; // il mutam din parinte (MasinaConfigurator) in copil ca sa poate fi apelat cu setter, daca nu ii mutat nu il gasim in optiuni

    public AudiConfigurator(String marca, String model, Integer an, String linieDeEchipare, String motor, String vopsea, String jante, String interior,
                             List<String> echipamente) {
        super(marca, model, an);
        this.liniaDeEchipare=linieDeEchipare;
        this.motor=motor;
        this.vopsea=vopsea;
        this.jante=jante;
        this.interior=interior;
        this.echipamente=echipamente;
    }

    public void infoAudi(){
        infoMasina();
        System.out.println("Linia de echipare a masinii este: " + liniaDeEchipare);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Culoarea masinii este: " + vopsea);
        System.out.println("Jantele masinii sunt: " + jante);
        System.out.println("Interiorul masinii este: " + interior);
        System.out.println("Echipamentele masinii sunt: ");
        for (Integer i = 0; i < echipamente.size(); i++){
            System.out.println(echipamente.get(i));
        }

        calculPretStandard();
        calculPretFinal();
    }

    // Trebuie sa determinam pretul standard in functie de modelul masinii Volkswagen
    // Fiecare model are o  linie de echipare asa ca facem un nested if -> if model - if linia de echipare
    // Folosim .equals pt ca avem String

    public void calculPretStandard(){

        // Folosind getModel scoatem informatia din parinte, il facem vizibil ->Anterior a fost: if (model.equals("Q5")){
        if (getModel().equals("Q5")){
            if (liniaDeEchipare.equals("Basic")){
                pretStandard = 48.600;
            }
            if (liniaDeEchipare.equals("Advanced")){
                pretStandard = 50.000;
            }
            if (liniaDeEchipare.equals("S Line")){
                pretStandard = 51.500;
            }
            if (liniaDeEchipare.equals("SQ5")){
                pretStandard = 72.000;
            }
        }

        if (getModel().equals("A8")){
            if (liniaDeEchipare.equals("A8")){
                pretStandard = 101.000;
            }
            if (liniaDeEchipare.equals("S8")){
                pretStandard = 140.000;
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

        // In functie de model si linia de echipare sunt disponibile anumite vopsele, jante si interior
        // Q5 - S Line
        if (getModel().equals("Q5")){
            if (liniaDeEchipare.equals("S Line")) {
                switch (vopsea) {
                    case "Gri":
                        pretOptiuni += 1.000;
                        break;

                    case "Alb":
                        pretOptiuni += 0;
                        break;

                    case "Negru":
                        pretOptiuni += 1.500;
                        break;
                }
                switch (jante) {
                    case "Jante18":
                        pretOptiuni += 0;
                        break;
                    case "Jante19":
                        pretOptiuni += 1.300;
                        break;
                }
                switch (interior) {
                    case "Stofa":
                        pretOptiuni += 0;
                        break;
                    case "Piele ecologica":
                        pretOptiuni += 1.200;
                        break;
                }
            }
        }

        // A8 - S8
        if (getModel().equals("A8")){
            if (liniaDeEchipare.equals("S8")) {
                switch (vopsea) {
                    case "Gri":
                        pretOptiuni += 1.000;
                        break;

                    case "Alb":
                        pretOptiuni += 1.200;
                        break;

                    case "Negru":
                        pretOptiuni += 0;
                        break;
                }
                switch (jante) {
                    case "Jante20":
                        pretOptiuni += 0;
                        break;
                    case "Jante21":
                        pretOptiuni += 0.900;
                        break;
                }
                switch (interior) {
                    case "Stofa":
                        pretOptiuni += 0;
                        break;
                    case "Piele Valcoma":
                        pretOptiuni += 1.200;
                        break;
                }
            }
        }

        // Dotari optionale indiferent de model/linia de echipare
        for (String echipamente : echipamente){
            switch (echipamente){
                case "Carcase oglinzi exterioare negre":
                    pretOptiuni += 1.100;
                    break;
                case "Bare de protectie S line culoare":
                    pretOptiuni += 1.200;
                    break;
                case "Pachet interior S line sport":
                    pretOptiuni += 1.300;
                    break;
                case "Pachet asistenta City":
                    pretOptiuni += 1.400;
                    break;
                case "Pachet Design & Technology S8":
                    pretOptiuni += 1.500;
                    break;
                case "Carcase oglinzi exterioare carbon":
                    pretOptiuni += 1.600;
                    break;
            }
        }
        pretFinal = pretStandard + pretOptiuni;
        String pretFinalFormattedValue = String.format("%.3f", pretFinal); // Use String.format to format the double value with three decimal places
        System.out.println("Pretul final este: " + pretFinalFormattedValue + " EUR"); // Print the formatted value
    }

    // Getter - ce vrem sa facem vizibil - liniaDeEchipare, motor, vopsea, jante, interior, echipamente pretStandard si pretFinal sunt vizibile la client (pretStandard si pretFinal se pun doar in copil, nu se mai pun cu getter in parinte ca sa nu mai poata fi modificate in OOPTest)
    public String getLiniaDeEchipare() {
        return liniaDeEchipare;
    }

    public String getMotor() {
        return motor;
    }

    public String getVopsea() {
        return vopsea;
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

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }

    // Setter - ce vrem sa se poata modifica - liniaDeEchipare, motor, vopsea, jante, interior si echipamente POT fi modificate de catre client
    public void setLiniaDeEchipare(String liniaDeEchipare) {
        this.liniaDeEchipare = liniaDeEchipare;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setVopsea(String vopsea) {
        this.vopsea = vopsea;
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
}
