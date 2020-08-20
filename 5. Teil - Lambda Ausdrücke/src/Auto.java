public class Auto {

    String model, farbe;
    int preis;

    public Auto(String model, String farbe, int preis) {
        this.model = model;
        this.farbe = farbe;
        this.preis = preis;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", farbe='" + farbe + '\'' +
                ", preis=" + preis +
                '}';
    }

    public void printAuto() {
        System.out.println(this);
    }
}
