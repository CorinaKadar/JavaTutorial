package OOP;

import java.util.List;

public class VolkswagenConfigurator extends MasinaConfigurator{

    // Copilul o preluat informatiile din parinte si prin incapsulare hotaram ce sa fie vizibil si ce se poate modifica
    // Facem proprietatile copilului private si hotaram ce vrem sa se afiseze (toate) si ce vrem sa se poata modifica (liniaDeEchipare, motor, vopsea, roti, tapiterie si dotariOptionale)
    // Set face modificari pe proprietatea din parinte
    // Get face vizibila (poate fi apelata) proprietatea din parinte: ex: getModel()
    private String liniaDeEchipare;
    private String motor;
    private String vopsea;
    private String roti;
    private String tapiterie;
    private List<String> dotariOptionale;
    private Double pretStandard; // il mutam din parinte (MasinaConfigurator) in copil ca sa poate fi apelat cu setter, daca nu ii mutat nu il gasim in optiuni
    private Double pretFinal; // il mutam din parinte (MasinaConfigurator) in copil ca sa poate fi apelat cu setter, daca nu ii mutat nu il gasim in optiuni


    public VolkswagenConfigurator(String marca, String model, Integer an, String liniaDeEchipare, String motor, String vopsea,
                                  String roti, String tapiterie, List<String> dotariOptionale) {
        super(marca, model, an);
        this.liniaDeEchipare=liniaDeEchipare;
        this.motor=motor;
        this.vopsea=vopsea;
        this.roti=roti;
        this.tapiterie=tapiterie;
        this.dotariOptionale=dotariOptionale;
    }

    public void infoVolkswagen() {
        infoMasina();
        System.out.println("Linia de echipare a masinii este: " + liniaDeEchipare);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Vopseaua masinii este: " + vopsea);
        System.out.println("Rotile masinii sunt: " + roti);
        System.out.println("Tapiteria masinii este: " + tapiterie);
        System.out.println("Dotarile optionale ale masinii sunt: ");
        for (Integer i = 0; i < dotariOptionale.size(); i++) {
            System.out.println(dotariOptionale.get(i));
        }

        calculPretStandard();
        calculPretFinal();
    }

    // Trebuie sa determinam pretul standard in functie de modelul masinii Volkswagen
    // Fiecare model are o  linie de echipare asa ca facem un nested if -> if model - if linia de echipare
    // Folosim .equals pt ca avem String

