package ulohy;


//KATKA MUNKAJA
/*
Úloha č.2: Priradenie číselného hodnotenia k textovémuHint: Porovnanie textov sa cez IF robí ináč ako porovnanie s číslom. Nemôžeme použiť ==, je potrebné použiť .equalsHint č. 2: Namiesto IF môžeme použiť SWITCH, CASE.Bonusová úloha: Program pôjde do “nekonečna”, kým nezadáme príkaz: koniecBonusová úloha č. 2: Skúsme “ošetriť” používateľský vstup tak, aby reagoval na vstupný text bez ohľadu na diakritiku.Popis programu.Ako bude program fungovať z pohľadu používateľa: Program ho vyzve otázkou: “Zadaj známku slovne (výborný, chválitebný, dobrý, dostatočný, nedostatočný). Program bude od používateľa čakať textovú odpoveď v “konzole”. Odpoveď bude alikvótna číselná známka, ktorú program vypíše.Program bude ďalej pokračovať vypísaním otázky na zadanie slovnej známky, kým používateľ nepreruší program zadaním slova: koniecProgram po zadaní koniec ukončí svoju činnosť a nevypíše nič.
*/
// TODO Deadline do 20.15
import java.util.Scanner;
public class PriradenieZnamkyTextovemuHodnoteniu {
    public static void main(String[] args) {
        while (true) { // Nekonecny cyklus
            Scanner skener = new Scanner(System.in);
            System.out.println("Zadaj znamku slovne:");
            String znamka = skener.nextLine();

            if (znamka.equals("q") || znamka.equals("Q")) break;
        try {
            if (znamka.equals("Vyborny") || znamka.equals("Vyborny")) System.out.println("Tvojoa znamka je 1");
            else if (znamka.equals("Chvalitebny")) System.out.println("Tvoja znamka je 2");
            else if (znamka.equals("Dobry")) System.out.println("Tvoja znamka je 3");
            else if (znamka.equals("Dostatocny")) System.out.println("Tvoja znamka je 4");
            else if (znamka.equals("Nedostatocny")) System.out.println("Tvoja znamka je 5");
            else System.out.println("Chybne zadanie. Skus napisat text znova s pouzitim velkeho pismena a bez interpunkcnych znamienok.");
        } catch (Exception e) {
            System.out.println("Akceptovatelne pismeno, resp. znak je q alebo Q na ukoncenie programu" );
            skener.close();
        }

        }
    }
}
