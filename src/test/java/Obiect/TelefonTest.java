package Obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonTest {

    @Test
    public void metodaTest(){
        System.out.println("--> Telefon: Iphone 15 --");
        Map<String, String> iphone15Specificatii = new HashMap<>();
        iphone15Specificatii.put("- Model procesor:", "Apple A16 Bionic");
        iphone15Specificatii.put("- Sistem operare:", "iOS17");
        iphone15Specificatii.put("- Memorie RAM:", "6 GB");
        iphone15Specificatii.put("- Rezolutie video:", "Full HD");
        iphone15Specificatii.put("- Numar camere:", "2");
        iphone15Specificatii.put("- Tip display:", "Super Retina xdr");
        iphone15Specificatii.put("- Porturi:", "USB type C");

        List<String> iphone15Accesorii=new ArrayList<>();
        iphone15Accesorii.add("- Incarcator");
        iphone15Accesorii.add("- Cablu USB");
        iphone15Accesorii.add("- Casti");
        iphone15Accesorii.add("- Stylus");
        iphone15Accesorii.add("- Sticker");

        Telefon iphone15 = new Telefon("Iphone", "15", "Albastru", "128 GIGA", 2000, iphone15Specificatii, iphone15Accesorii, false);
        iphone15.infoTelefon();
        System.out.println("----------------------------------");

        System.out.println("--> Telefon: Samsung 24 --");
        Map<String, String> samsung24Specificatii = new HashMap<>();
        samsung24Specificatii.put("- Model procesor:", "Exynos 2400");
        samsung24Specificatii.put("- Sistem operare:", "android 14");
        samsung24Specificatii.put("- Memorie RAM:", "8 GB");
        samsung24Specificatii.put("- Rezolutie video:", "8K");
        samsung24Specificatii.put("- Numar camere:", "2");
        samsung24Specificatii.put("- Tip display:", "Dynamic AMOLED");
        samsung24Specificatii.put("- Porturi:", "USB type C");

        List<String> samsung24Accesorii=new ArrayList<>();
        samsung24Accesorii.add("- Incarcator");
        samsung24Accesorii.add("- Cablu USB");
        samsung24Accesorii.add("- Casti");

        Telefon samsung24 = new Telefon("Samsung", "24", "Negru", "64 GIGA", 3000, samsung24Specificatii, samsung24Accesorii, false);
        samsung24.infoTelefon();
        System.out.println("----------------------------------");

        System.out.println("--> Telefon: Huawei Pro --");
        Map<String, String> huaweiProSpecificatii = new HashMap<>();
        huaweiProSpecificatii.put("- Model procesor:", "Exynos 2400");
        huaweiProSpecificatii.put("- Sistem operare:", "android 14");
        huaweiProSpecificatii.put("- Memorie RAM:", "8 GB");
        huaweiProSpecificatii.put("- Rezolutie video:", "8K");
        huaweiProSpecificatii.put("- Numar camere:", "2");
        huaweiProSpecificatii.put("- Tip display:", "Dynamic AMOLED");
        huaweiProSpecificatii.put("- Porturi:", "USB type C");

        List<String> huaweiProAccesorii=new ArrayList<>();
        huaweiProAccesorii.add("- Incarcator");
        huaweiProAccesorii.add("- Cablu USB");
        huaweiProAccesorii.add("- Casti");

        Telefon huaweiPro = new Telefon("Huawei", "Pro", "Alb","64 Giga", 5000, huaweiProSpecificatii, huaweiProAccesorii, true, "Are zgarieturi");
        huaweiPro.infoTelefon();
        System.out.println("----------------------------------");

    }

}
