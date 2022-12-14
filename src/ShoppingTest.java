public class ShoppingTest {
    public static void main(String[] args) {

        // Erzeugen von Artikeln
        Artikel buch = new Buch(1, 10.20, "Max Mustermann", "Das große Buch des Wissens", 2022);
        Artikel dvd = new DVD(2, 15.99, "Weihnachtsfilm", "2:40");
        Artikel kleidung = new Kleidung(3, 35.00, "Jacke", "M", "Weiß");
        Artikel buch2 = new Buch(4, 12.50, "Frauke Musterfrau", "Das Buch - Das einzig wahre!", 2010);
        Artikel kleidung2 = new Kleidung(5, 67.20, "Hose", "L", "Blau");

        // Erzeugen eines Warenkorbs
        Warenkorb warenkorb = new Warenkorb();

        // Artikel zum Warenkorb hinzufügen
        warenkorb.addArtikel(buch);
        warenkorb.addArtikel(dvd);
        warenkorb.addArtikel(kleidung);
        warenkorb.addArtikel(buch2);
        warenkorb.addArtikel(kleidung2);

        // Artikel aus Warenkorb löschen
        warenkorb.removeArtikel(kleidung);

        // Warenkorb anzeigen
        warenkorb.zeigeWarenkorb();

    }
}