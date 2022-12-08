public class Kleidung extends Artikel {

    private String typ;
    private int groesse;
    private String farbe;

    public Kleidung(int artikelnummer, double nettoPreis, String typ, int groesse, String farbe) {
        super(artikelnummer, nettoPreis);
        this.typ = typ;
        this.groesse = groesse;
        this.farbe = farbe;
    }
}
