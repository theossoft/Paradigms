public class HW01Task01 {
//    Императивное программирование:
//    Задача 1: Подсчет суммы четных чисел от 1 до N.
//    Напишите программу, используя цикл, которая находит сумму всех четных чисел в диапазоне от 1 до заданного числа N.
public static void main(String[] args) {
    System.out.println(sumFromOneToN(10));

}
public static int sumFromOneToN(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i++) {
        sum = sum + i;
    }
    return sum;
}
}
