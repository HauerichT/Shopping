public class DVD extends Artikel {

    private final String filmtitel;
    private final String dauer;

    double mehrwertsteuer = 0.19;

    public DVD(int artikelnummer, double nettoPreis, String filmtitel, String dauer) {

        super(artikelnummer, nettoPreis);
        this.filmtitel = filmtitel;
        this.dauer = dauer;
    }

    public String getInfo() {
        return "DVD - " + this.filmtitel + "," + " (" + dauer + ") " + ": " + Math.round(100.0 * (getPreis() + (getPreis() * mehrwertsteuer))) / 100.0 + " Euro";
    }
}
