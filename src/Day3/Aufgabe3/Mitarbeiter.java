package Day3.Aufgabe3;

import java.util.ArrayList;
import java.util.List;

public class Mitarbeiter {
    private String name;
    private int nummer;

    public Mitarbeiter(String name, int nummer){
        this.name = name;
        this.nummer = nummer;
    }

    public String getName(){
        return name;
    }

    public static List<Mitarbeiter> maListe = new ArrayList<>();

    static {
        maListe.add(new Mitarbeiter("Max Muster", 123));
        maListe.add(new Mitarbeiter("Erika MusterFrau", 456));
        maListe.add(new Mitarbeiter("Stefan Müller", 789));
        maListe.add(new Mitarbeiter("Anna Hubertus", 1011));
    }
    public static final StringConverter<Mitarbeiter> maConverter = new StringConverter<Mitarbeiter>() {
        @Override
        String toString(Mitarbeiter obj) {
            return String.valueOf(obj.nummer);
        }

        @Override
        Mitarbeiter fromString(String obj) {
            int nummer = Integer.parseInt(obj);
            for (Mitarbeiter mitarbeiter : maListe){
                if (mitarbeiter.nummer == nummer){
                    return mitarbeiter;
                }
            }
            return null;
        }
    };
}
