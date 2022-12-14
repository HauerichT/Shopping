import java.util.ArrayList;

public class Warenkorb {

    // Instanzvariable: ArrayList mit den Artikeln im Warenkorb
    private final ArrayList<Artikel> artikelListe = new ArrayList<>();

    // Methode fügt einen Artikel zum Warenkorb hinzu
    public void addArtikel(Artikel a) {
        boolean nrBereitsVorhanden = false;
        for (Artikel artikel : artikelListe) {
            if (a.getArtikelNummer() == artikel.getArtikelNummer()) {
                nrBereitsVorhanden = true;
                break;
            }
        }
        if (nrBereitsVorhanden) {
            System.out.println("Artikel mit der Artikelnummer " + a.getArtikelNummer() + " ist bereits vorhanden! Duplikat wird nicht hinzugefügt.");
        } else {
            this.artikelListe.add(a);
        }
    }

    // Methode entfernt einen Artikel aus dem Warenkorb
    public void removeArtikel(Artikel a) {
        this.artikelListe.remove(a);
    }

    // Methode gibt den Warenkorb auf der Konsole aus
    public void zeigeWarenkorb() {
        if (artikelListe.size() == 0) {
            System.out.println("Warenkorb ist leer!");
        } else {
            double gesamtPreis = 0;
            for (Artikel artikel : artikelListe) {
                gesamtPreis = gesamtPreis + artikel.getPreis();
                System.out.println(artikel.getInfo());
            }
            System.out.println("Gesamtpreis: " + gesamtPreis + " Euro");
        }
    }

}
