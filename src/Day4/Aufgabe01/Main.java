package Day4.Aufgabe01;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        String[] test = {"bla", "BlaBla", "Bla..."};


//        Ausgabe wurst = (daten) -> {
//            System.out.println("Ausgabe auf dem Bildschirm: ");
//            for (String d :daten){
//                System.out.println(d);
//            }
//        };


        Consumer<String[]> bildschirm = strings -> {
            System.out.println("Ausgabe auf dem Bildschirm: ");
            for (String d :test){
                System.out.println(d);
            }
        };

        Consumer<String[]> datei = strings -> {
            System.out.println("Ausgabe in Datei: ");
            for (String d : test){
                System.out.println(d);
            }

        };
        Consumer<String[]> datenbank = strings ->{
            System.out.println("Ausgabe in Datei: ");
            for (String d : test){
                System.out.println(d);
            }
        };


        bildschirm.accept(test);
        datei.accept(test);
        datenbank.accept(test);

    }
}
