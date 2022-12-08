public class Buch extends Artikel {

    private String autorenname;
    private String buchtitel;
    private int erscheinungsjahr;

    public Buch(int artikelnummer, double nettoPreis, String autorenname, String buchtitel, int erscheinungsjahr) {
        super(artikelnummer, nettoPreis);
        this.autorenname = autorenname;
        this.buchtitel = buchtitel;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public String getAutorenname() {
        return autorenname;
    }

    public String getBuchtitel() {
        return buchtitel;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public String getInfo() {
        return "Buch - " + autorenname + ", " + buchtitel + " (" + erscheinungsjahr + ")  " + ": " + getPreis();
    }
}
