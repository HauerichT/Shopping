public class Kleidung extends Artikel {

    private final String typ;
    private final String size;
    private final String farbe;

    double mehrwertsteuer = 0.12;

    public Kleidung(int artikelnummer, double nettoPreis, String typ, String size, String farbe) {
        super(artikelnummer, nettoPreis);
        this.typ = typ;
        this.size = size;
        this.farbe = farbe;
    }

    public String getInfo() {
        return "Kleidung - " + this.typ + ", " + this.farbe + " ("+ this.size +")" + " : " + Math.round(100.0 * (getPreis() + (getPreis() * mehrwertsteuer))) / 100.0 + " Euro";
    }
}
