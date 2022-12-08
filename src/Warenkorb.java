import java.util.ArrayList;

public class Warenkorb {
    private ArrayList<Artikel> artikelListe = new ArrayList<>();

    public void addArtikel(Artikel a) {
        artikelListe.add(a);
    }

    public void removeArtikel(Artikel a) {
        artikelListe.remove(a);
    }

    public void zeigeWarenkorb() {
        for (int i = 0; i < artikelListe.size(); i++) {
            System.out.println(artikelListe.get(i).getInfo());
        }
    }

}
