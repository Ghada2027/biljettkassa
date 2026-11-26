public class Vuxen extends Biljett {

    public Vuxen() {
        super(150.0);
    }
    @Override
    public void visaInformation() {
        System.out.println("Vuxenbiljett Ordinarie pris: " + getGrundPris() + " kr");
    }
}