package Tema;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ExercitiiMultimi {

    @Test
    public void metodaTest() {
        //CeaMaiMicaVarstaDinMultime();
        //mediaDeVarsta();
        //arrayMultidimensionalFor();
        //arrayMultidimensionalForEach();
        //comparamDouaArrayuri();
        //verificamDacaSuntEgale();
        //arraySort();
        arrayFill();
    }

    // Afisam cea mai mica varsta din multime
    public void CeaMaiMicaVarstaDinMultime() {

        // Definim un array de varste
        Integer varsta[] = {20, 22, 18, 35, 48, 26, 87, 70};

        // Luam dimensiunea array-ului si o stocam intr-o variabila dimensiune
        Integer dimensiune = varsta.length;

        // Cream o noua variabila ceaMaiMicaVarsta si ii atribuim prima pozitie din multime
        Integer ceaMaiMicaVarsta = varsta[0];

        // Facem un For Each pt a parcurge toate elementele multimii ca sa gasim cea mai mica valoare
        for (Integer varstaCurenta : varsta) {
            // Verificam daca valoarea curenta ii mai mica decat ceaMaiMicaVarsta
            if (varstaCurenta < ceaMaiMicaVarsta) {
                // Daca valoarea curenta (varstaCurenta) este mai mica decat ceaMaiMicaVarsta, ii atribui valoarea curenta la ceaMaiMicaVarsta
                ceaMaiMicaVarsta = varstaCurenta;
            }
        }
        // Afisam varsta cea mai mica din multime
        System.out.println("Cea mai mica varsta este: " + ceaMaiMicaVarsta);
    }

    // Afisam media varstelor
    public void mediaDeVarsta() {

        // Definim un array de varste
        Integer varsta[] = {20, 22, 18, 35, 48, 26, 87, 70};

        // Cream 2 variabile media si suma
        Double media;
        Double suma = 0.00;

        // Luam dimensiunea array-ului si o stocam intr-o variabila dimensiune
        Integer dimensiune = varsta.length;

        // Facem un For Each pt a parcurge toate elementele multimii
        for (Integer varstaCurenta : varsta) {
            suma += varstaCurenta; // suma = suma + varstaCurenta
        }
        // Calculam media varstelor
        media = suma / dimensiune;

        // Afisam media varstelor
        System.out.println("Media varstelor este " + media);
    }

    // Array-urile multidimensionale sunt utile atunci cand dorim sa stocam date sub forma de tabel, un tabel cu randuri (x) si coloane (y).
    // Afisam toate elementele dintr-un array multidimensional - For
    public void arrayMultidimensionalFor() {
        Integer[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (Integer x = 0; x < myNumbers.length; ++x) { // Primul For parcurge array-urile/randurile (x)
            for (int y = 0; y < myNumbers[x].length; ++y) { // Al doilea For parcurge elementele din array-uri/coloanele (y)
                System.out.println(myNumbers[x][y]); // Afiseaza pe rand elementele identificate
            }
        }
    }

    // Afisam toate elementele dintr-un array multidimensional - For-Each
    public void arrayMultidimensionalForEach(){
        Integer[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
            for (Integer[] x : myNumbers) { // Primul For-Each parcurge array-urile/randurile (x)
              for (Integer y : x) { // Al doilea For-Each parcurge elementele din array-uri/coloanele (y)
                 System.out.println(y); // Afiseaza pe rand elementele identificate
                }
            }
        }
    //Arrays.compare() Method - Compara lexicografic 2 array-uri
    public void comparamDouaArrayuri (){
        String[] cars = {"Volvo", "BMW", "Tesla"};
        String[] cars2 = {"Volvo", "BMW", "T"};
        System.out.println(Arrays.compare(cars, cars2));
    }

    //Arrays.equals() Method - Verifica daca doua array-uri sunt egale
    public void verificamDacaSuntEgale (){
        String[] cars = {"Volvo", "BMW", "Tesla"};
        String[] cars2 = {"Volvo", "BMW", "Tesla1"};
        System.out.println(Arrays.equals(cars, cars2));
    }

    //Arrays.sort() Method - Sorteaza un array in ordine crescatoare/alfabetica
    public void arraySort(){
        String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
        Arrays.sort(cars);

        Integer[] myNum = {50, 10, 25, 1, 17, 99, 33};
        Arrays.sort(myNum); // sorteaza crescator myNum
        Arrays.sort(myNum, 1, 4); // soteaza crescator doar valorile de pe pozitiile 1-4 inclusiv, adica 10, 25, 1 si 17
    }
    //Arrays.fill() Method - Completeaza un array cu o valoare specifica
    public void arrayFill(){
        String[] fruits = {"Banana", "Orange", "Apple", "Mango"};
        // Toate elementele din multime vor fi inlocuite cu valoarea "Kiwi"
        Arrays.fill(fruits, "Kiwi");
        // Doar "Apple" si "Mango" vor fi inlocuite cu "Kiwi"
        Arrays.fill(fruits, 3, 4, "Kiwi");
    }

}
