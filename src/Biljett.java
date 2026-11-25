public abstract class Biljett {
    private static int antalBiljetter = 0;
    private final double grundPris;
    private double rabatt;

    public Biljett(double grundPris) {
        this.grundPris = grundPris;
        this.rabatt = 0.0;
        antalBiljetter++;
    }

    public double getGrundPris() {
        return grundPris;
    }

    public double getRabatt() {
        return rabatt;
    }
    public void setRabatt(double rabatt) {
        if (rabatt >= 0 && rabatt <= 50) {
            this.rabatt = rabatt;
        } else {
            System.out.println("Ogiltig rabatt! Ange mellan 0 och 50.");
        }
    }

    public double beraknaPris() {
        return grundPris - (grundPris * rabatt / 100);
    }
    public static int getAntalBiljetter() {
        return antalBiljetter;
    }

    public abstract void visaInformation();
}