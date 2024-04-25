package Day4.Aufgabe05;

/* Klasse Kunde mit:
 *  einer statischen Liste aller Kunden
 *  einer Integer kundennummer
 *  einem String name
 *  und einem Konstruktor, welcher die Eigenschaften füllt und den Kunden der Liste hinzufügt.
 *
 * In der Main:
 *  Eine Schleife, die 10 Mal eine Zufallszahl zwischen 1 und inklusive 10 ermittelt,
 *  prüft, ob es bereits einen Kunden mit dieser Zufallszahl als kundennummer gibt
 *  und wenn nicht, einen Kunden mit dieser kundennummer erstellt.
 *  Wie der name erzeugt wird, ist egal.
 *
 *  Um herauszufinden, ob es bereits Kunden mit der kundennummer gibt, kann die .stream().noneMatch() Methode der KundeListe aufgerufen werden.
 *  Diese Methode hat ein funktionales Interface vom Typ Predicate als Parameter. Hier übergeben Sie eine passende Lambda-Expression.
 *
 *  Anschließend geben Sie die KundeListe mit der ForEach()-Methode aus. Die ForEach()-Methode hat einen Consumer-Parameter. Hier übergeben Sie eine passende Lambda-Expression für die Konsolen-ausgaben.
 *
 *  Nun lassen Sie die Liste nach kundennummer sortieren. Dafür nutzen Sie die sort()-Methode der Liste. Diese Methode verwendet ein Functional Interface vom Typ 'Comparator'. Oder Sie verwenden Collections.sort(). Dafür muss Kunde dann das Interface 'Comparable' implementieren.
 *
 *  Zum Schluss wird die sortierte Liste ausgegeben.
 *
 */



public class Aufgabe5 {
}