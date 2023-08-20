import java.util.Arrays;
import java.util.HashSet;

public class HW01Task04 {
//    Декларативное программирование:
//    Задача 4: Поиск уникальных элементов в списке.
//    Напишите программу, которая создает новый список, содержащий только уникальные элементы из исходного списка.
public static void main(String[] args) {
    Object[] numbers = {1, 3, 3, 3, 1, 5};
    Object[] strings = {"Привет", "1", "3", "3", "3", "1", "5", "Привет"};
    System.out.println(Arrays.toString(unicElements(numbers)));
    System.out.println(Arrays.toString(unicElements(strings)));

}
public static Object[] unicElements(Object[] list) {
    return (new HashSet<>(Arrays.asList(list))).toArray();
}

}
