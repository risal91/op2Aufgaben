package Day3.Aufgabe1;

/* Schreiben Sie eine Klasse 'Calculator', die eine Methode 'calculate' enthält,
mit zwei Zahlen und einem Objekt vom Typ 'Operation' als Parameter und das Ergebnis der Operation als Rückgabe.
 'Operation' ist ein Interface mit der Methode 'execute(int a, int b)'.
 Verwenden Sie anonyme Klassen,
 um für jede Operation ein Objekt zu erstellen und es der `calculate`-Methode zu übergeben.

 In der main-Methode erstellen Sie vier anonyme Klassen,
 die das Interface implementieren und 'execute' mit den vier Grundrechenarten überschreiben.
 Die Instanzen der vier anonymen Klassen übergeben sie dann an die `calculate`-Methode der Calculator-Klasse.
*/

public class Aufgabe1 {
    public static void main(String[] args) {
        Operation op;
        Calculator cal = new Calculator();

        //Addition
        op = new Operation() {
            @Override
            public int excute(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Summe: " + cal.calculate(1, 1, op));

        //Subraktion
        op = new Operation() {
            @Override
            public int excute(int a, int b) {
                return a - b;
            }
        };
        System.out.println("Differenz: " + cal.calculate(5,3, op));

        // Multiplikation
        op = new Operation() {
            @Override
            public int excute(int a, int b) {
                return a * b;
            }
        };
        System.out.println("Produkt: " + cal.calculate(10, 18, op));

        // Division
        op = new Operation() {
            @Override
            public int excute(int a, int b) {
                return a / b;
            }
        };
        System.out.println("Quotient: " + cal.calculate( 80, 4, op));

    }
}
