package javaex2;
/*
Stwórz funkcję map, która zmienia elementy listy (ma zwrócić nową
listę)
Dla wywołania:
List<Integer> elements = new ArrayList<>();
elements.add(5);
elements.add(8);
elements.add(12);
System.out.println(MyArray.map(elements, (a) -> a + 5));
Wynikiem powinno być:
[10, 13, 17]
 */

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(5);
        elements.add(8);
        elements.add(12);
        System.out.println(MyArray.map(elements, (a) -> a + 5));

    }
}
