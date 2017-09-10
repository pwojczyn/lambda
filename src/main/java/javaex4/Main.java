package javaex4;
/*
Michał Makaruk: Na razie  na rozgrzewkę, zróbcie poniższe zadanie
Michał Makaruk: Napisz fukcję arrayFun, która przyjmuje tablicę (nie listę) liczb całkowitych oraz wyrażenie lambda zgodne z funkcją:boolean f(int x). Funkcja arrayFun powinna zwrócić sumęwszystkich elementów z tablicy, które spełniają warunek określony w wyrażeniu lambda.Przykład użyciaint t[]={9, 0, -8, 2}double sum = arrayFun(t, (x) -> x > 0);sum po takim wywołaniu powinno być równe 11
 */

public class Main {

    public static double arrayFun(int[] t, IntegerLambda lambda) {
        double result = 0;

        for (int i : t) {
            if (lambda.f(i)) {

                result += i;
            }

        }
        return result;
    }


    public static void main(String[] args) {
        int t[] = {9, 0, -8, 2};
        
        double sum = arrayFun(t, (x) -> x > 0);

        System.out.println((int)sum);
    }
}
