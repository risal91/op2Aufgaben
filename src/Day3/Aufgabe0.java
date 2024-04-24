package Day3;

/*
 * Sie haben eine Methode, mit der Sie Objekte drucken können, welche das Interface 'IDruckbar' implementieren. 'IDruckbar' verfügt über eine 'getInfo()'-Methode, die, wenn sie in
 * implementierenden Klassen überschrieben wurde, die Infos dieser Klasse als String zurückgibt. Nun möchten Sie zwischen den Ausgaben der Klassen-Infos aber noch extra Platz lassen.
 * Die drucken-Methode und die in der Kunde-Klasse implementierte getInfo-Methode wollen oder können Sie aber nicht ändern.
 *
 * Erstellen Sie das Interface 'IDruckbar' mit der String 'getInfo()'-Methode.
 * Erstellen Sie die Klasse 'Kunde' mit dem Attribut 'name', welches über den Konstruktor gefüllt wird.
 * Die Klasse implementiert das Interface und die getInfo-Methode gibt den Namen des Kunden zurück.
 *
 * In Ihrer Main-Klasse erstellen Sie die statische Methode 'void drucken(IDruckbar... druckbar)' (Die Schreibweise mit ... nennt sich 'varargs' und ist quasi wie ein Array).
 * Diese Methode wird zu Testzwecken in einer Schleife für alle übergebenen IDruckbar-Objekte die getInfo() aufrufen und ausgeben.
 *
 * In der main-Methode erstellen Sie zwei Kunden und eine anonyme Klasse, welche das Interface implementiert. In dieser Implementierung jedoch wird getInfo() nur ">" zurückgeben.
 *
 * Übergeben Sie den ersten Kunden, dann das Objekt der anonymen Klasse und dann den zweiten Kunden an die drucken()-Methode.
 */

public class Aufgabe0 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
