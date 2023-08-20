public class HW01Task03 {
    //    Декларативное программирование:
    //    Задача 3: Вычисление факториала числа.
    //    Напишите программу, которая находит факториал заданного числа N с использованием рекурсии или встроенных функций.
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}
