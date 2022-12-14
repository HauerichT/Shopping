public class DVD extends Artikel {

    // Instanzvariablen
    private final String filmtitel;
    private final String dauer;

    // Mehrwertsteuer der DVDs
    private final double mwst = 0.19;

    // Konstruktor
    public DVD(int artikelnummer, double nettoPreis, String filmtitel, String dauer) {
        super(artikelnummer, nettoPreis);
        this.filmtitel = filmtitel;
        this.dauer = dauer;
    }

    // Methode gibt die Informationen einer DVD zurück
    public String getInfo() {
        return "DVD - " + this.filmtitel + "," + " (" + dauer + ") " + ": " + Math.round(100.0 * (getPreis() + (getPreis() * mwst))) / 100.0 + " Euro";
    }
}
