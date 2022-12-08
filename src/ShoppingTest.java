public class ShoppingTest {
    public static void main(String[] args) {

        Versandhandel versandhandel = new Versandhandel();
        Artikel buch = new Buch(1, 10.00, "Max Mustermann", "Das große Buch 1", 2022);
        Artikel dvd = new DVD(1, 15.00, "Weihnachtsfilm", 100);
        Artikel kleidung = new Kleidung(1, 35.00, "Schuhe", 44, "Weiß");

        Warenkorb warenkorb = new Warenkorb();
        warenkorb.addArtikel(buch);
        warenkorb.zeigeWarenkorb();

    }
}