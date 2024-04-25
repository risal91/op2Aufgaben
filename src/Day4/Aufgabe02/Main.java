package Day4.Aufgabe02;


public class Main {
    public static boolean A_IstLängerAls_B(String s1, String s2) {
        if (s1.length() < s2.length()){
            return false;
        }else {
            return true;
        }
    }

    public static boolean A_hatMehrEAls_B(String s1, String s2){
        int countE1 = 0;
        int countE2 = 0;
        for (char c : s1.toCharArray()) {
            if (c == 'E' || c == 'e'){
                countE1++;
            }
        }
        for (char c : s2.toCharArray()) {
            if (c == 'E' || c == 'e'){
                countE2++;
            }
        }
        if (countE1 > countE2){
            return true;
        }else {
            return false;
        }
    }

    public static void Sortiere(String[] arr, PrüfeStrings prüfeStrings){
        for (int i = arr.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (prüfeStrings.prüfen(arr[j],arr[j+1])){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public  static  void ausgabe(String[] arr){
        for(String s : arr){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Dampfschifffahrtsgesellschaft" , "EDV", "Schneeeule"};

        for(String s : arr){
            System.out.println(s);
        }

        PrüfeStrings prüfeStringsLänge = new PrüfeStrings(A_IstLängerAls_B())



    }
}
