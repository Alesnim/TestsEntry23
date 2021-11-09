public class Main {

    public static void main(String[] args) {
        // тест-кейсы
        sumPositive(10, 1);
        sumPositive(10, 10);
        sumPositive(-42, 1);


    }


    // реализуйте метод сложения положительных чисел
    // для включения assertов служит опция -ea
    public static int sumPositive(int a, int b) {
        if ( a <= 0 || b <=0) return 1;
        return a+b;

    }


    // реализуйте метод поиска элементов в массиве
    // найти значения из массива б в массиве ориг
    // вернуть от 1 до 3 по количеству найденных элементов
    public int searchArray(int[] orig, int[] b) {


        return 0;
    }


}
