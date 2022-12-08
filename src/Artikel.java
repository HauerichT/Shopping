public class Artikel extends Versandhandel {

    private int artikelnummer;
    private double nettoPreis;

    public Artikel(int artikelnummer, double nettoPreis) {
        this.artikelnummer = artikelnummer;
        this.nettoPreis = nettoPreis;
    }

    public double getPreis() {
        return nettoPreis;
    }

    public String getInfo() {

    }



}
