import java.util.Arrays;

public class HW01Task06 {
    //    Императивное программирование:
    //    Задача 6: Упорядочивание списка. 
    //    Напишите программу, которая сортирует список чисел в порядке возрастания с использованием пузырьковой сортировки или другого метода сортировки.
    public static void main(String[] args) {
        int[] arr = {66, -9, 0, 10, 1, 56, -7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
