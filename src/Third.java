public class Third {
    /*
        Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
        Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы. 
    */

    public static void main(String[] args) {
        out:
        for (int i = 2; i < 101; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    continue out;
                }
            }
            System.out.println(i);
        }
    }
}
