public class Premenne {
    public static void main(String[] args) {
        boolean jeJavaLahka = true;

        String menoZamestnanca = "Robo";
        String priezvisko = "Balazs";
        String celeMeno = menoZamestnanca + " " + priezvisko + " je zamestancom INTERCAD."; // Spajame obsah premennych a vlastneho textu

        System.out.println(celeMeno);
        // System.out.println(menoZamestnanca + " " + priezvisko + " je zamestancom INTERCAD.");

        int mojeCislo = 15;
        int mojeCisloVynasobene2mi = mojeCislo * 2;

        System.out.println("Povodne cislo je: " + mojeCislo);
        System.out.println("Povodne cislo vynasobene 2-mi: " + mojeCisloVynasobene2mi);

        int mojeCislo2;
        mojeCislo2 = 15;
        System.out.println(mojeCislo2);

        int mojeCislo3 = 15;
        mojeCislo3 = 20;  // mojeCislo3 is now 20
        System.out.println(mojeCislo3);

        final int konstanta = 15; // deklaracia konstantz cez klucove slovo final
        // konstanta = 20;  // will generate an error: cannot assign a value to a final variable

        int myNum = 5;
        float myFloatNum = 5.99f; // deklarujeme desatinne cislo, na konci musi byt uvedene f
        double mydoubleNum = 5.99f; // deklarujeme desatinne cislo ktora je 2x vacsie ako flout, nemusi sa uvadzat pismeno f
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        byte cisloTypuByte = 127;
        byte cisloTypuBytePoScitani = cisloTypuByte;

        System.out.println(cisloTypuByte);
        System.out.println(cisloTypuBytePoScitani);

        int x = 5;
        int y = 6;
        int sum = x + y;
        System.out.println(sum); // Print the value of sum

        int x2 = 5, y2 = 6, z2 = 50;
        System.out.println(x2 + y2 + z2);

        int x3, y3, z3;
        x3 = y3 = z3 = 50;
        System.out.println(x3 + y3 + z3);

        System.out.println("Je Java Lahký programovací jazyk? Odpoved je: " + jeJavaLahka);

        char myGrade = 'B';
        String mojePismeno = "B";
        System.out.println(myGrade);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67, myVar4 = 126, myVar5 = 127;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        System.out.println(myVar4);
        System.out.println(myVar5);

        short kratkeCislo = 20;
        int celeCislo = kratkeCislo + 1;

        double desatinneCislo = 0.9;
        int celeCislo2 = (int)desatinneCislo;
        System.out.println("Scitanie desatinneho cisla a celeho: " + celeCislo2);

        String cisloAkoString = "2.5";
        // int sumar = Integer.parseInt(cisloAkoString) + 1;
        // System.out.println("Scitanie cisla typu Sting a celeho: " + sumar);

        double sumar2 = Double.parseDouble(cisloAkoString) + 1;
        System.out.println("Scitanie cisla typu Sting a desatinneho: " + sumar2);

        int celeCisloBezHodnoty = 0;
        System.out.println(celeCisloBezHodnoty);







    }
}
