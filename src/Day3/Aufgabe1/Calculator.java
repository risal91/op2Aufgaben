package Day3.Aufgabe1;

public class Calculator {
    public int calculate(int a, int b, Operation operation){
        return operation.excute(a , b);
    }
}
