public class Main {

    public static void main(String[] args) {
        Vuxen v = new Vuxen();
        Barn b = new Barn();
        Pensionar p = new Pensionar();


        visaBiljett(v);
        visaBiljett(b);
        visaBiljett(p);


    }
    public static void visaBiljett(Biljett biljett) {
        biljett.visaInformation();
    }

}