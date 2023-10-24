// Kazdy program bude zacinat triedou, cize musime pouzit klucove slovo class a obycajne aj v spojenie s public
// Nazov triedy koresponduje s konvenciou Camel, cize budeme pouzivate velke a male pisme a viacere slova oddelime velkymi pismenami
public class HelloWorld {
    public static void main(String[] args) { // Metoda main je dolezita pre spustenie programu
        System.out.println("\nHello, \nWorld!");  // System.out.println je kombinacia Java prikazov, ktore vypisuju do "konzoly" = Run dialogu a zaroven text potvrdia "Enter-om"
        System.out.println("Robert Balazs");
        System.out.println("Online Kurz Java Developer Junior");
        System.out.print("Nejaký text č.1");
        // Ukazka Escape charackters (znakov)
        // kombinacia znakov \n vlozí novy riadok
        System.out.print("\n\n\nNejaký text č.2"); // AltGr + q    vipise znak \
        System.out.println("\n\tOdsadený text");

        System.out.println("Vypisat uvodzovku mozeme takto: \" ");
        System.out.println("Vypisat spatnu lomku mozeme takto: \\ ");
        System.out.print("Pouzit backspace mozeme takto\b: ");
        //System.out.print("YYY");
        System.out.println("\rXXX");

        System.out.println(20);
        System.out.println(1.2);
    }
} // AltGr + n vlozi zlozenu zatvorku, teda }

