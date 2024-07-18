package OOP;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OOPTest {

    @Test
    public void metodaTest(){

        //Dam o comanda de o masina Dacia -> Logan
        List<String> echipamenteLogan = Arrays.asList("Pachet Techno", "Pachet Clima", "Pachet Parking");
        List<String> accesoriiLogan = Arrays.asList("Covorase", "Scrumiera", "Suport pahare");
        DaciaConfigurator Logan = new DaciaConfigurator("Dacia", "Logan", 2024,
                "Essential", "Tce 90", "Gri", "Premium", "Essential", echipamenteLogan, accesoriiLogan);
        System.out.println();
        System.out.println("--- Comanda masina Dacia -> Logan ---");
        Logan.infoDacia();
        //Logan.get - le vede toate chiar daca sunt private
        //Logan.set - nu vede pretStandard si pretFinal pt ca sunt private - astfel clientul nu le poate modifica

        //Dam o comanda de o masina Dacia -> Duster
        List<String> echipamenteDuster = Arrays.asList("Pachet Confort", "Pachet Clima", "Heated seats");
        List<String> accesoriiDuster = Arrays.asList("Pachet trepte", "Antena rechin", "YouClip – bec");
        DaciaConfigurator Duster = new DaciaConfigurator("Dacia", "Duster", 2024,
                "Essential", "Hev 140", "Sandstone", "Tergan", "Essential", echipamenteDuster, accesoriiDuster);
        System.out.println();
        System.out.println("--- Comanda masina Dacia -> Duster ---");
        Duster.infoDacia();

        //---------------------------------------------------------------------------------------------------------------------------------------------------
        //Dam o comanda de o masina Volkswagen -> Polo
        List<String> dotariOptionalePolo = Arrays.asList("Pachet Confort", "Alarma antifurt", "Trapa");
        VolkswagenConfigurator Polo = new VolkswagenConfigurator("Volkswagen", "Polo", 2024,
                "Life", "Tco 50", "Negru", "Premium", "Stofa", dotariOptionalePolo);
        System.out.println();
        System.out.println("--- Comanda masina Volkswagen -> Polo ---");
        Polo.infoVolkswagen();

        //Dam o comanda de o masina Volkswagen -> Tiguan
        List<String> dotariOptionaleTiguan = Arrays.asList("Carlig de remorcare detasabil", "Keyless Access", "Incalzire sau ventilare stationara");
        VolkswagenConfigurator Tiguan = new VolkswagenConfigurator("Volkswagen", "Tiguan", 2024,
                "Elegance", "2.0 TDI DSG 4Mot", "Rosu", "Napoli", "Stofa", dotariOptionaleTiguan);
        System.out.println();
        System.out.println("--- Comanda masina Volkswagen -> Tiguan ---");
        Tiguan.infoVolkswagen();

        //Dam o comanda de o masina Volkswagen -> T-Roc
        List<String> dotariOptionaleTRoc = Arrays.asList("Pachet iarna", "Trapa de sticla panoramica", "Camera Rear View");
        VolkswagenConfigurator TRoc = new VolkswagenConfigurator("Volkswagen", "TRoc", 2024,
                "Style", "1.5 TSI", "Alb", "Johannesburg", "Piele", dotariOptionaleTRoc);
        System.out.println();
        System.out.println("--- Comanda masina Volkswagen -> T-Roc ---");
        TRoc.infoVolkswagen();

        //---------------------------------------------------------------------------------------------------------------------------------------------------
        //Dam o comanda de o masina Audi -> Q5
        List<String> dotariOptionaleQ5 = Arrays.asList("Carcase oglinzi exterioare negre", "Bare de protectie S line culoare", "Pachet interior S line sport");
        AudiConfigurator Q5 = new AudiConfigurator("Audi", "Q5", 2024,
                "S Line", "35 TDI", "Negru", "Jante19", "Piele ecologica", dotariOptionaleQ5);
        System.out.println();
        System.out.println("--- Comanda masina Audi -> Q5 ---");
        Q5.infoAudi();

        //Dam o comanda de o masina Audi -> A8
        List<String> dotariOptionaleA8 = Arrays.asList("Pachet asistenta City", "Pachet Design & Technology S8", "Carcase oglinzi exterioare carbon");
        AudiConfigurator A8 = new AudiConfigurator("Audi", "A8", 2024,
                "S8", "S8 PI TFSI quattro", "Alb", "Jante21", "Piele Valcona", dotariOptionaleA8);
        System.out.println();
        System.out.println("--- Comanda masina Audi -> A8 ---");
        A8.infoAudi();

    }

}
