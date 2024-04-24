package Day3.Aufgabe2;

/*
 * todo: Sie haben eine Methode, mit der Sie Objekte drucken können,
 * todo: welche das Interface 'IDruckbar' implementieren. 'IDruckbar' verfügt über eine 'getInfo()'-Methode,
 * todo: die, wenn sie in
 * todo: implementierenden Klassen überschrieben wurde, die Infos dieser Klasse als String zurückgibt.
 * todo: Nun möchten Sie zwischen den Ausgaben der Klassen-Infos aber noch extra Platz lassen.
 * todo: Die drucken-Methode und die in der Kunde-Klasse implementierte
 * todo: getInfo-Methode wollen oder können Sie aber nicht ändern.
 *
 * todo: Erstellen Sie das Interface 'IDruckbar' mit der String 'getInfo()'-Methode.
 * todo: Erstellen Sie die Klasse 'Kunde' mit dem Attribut 'name',
 * todo: welches über den Konstruktor gefüllt wird.
 * todo: Die Klasse implementiert das Interface und die getInfo-Methode gibt den Namen des Kunden zurück.
 *
 * todo: In Ihrer Main-Klasse erstellen Sie die statische Methode
 * todo: 'void drucken(IDruckbar... druckbar)'
 * todo: (Die Schreibweise mit ... nennt sich 'varargs' und ist quasi wie ein Array).
 * todo: Diese Methode wird zu Testzwecken in einer Schleife für
 * todo: alle übergebenen IDruckbar-Objekte die getInfo() aufrufen und ausgeben.
 *
 * todo: In der main-Methode erstellen Sie zwei Kunden und eine anonyme Klasse,
 * todo: welche das Interface implementiert.
 * todo: In dieser Implementierung jedoch wird getInfo() nur ">" zurückgeben.
 *
 * todo: Übergeben Sie den ersten Kunden,
 * todo: dann das Objekt der anonymen Klasse und dann den zweiten Kunden an die drucken()-Methode.
 */

public class Aufgabe2 {
    static void drucken(IDruckbar... druckbar){
        for (IDruckbar objekt : druckbar){
            System.out.println(objekt.getInfo() + " ");
        }
    }
    public static void main(String[] args) {

        Kunde k1 = new Kunde("Markus Marxen");
        Kunde k2 = new Kunde("Erika Erksen");

        IDruckbar ankla = new IDruckbar() {
            @Override
            public String getInfo() {
                return "<>";
            }
        };
    drucken(k1,ankla,k2);
    }
}
