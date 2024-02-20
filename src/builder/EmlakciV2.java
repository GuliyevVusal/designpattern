package builder;

public class EmlakciV2 {

    public static void main(String[] args) {

        Ev ev1 = EvBuilder.startBuild("Azerbaycan", "Baki", "Xudu Memmedov", 1992, 4)//compulsory
//                .setOlke("Azerbaycan")
//                .setSeher("Baki")
//                .setMehle("Xudu Memmedov")
//                .setBinaIli(1992)
//                .setOtaqSayi(4)
//                .setParkingVarmi(true)
                .setKombiVarmi(true) //    Optional
                .setParkingVarmi(true)//   Optional
                .build();


        printEv(ev1);

    }

    private static void printEv(Ev ev) {

        System.out.println();

        System.out.println("Ev elave olundu " + ev);

        System.out.println();
    }
}
