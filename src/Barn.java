public class Barn extends Biljett{

    public Barn(){
        super(85.0);
    }
    @Override
    public void visaInformation() {
        System.out.println("Barnbiljett Ordinarie pris: " + getGrundPris() + " kr");
    }
}
