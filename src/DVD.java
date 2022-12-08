public class DVD extends Artikel {

    private String filmtitel;
    private int dauer;

    public DVD(int artikelnummer, double nettoPreis, String filmtitel, int dauer) {

        super(artikelnummer, nettoPreis);
        this.filmtitel = filmtitel;
        this.dauer = dauer;
    }

    public int getDauer() {
        return dauer;
    }

    public String getFilmtitel() {
        return filmtitel;
    }
}
