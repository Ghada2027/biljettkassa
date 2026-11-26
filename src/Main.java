
public class Main {

    public static void main(String[] args) {

        Vuxen v = new Vuxen();
        Barn b = new Barn();
        Pensionar p = new Pensionar();

        Biljett[] biljetter = {v, b, p};

        // Apply 10% discount to all tickets
        for (int i = 0; i < biljetter.length; i++) {
            biljetter[i].setRabatt(10);
        }

        // Print information about each ticket
        for (int i = 0; i < biljetter.length; i++) {

            visaBiljett(biljetter[i]);

            System.out.println("Pris efter rabatt: "
                    + biljetter[i].beraknaPris() + " kr");


            System.out.println("------------------------");
        }

        System.out.println("Antal biljetter: "
                + Biljett.getAntalBiljetter());

        v.setRabatt(60);

    }


    public static void visaBiljett(Biljett biljett) {
        biljett.visaInformation();
    }
}
