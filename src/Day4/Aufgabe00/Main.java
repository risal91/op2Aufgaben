package Day4.Aufgabe00;

public class Main {

    static void schwimmen(){
        System.out.println("Ich schwimme.");
    }
    static void laufen(){
        System.out.println("Ich Laufe.");
    }

    public static void main(String[] args) {
        Sportler sportler = new Sportler();

        sportler.führeAktionAus(Main::schwimmen);
        sportler.führeAktionAus(Main::laufen);

        sportler.führeAktionAus(() -> System.out.println("Ich schwimme."));
        sportler.führeAktionAus(() -> System.out.println("Ich Laufe."));


    }
}

