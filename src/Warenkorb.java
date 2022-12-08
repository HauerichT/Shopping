import java.util.ArrayList;

public class Warenkorb {
    private final ArrayList<Artikel> artikelListe = new ArrayList<>();

    public void addArtikel(Artikel a) {
        this.artikelListe.add(a);
    }

    public void removeArtikel(Artikel a) {
        this.artikelListe.remove(a);
    }

    public void zeigeWarenkorb() {
        double gesamtPreis = 0;
        for (int i = 0; i < artikelListe.size(); i++) {
            gesamtPreis = gesamtPreis + artikelListe.get(i).getPreis();
            System.out.println(artikelListe.get(i).getInfo());
        }
        System.out.println("Gesamtpreis: " + gesamtPreis + " Euro");
    }

}
