public class Buch extends Artikel {

    private final String autorenname;
    private final String buchtitel;
    private final int erscheinungsjahr;

    double mehrwertsteuer = 0.07;

    public Buch(int artikelnummer, double nettoPreis, String autorenname, String buchtitel, int erscheinungsjahr) {
        super(artikelnummer, nettoPreis);
        this.autorenname = autorenname;
        this.buchtitel = buchtitel;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public String getInfo() {
        return "Buch - " + autorenname + ", " + buchtitel + " (" + erscheinungsjahr + ") " + ": " + Math.round(100.0 * (getPreis() + (getPreis() * mehrwertsteuer))) / 100.0 + " Euro";
    }
}
