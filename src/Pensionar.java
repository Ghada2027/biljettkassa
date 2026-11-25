public class Pensionar extends Biljett {

    public Pensionar() {
        super(90.0);
    }

    @Override
    public void visaInformation() {
        System.out.println("Pensionarbiljett");
    }
}