    public void calculPretStandard(){

        // Folosind getModel scoatem informatia din parinte, il facem vizibil ->Anterior a fost: if (model.equals("Polo")){
        if (getModel().equals("Polo")){
            if (liniaDeEchipare.equals("Life")){
                pretStandard = 20.194;
            }
            if (liniaDeEchipare.equals("Advanced")){
                pretStandard = 20.675;
            }
            if (liniaDeEchipare.equals("Style")){
                pretStandard = 21.088;
            }
            if (liniaDeEchipare.equals("R-Line")){
                pretStandard = 21.601;
            }
            if (liniaDeEchipare.equals("GTI")){
                pretStandard = 31.784;
            }
        }

        if (getModel().equals("Tiguan")){
            if (liniaDeEchipare.equals("Base")){
                pretStandard = 33.302;
            }
            if (liniaDeEchipare.equals("Life")){
                pretStandard = 35.539;
            }
            if (liniaDeEchipare.equals("Advanced")){
                pretStandard = 40.052;
            }
            if (liniaDeEchipare.equals("Elegance")){
                pretStandard = 42.294;
            }
            if (liniaDeEchipare.equals("R-Line")){
                pretStandard = 43.190;
            }
        }

        if (getModel().equals("TRoc")){
            if (liniaDeEchipare.equals("Life")){
                pretStandard = 25.728;
            }
            if (liniaDeEchipare.equals("Advanced")){
                pretStandard = 28.051;
            }
            if (liniaDeEchipare.equals("Style")){
                pretStandard = 31.479;
            }
            if (liniaDeEchipare.equals("R-Line")){
                pretStandard = 31.431;
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

        // In functie de model si linia de echipare sunt disponibile anumite vopsele, roti si tapiterii
        // Polo - Life
        if (getModel().equals("Polo")){
            if (liniaDeEchipare.equals("Life")) {
                switch (vopsea) {
                    case "Gri":
                        pretOptiuni += 0;
                        break;

                    case "Alb":
                        pretOptiuni += 0;
                        break;

                    case "Negru":
                        pretOptiuni += 0.500;
                        break;
                }
                switch (roti) {
                    case "Essex":
                        pretOptiuni += 0;
                        break;
                    case "Premium":
                        pretOptiuni += 2.000;
                        break;
                }
                switch (tapiterie) {
                    case "Stofa":
                        pretOptiuni += 0;
                        break;
                }
            }
        }

        // Tiguan - Elegance
        if (getModel().equals("Tiguan")){
            if (liniaDeEchipare.equals("Elegance")) {
                switch (vopsea) {
                    case "Gri":
                        pretOptiuni += 0;
                        break;

                    case "Alb":
                        pretOptiuni += 0.200;
                        break;

                    case "Rosu":
                        pretOptiuni += 0.900;
                        break;
                }
                switch (roti) {
                    case "Napoli":
                        pretOptiuni += 0;
                        break;
                    case "Premium":
                        pretOptiuni += 3.000;
                        break;
                }
                switch (tapiterie) {
                    case "Stofa":
                        pretOptiuni += 0;
                        break;
                }
            }
        }

        // T-Roc - Style
        if (getModel().equals("TRoc")){
            if (liniaDeEchipare.equals("Style")) {
                switch (vopsea) {
                    case "Gri":
                        pretOptiuni += 0;
                        break;

                    case "Alb":
                        pretOptiuni += 0.300;
                        break;

                    case "Rosu":
                        pretOptiuni += 0.800;
                        break;
                }
                switch (roti) {
                    case "Johannesburg":
                        pretOptiuni += 0;
                        break;
                    case "Premium":
                        pretOptiuni += 1.000;
                        break;
                }
                switch (tapiterie) {
                    case "Stofa":
                        pretOptiuni += 0;
                        break;
                    case "Piele":
                        pretOptiuni += 2.000;
                        break;
                }
            }
        }

        // Dotari optionale indiferent de model/linia de echipare
        for (String dotariOptionale : dotariOptionale){
            switch (dotariOptionale){
                case "Pachet Confort":
                    pretOptiuni += 1.100;
                    break;
                case "Alarma antifurt":
                    pretOptiuni += 1.200;
                    break;
                case "Trapa":
                    pretOptiuni += 1.300;
                    break;
                case "Carlig de remorcare detasabil":
                    pretOptiuni += 1.400;
                    break;
                case "Keyless Access":
                    pretOptiuni += 1.500;
                    break;
                case "Incalzire sau ventilare stationara":
                    pretOptiuni += 1.600;
                    break;
                case "Pachet iarna":
                    pretOptiuni += 1.700;
                    break;
                case "Trapa de sticla panoramica":
                    pretOptiuni += 1.800;
                    break;
                case "Camera Rear View":
                    pretOptiuni += 1.900;
                    break;
            }
        }
        pretFinal = pretStandard + pretOptiuni;
        String pretFinalFormattedValue = String.format("%.3f", pretFinal); // Use String.format to format the double value with three decimal places
        System.out.println("Pretul final este: " + pretFinalFormattedValue + " EUR"); // Print the formatted value
    }

    // Getter - ce vrem sa facem vizibil - liniaDeEchipare, motor, vopsea, roti, tapiterie, dotariOptionale pretStandard si pretFinal sunt vizibile la client (pretStandard si pretFinal se pun doar in copil, nu se mai pun cu getter in parinte ca sa nu mai poata fi modificate in OOPTest)

    public String getLiniaDeEchipare() {
        return liniaDeEchipare;
    }

    public String getMotor() {
        return motor;
    }

    public String getVopsea() {
        return vopsea;
    }

    public String getRoti() {
        return roti;
    }

    public String getTapiterie() {
        return tapiterie;
    }

    public List<String> getDotariOptionale() {
        return dotariOptionale;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }

    // Setter - ce vrem sa se poata modifica - liniaDeEchipare, motor, vopsea, roti, tapiterie si dotariOptionale POT fi modificate de catre client

    public void setLiniaDeEchipare(String liniaDeEchipare) {
        this.liniaDeEchipare = liniaDeEchipare;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setVopsea(String vopsea) {
        this.vopsea = vopsea;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public void setTapiterie(String tapiterie) {
        this.tapiterie = tapiterie;
    }

    public void setDotariOptionale(List<String> dotariOptionale) {
        this.dotariOptionale = dotariOptionale;
    }
}
