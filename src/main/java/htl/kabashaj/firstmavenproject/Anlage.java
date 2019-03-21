package htl.kabashaj.firstmavenproject;

public class Anlage {

    private double anschaffungswert;
    private int nutzungsdauer;
    private double buchwert;

    public Anlage(double anschaffungswert, int nutzungsdauer) {
        this.anschaffungswert = anschaffungswert;
        this.nutzungsdauer = nutzungsdauer;
    }

    public double jahresAfa() {
        return anschaffungswert / nutzungsdauer;
    }

    public void updateBuchwert(int jareGenutzt) {

    }

    public double getBuchwert() {
        return buchwert;
    }

    public double getAnschaffungswert() {
        return anschaffungswert;
    }

    public int getNutzungsdauer() {
        return nutzungsdauer;
    }

}
