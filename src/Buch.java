public class Buch extends Artikel {

    // Instanzvariablen
    private final String autorenname;
    private final String buchtitel;
    private final int erscheinungsjahr;

    // Mehrwertsteuer der Bücher
    double mehrwertsteuer = 0.07;

    // Konstruktor
    public Buch(int artikelnummer, double nettoPreis, String autorenname, String buchtitel, int erscheinungsjahr) {
        super(artikelnummer, nettoPreis);
        this.autorenname = autorenname;
        this.buchtitel = buchtitel;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    // Methode gibt die Informationen eines Buches zurück
    public String getInfo() {
        return "Buch - " + autorenname + ", " + buchtitel + " (" + erscheinungsjahr + ") " + ": " + Math.round(100.0 * (getPreis() + (getPreis() * mehrwertsteuer))) / 100.0 + " Euro";
    }
}
