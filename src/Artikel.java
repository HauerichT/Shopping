public abstract class Artikel {

    private final int artikelnummer;
    private final double nettoPreis;

    public Artikel(int artikelnummer, double nettoPreis) {
        this.artikelnummer = artikelnummer;
        this.nettoPreis = nettoPreis;
    }

    public double getPreis() {
        return nettoPreis;
    }

    public String getInfo() {
        return "";
    }



}
