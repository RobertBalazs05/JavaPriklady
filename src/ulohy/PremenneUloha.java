package ulohy;

/*Úloha č.1:
Príklad na prácu s premennýmiVypíšte do konzoly nasledujúci text:Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.V Bratislave dňa 18.06.2022Poznámka: Dátum narodenia, známku a rok + aktuálny dátum nastavte tak, aby sa dali meniť v zdrojovom kóde (t.j. cez premenné).*/

import java.text.SimpleDateFormat;
//import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.*;
import java.time.format.*;
//import java.time.LocalDate;

public class PremenneUloha {
    public static void main(String[] args) {

        String meno = "Josef";
        String priezvisko = "Mrkvicka";
        String celeMeno = meno + " " + priezvisko;
        int den = 03;
        int mesiac = 04;
        int rok = 2000;
        float myFloatnumber = 1.5f;

        int denZapisu = 18;
        int mesiacZapisu = 06;
        int rokZapisu = 2022;
        String datumZapisu = denZapisu + "." + mesiacZapisu + "." + rokZapisu;


        System.out.println("Student " + celeMeno + " sa narodil " + den + "." + mesiac + "." + rok + ", z maturitnej skúšky má známku " + myFloatnumber + " a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.");
        System.out.println("\nV Bratislave dna " + datumZapisu);

        // zastarali sposob
        Date datum = new Date();
        System.out.println(datum);

        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yy");
        String aktualniDatumSKFormat= formatDatumu.format(datum);

        System.out.println(aktualniDatumSKFormat);

        //moderni sposob
        LocalDate aktualniDatum = LocalDate.now();
        System.out.println(aktualniDatum);

       DateTimeFormatter dtf = DateTimeFormatter.ofPattern ("dd.MM.yyyy");
       String formattedDate = aktualniDatum.format(dtf);
        System.out.println(formattedDate);

    }
}
