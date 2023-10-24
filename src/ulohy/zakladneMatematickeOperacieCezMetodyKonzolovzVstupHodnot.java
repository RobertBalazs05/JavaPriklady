package ulohy;

import java.util.InputMismatchException;
import java.util.Scanner;

// TODO Vytvorte metody obdobnym sposobom aj pre odcitanie, nasobenie, delenie a modulo
public class zakladneMatematickeOperacieCezMetodyKonzolovzVstupHodnot {
    public static double scitanie(double cislo1, double cislo2) {
        double sucet = cislo1 + cislo2;
        return sucet;
        //return cislo1 + cislo2; // Alternativni, resp. efektivni sposob vypoctu spolu s jeho vratenim
    }

    public static double odcitanie(double cislo1, double cislo2) {
        return cislo1 - cislo2;
    }

    public static double nasobenie(double cislo1, double cislo2) {
        return cislo1 * cislo2;
    }

    public static double delenie(double cislo1, double cislo2) {
        return cislo1 / cislo2;
    }

    public static double modulo(double cislo1, double cislo2) {
        return cislo1 % cislo2;
    }

    public static void vypis(String operacia, double cislo1, double cislo2, double vysledok) {
        // TODO Zobraz vystupny text tak, aby bol zarovnany na 10 znakov zlava
        // Na odsadenie textu napr. 10 znakov zlava sme pouzili %-10s, k tomu sme vsak museli pridat dalsi argument, resp. prazdny text, ktory je reprezentovany ""
        System.out.printf("%s 2 cisiel %.1f a %.1f je: %.1f%n", operacia, cislo1, cislo2, vysledok);
    }

    public static void main(String[] args) {
        double cislo1 = 0, cislo2 = 0;

        // Konzolovy vstup od pouzivatela

        Scanner skener = new Scanner(System.in); // Inicializovali konzolovy skener na vstup z klavesnice

        System.out.println("Zadaj prvé číslo: ");
        try {
            cislo1 = skener.nextDouble(); // Java realne caka, aby pouzivatel vlozil nejaku hodnotu (cislo), ktoru potvrdzuje klavesou Enter
        } catch (InputMismatchException e) {
            System.out.println("Zadal si neakceptovatelny formát čísla!");
            // TODO Ukoncenie programu
            skener.close();
            System.exit(1); // "Nasilne" ukoncenie programu
        } finally { //
            // skener.close();
        }


        System.out.println("Zadaj druhé číslo: ");
        cislo2 = skener.nextDouble();



        // vypis vysledkov matematickych operacii volanim metody vypis
        vypis("Sucet", cislo1, cislo2, scitanie(cislo1, cislo2));
        vypis("Rozdiel", cislo1, cislo2, odcitanie(cislo1, cislo2));
        vypis("Sucin", cislo1, cislo2, nasobenie(cislo1, cislo2));
        vypis("Podiel", cislo1, cislo2, delenie(cislo1, cislo2));
        vypis("Modulo (resp. zvysok po deleni)", cislo1, cislo2, modulo(cislo1, cislo2));



    }
}
