package Day3.Aufgabe3;

/* Sie bereiten Ihre Model-Klassen zur Verwendung in einer GUI vor.
Um die Daten in den GUI Elementen darstellen zu können, brauchen Sie eine Möglichkeit,
 * die Objekte in Strings und aus Strings zurück in die Objekte konvertieren zu können.
 Die GUI Elemente sind bereits darauf eingestellt, einen String-Konverter zu verwenden.
 * Der String-Konverter ist eine abstrakte,
 generische Klasse mit dem Namen 'StringConverter'. Verwenden Sie folgende Syntax:
 *  'abstract class StringConverter<T>'
 * Über generische Klassen erfahren Sie zu einem anderen Zeitpunkt mehr.
 Im Prinzip bedeutet es, dass die Klasse mit beliebigen Typen verwendet werden kann.
 * Diese Typen sind in diesem Fall Ihre Model-Klassen.
 * Die StringConverter-Klasse verfügt über folgende Methoden:
 *  abstract String toString(T obj)
 *  abstract T fromString(String obj)
 *
 * Ihre Model-Klasse 'Mitarbeiter' verfügt über
 eine öffentliche statische Liste vom Typ Mitarbeiter und
 die beiden Attribute 'String name' und 'int nummer'.
 * Diese Attribute werden über den Konstruktor beschrieben.
 Für 'name' gibt es auch noch einen getter.
 *
 * In der 'Mitarbeiter'-Klasse erzeugen Sie ein öffentliches,
 statisches Feld (Field/Attribut) vom Typ StringConverter
 und instanziieren eine anonyme Klasse, welche von StringConverter erbt.
 * Die toString-Methode gibt Nummer als String zurück.
 * Die fromString-Methode sucht in der Liste nach einem
 passenden Objekt entsprechend der übergebenen Nummer
 als String und gibt dieses Objekt zurück.
 * Wird keins gefunden, wird null zurückgegeben.
 *
 * Zum Testen erstellen Sie vier Mitarbeiter und
 lassen diese mit der Converter-Methode als String ausgeben.

 * Anschließend fragen Sie über die Konsole eine Nummer als String ab.
 Es wird der Name des Mitarbeiters mithilfe der fromString-Methode ausgegeben.
 */

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        Mitarbeiter ma1 = new Mitarbeiter("Tom Tomsen", 1928);
        Mitarbeiter ma2 = new Mitarbeiter("Klaus Klausen", 2021);
        Mitarbeiter ma3 = new Mitarbeiter("Petra Peters", 3141);
        Mitarbeiter ma4 = new Mitarbeiter("Ingo Stadt", 4252);

        Mitarbeiter.maListe.add(ma1);
        Mitarbeiter.maListe.add(ma2);
        Mitarbeiter.maListe.add(ma3);
        Mitarbeiter.maListe.add(ma4);

  for (int i = 0; i < Mitarbeiter.maListe.size(); i++)
        System.out.println(Mitarbeiter.maConverter.toString(Mitarbeiter.maListe.get(i)));

        System.out.println("Gib eine Nummer ein: ");
        Scanner sc = new Scanner(System.in);
        String nummerString = sc.nextLine();

        Mitarbeiter mitarbeiter = Mitarbeiter.maConverter.fromString(nummerString);
        if (mitarbeiter != null){
            System.out.println("Name des Mitarbeiters: " + mitarbeiter.getName());
        }else {
            System.out.println("Es gibt keinen Mitarbeiter mit dieser Nummer!");
        }

    }
}
