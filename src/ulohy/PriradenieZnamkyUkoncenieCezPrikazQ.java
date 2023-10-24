package ulohy;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Character.isLetter;

public class PriradenieZnamkyUkoncenieCezPrikazQ {
    public static void main(String[] args) {
        while (true) { // Nekonecny cyklus
            Scanner skener = new Scanner(System.in);
            System.out.println("Zadaj počet bodov:");
            String pocetBodov = skener.nextLine();

            // Akym sposobom ukoncit while. Hint: vpisanym pismenom q
            if (pocetBodov.equals("q") || pocetBodov.equals("Q")) break;

        try {
            int pocetBodovAkoInt = Integer.parseInt(pocetBodov);
            if (pocetBodovAkoInt > 90) System.out.println("Tvojoa znamka je A");
            else if (Integer.parseInt(pocetBodov) > 75) System.out.println("Tvoja znamka je B");
            else if (Integer.parseInt(pocetBodov) > 65) System.out.println("Tvoja znamka je C");
            else System.out.println("Neviem priradit znamku k danemu poctu bodov");
        } catch (NumberFormatException e) {
            System.out.println("Akceptovatelne pismeno, resp. znak je q alebo Q na ukoncenie programu" );
        }
        }
    }
}
