public class Kleidung extends Artikel {

    // Instanzvariablen
    private final String typ;
    private final String size;
    private final String farbe;

    // Mehrwertsteuer der Kleidungsstücke
    double mehrwertsteuer = 0.12;

    // Konstruktor
    public Kleidung(int artikelnummer, double nettoPreis, String typ, String size, String farbe) {
        super(artikelnummer, nettoPreis);
        this.typ = typ;
        this.size = size;
        this.farbe = farbe;
    }

    // Methode gibt die Informationen eines Kleidungsstücks zurück
    public String getInfo() {
        return "Kleidung - " + this.typ + ", " + this.farbe + " ("+ this.size +")" + " : " + Math.round(100.0 * (getPreis() + (getPreis() * mehrwertsteuer))) / 100.0 + " Euro";
    }
}
