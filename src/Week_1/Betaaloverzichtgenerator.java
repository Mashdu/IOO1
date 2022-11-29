package Week_1;

import java.util.Scanner;

public class Betaaloverzichtgenerator {
    public final float BTW = 21;
    // public final int gebruiker_invoer;
    String Naam;
    int Aantal_Appels;
    int Aantal_Peren;
    int Aantal_Aardappels;
    double Kost_Prijs_Appel = 0.50;
    double Kost_Prijs_Peer = 0.70;
    double Kost_Prijs_Aaardappel = 0.65;
    double BTW_Appel = Kost_Prijs_Appel * 21 / 100;
    double BTW_Peer = Kost_Prijs_Peer * 21 / 100;
    double BTW_Aaardappel = Kost_Prijs_Aaardappel * 21 / 100;
    double Verkoop_Prijs_Appel = Kost_Prijs_Appel * (1 + BTW / 100);
    double Verkoop_Prijs_Aaardappel = Kost_Prijs_Aaardappel * (1 + BTW / 100);
    double Verkoop_Prijs_Peer = Kost_Prijs_Peer * (1 + BTW / 100);


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Betaaloverzichtgenerator vraag = new Betaaloverzichtgenerator();
        System.out.println("Wat je naam?\t");
        vraag.Naam = input.nextLine();
        System.out.println("De BTW is:\t" + vraag.BTW);

        System.out.println("De verkooprijs van een appel is:" + ' ' + vraag.Verkoop_Prijs_Appel);
        System.out.println("Hoeveel appels wil je kopen?");
        vraag.Aantal_Appels = input.nextInt();

        System.out.println("De verkooprijs van een peer is:" + ' ' + vraag.Verkoop_Prijs_Peer);
        System.out.println("Hoeveel peren wil je kopen?");
        vraag.Aantal_Peren = input.nextInt();

        System.out.println("De verkooprijs van een aardappel is:\t" + ' ' + vraag.Verkoop_Prijs_Aaardappel);
        System.out.println("Hoeveel aardappel wil je kopen");
        vraag.Aantal_Aardappels = input.nextInt();

        System.out.println("Beste" + ' ' + vraag.Naam);

        System.out.println("====================================");

        System.out.println("Hieronder volgt het betaaloverzicht:");

        System.out.println("Appels aantal:" + ' ' + vraag.Aantal_Appels);

        double Totale_Kost_Prijs_Appel = vraag.Aantal_Appels * vraag.Kost_Prijs_Appel;

        System.out.println("Totaal kostprijs" + ' ' + Totale_Kost_Prijs_Appel);

        System.out.println("Totaal BTW:" + ' ' + vraag.BTW);

        double Subtotaal_Appels = vraag.Aantal_Appels * vraag.Verkoop_Prijs_Appel;

        System.out.println("Subtotaal omzet:" + ' ' + Subtotaal_Appels);

        System.out.println("Peren aantal" + ' ' + vraag.Aantal_Peren);

        double Totale_Kost_Prijs_Peer = vraag.Aantal_Peren * vraag.Kost_Prijs_Peer;

        System.out.println("Totaal kostprijs:" + ' ' + Totale_Kost_Prijs_Peer);

        System.out.println("Totaal BTW:" + ' ' + vraag.BTW);

        double Subtotoaal_Peren = vraag.Aantal_Peren * vraag.Verkoop_Prijs_Peer;

        System.out.println("Subtotaal omzet:" + ' ' + Subtotoaal_Peren);

        System.out.println("Aardappels aantal" + ' ' + vraag.Aantal_Appels);

        double Totale_Kost_Prijs_Aardappel = vraag.Aantal_Aardappels * vraag.Verkoop_Prijs_Aaardappel;

        System.out.println("Totaal kostprijs" + ' ' + Totale_Kost_Prijs_Aardappel);

        System.out.println("Totaal BTW:" + ' ' + vraag.BTW);

        double Subtotaal_Aardappels = vraag.Aantal_Aardappels * vraag.Verkoop_Prijs_Aaardappel;

        System.out.println("Subtotaal omzet:" + ' ' + Subtotaal_Aardappels);

        double Totale_Omzet_BTW = Subtotaal_Aardappels * Subtotoaal_Peren * Subtotaal_Appels;

        System.out.println("Totale omzet incl. BTW:" + ' ' + Totale_Omzet_BTW);

        double Totale_BTW = vraag.BTW_Appel * vraag.BTW_Peer * vraag.BTW_Aaardappel;

        System.out.println("Totale BTW:" + ' ' + Totale_BTW);


    }


}
