package builder;

public class Emlakci {
    public static void main(String[] args) {

        Ev ev1 = new Ev();
        ev1.setOlke("Azerbaycan");
        ev1.setSeher("Baki");
        ev1.setMehle("Xudu Mememedov");
        ev1.setBinaIli(2009);
        ev1.setOtaqSayi(3);
        ev1.setKombiVarmi(true);

        Ev ev2 = new Ev("Azerbaycan", "Baki", "Xudu Memmedov",
                1991, 3, 2, 2, 4,
                true, true, false, false);

        printEv(ev1);
        printEv(ev2);
    }

    private static void printEv(Ev ev) {

        System.out.println();

        System.out.println("Ev elave olundu " + ev);

        System.out.println();
    }
}
