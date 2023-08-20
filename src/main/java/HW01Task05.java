import java.util.ArrayList;
import java.util.List;

public class HW01Task05 {
    //    Императивное программирование:
    //    Задача 5: Поиск простых чисел.
    //    Напишите программу, которая находит все простые числа в заданном диапазоне от 1 до N.
    public static void main(String[] args) {
        System.out.println(primeNumberFromOneToN(100));
    }

    public static List<Integer> primeNumberFromOneToN(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if (isPrime) {
                primeNumbers.add(i);
                isPrime = true;
            }
        }
        return primeNumbers;
    }
}
