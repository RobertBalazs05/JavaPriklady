package ulohy;

/*
Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
        Ak je percento nad 90, tak vypíše známku A
        Ak je percento nad 75, tak vypíše známku B
        Ak je percento nad 65, tak vypíše známku C
        Použite metódu pre rozhodovanie.

        Popis z pohladu pouzivatela: Program vyzve pouzivatela na ciselny vstup, t.j. pocet bodov, ktore po odobrani (stalceni klavesu enter) vyhodnoti a vypise zodpovedajucu znamku podla kriteria vyssie. Nasledne sa program ukonci.
        Program bude fungovat do nekonecna kym nezadame vstupnu hodnotu
*/
// TODO "nekonecne" opakovanie programu, kym nezadame
import java.util.InputMismatchException;
import java.util.Scanner;

public class PriradenieZnamky {
    public static void main(String[] args) {
        //while (true) { //while reprezentuje cyklus s podmienkou na zaciatku, while(true) je hack, ktory vykonava cyklus do "nekonecna"
        //for (;;) { //nahradza hack while true
        int pocetBodov = 0; //inicializacia premennej pocetBodov na tomto mieste, aby sme ju mali platnu v celmo rozsahu bloku
        Scanner skener = new Scanner(System.in); // Inicalizacia skeneru pre pouzivatelsky vstup z konzoly
        //while (pocetBodov >= 0 ) { //korektne programovanie vyzaduje zadanie spravnej podmienky hned na zaciatku while
        while (pocetBodov != -1 && pocetBodov <=100 ) {
        System.out.println("Zadaj počet bodov:");
        try {
            pocetBodov = skener.nextInt(); // "Realny" vstup od pouzivatela
            if (pocetBodov > 90 && pocetBodov <=100 ) System.out.println("Tvoja známka je A");
            else if (pocetBodov > 75  && pocetBodov < 90) System.out.println("Tvoja známka je B.");
            else if (pocetBodov > 65  && pocetBodov < 75) System.out.println("Tvoja známka je C.");
            // Ukazka ako funguje logicky vyraz ALEBO (OR) pouzujeme tzv. pipe, t.j. symbol ||, vseobecna ukazka: if (vyraz1 || vyraz2) odpoved
            // Ukazka ako funguje logicky vyraz A (AND) pouzujeme tzv. &,
            //else if (pocetBodov == -1) System.exit(1);
            //else if (pocetBodov < 0) System.exit(1);
            //else if (pocetBodov == -1) break; //korektna cesta ako ukoncit cyklus, cize prikazom break
            else System.out.println("Počtu bodov nezodpovedá žiadna známka.");
        } catch (InputMismatchException e) {
            System.out.println("Prepac, Zadal si nespravny format cisla resp. typ udaju");
            //System.exit(1);
        }
        }
        skener.close();
    }
}

