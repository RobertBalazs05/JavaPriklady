package ulohy;

/*Úloha 1: Základné matematické operácie
        Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to sčítanie (+), odčítanie (-), násobenie (*) a delenie (/), modulo (%).
        Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1  a cislo2.
        Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
        Program nám zároveň vypíše takýto text:
        Výsledkom sčítania hodnôt 2 a 3 je 5.
        Výsledkom odčítania hodnôt 2 a 3 je -1.
        atď.*/


public class ZakladneMatematickeOperacie {
    public static void main(String[] args) {
        double cislo1 = 9, cislo2 = 2;
        double scitanie = cislo1 + cislo2;
        double odcitani = cislo1 - cislo2;
        double nasobenie = cislo1 * cislo2;
        double delenie = cislo1 / cislo2;
        double modulo = cislo1 % cislo2;

        System.out.println("Výsledkom sčítania hodnôt " + cislo1 + " a " + cislo2 + " je " + scitanie);
        System.out.printf("Výsledok sčítania hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, scitanie);
        System.out.printf("Výsledok odcitanie hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, odcitani);
        System.out.printf("Výsledok nasobenie hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, nasobenie);
        System.out.printf("Výsledok delenia hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, delenie);
        System.out.printf("Výsledok modulo hodnôt (zvysku po deleni) %.1f a %.1f je %.1f%n", cislo1, cislo2, modulo);


    }
}
