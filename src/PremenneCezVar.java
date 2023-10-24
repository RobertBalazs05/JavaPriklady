import java.util.Date;

public class PremenneCezVar {
    public static void main(String[] args) {
        var meno = "Robo";
        var priezvisko = "Balazs";
        var menoPriezvisko = meno + " " + priezvisko;
        System.out.println("Moje meno a priezvisko je: " + menoPriezvisko);

        var a = 10;
        var b = 20;
        var c = "30";
        var sucet = a + b;
        var sucet3cisiel = a + b + c;
        System.out.println("Sucet a b je: " + (a + b));
        System.out.println("Sucet a b je: " + sucet);
        System.out.println("Sucet 3 cisiel, z toho je jeden text: " + sucet3cisiel);

        var aktulnyDatum = new Date();
        System.out.println("Aktualny datum a cas je: " + aktulnyDatum);
    }
}
