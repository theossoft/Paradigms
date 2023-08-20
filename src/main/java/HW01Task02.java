public class HW01Task02 {
    //    Императивное программирование:
    //    Задача 2: Поиск наименьшего числа в списке.
    //    Напишите программу, которая находит наименьшее число в заданном списке с помощью цикла.
    public static void main(String[] args) {
        int[] arr = {10, -9, 99, -45, 0, 101, 77, 43, -56};
        System.out.println(minNumInArr(arr));

    }

    public static int minNumInArr(int[] list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) min = list[i];
        }
        return min;
    }
}
