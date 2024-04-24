package Day3.Aufgabe2;

public class Kunde implements IDruckbar{
    private final String name;

     public Kunde (String name){
        this.name = name;
    }

    @Override
    public String getInfo() {
        return name;
    }
}
