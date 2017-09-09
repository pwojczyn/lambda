package simpledemo1;

@FunctionalInterface
interface FunctInterface {
    //metoda opisuje strukture "dozwolonych" wyrazen lambda
    String h(String w1, String w2);
}


public class Main {

    //funkcja ktora jako argument przyjmuje wyrazenie
    //lambda zgodne z interfejsem FunctInterface
    private static String fun(FunctInterface fi) {
        //do napisu wynikowego dodajemy wynik wywolania wyrazenia lambda
        String result = "joined strings: " + fi.h("abc", "ghi");
        return result;
    }

    public static void main(String[] args) {
//        FunctInterface fi = (a, b) -> a + ", " + b;
//        System.out.println(fi.h("test1", "niesporczak"));

        //w momencie wywolywania funcji fun, przekazuje jej konkretny (anonimowy)
        //wzor funkcji ktora przyjmuje dwa napisy i zwraca napis (wyrazenie lambda)
        System.out.println(fun((a, b) -> b + ", " + a + ", " + b));
    }
}
