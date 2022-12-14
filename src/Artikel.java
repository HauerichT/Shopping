public class Artikel {

    // Instanzvariablen
    private final int artikelNummer;
    private final double nettoPreis;

    // Konstruktor
    public Artikel(int artikelNummer, double nettoPreis) {
        this.artikelNummer = artikelNummer;
        this.nettoPreis = nettoPreis;
    }

    // get-Methode: gibt den Netto-Preis zurück
    public double getPreis() {
        return nettoPreis;
    }

    // get-Methode: gibt die Informationen eines Artikels zurück
    public String getInfo() {
        return "";
    }

    public int getArtikelNummer() {
        return artikelNummer;
    }
}
