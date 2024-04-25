public class First {
    /*
        Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
        Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1]. 
    */
    
    public static double set_random(){
        return Math.random();
    }

    public static Double get_min(Double p_first, Double p_second){
        if (p_first == null) return p_second; 
        if (p_first < p_second)
            return p_first;
        else
            return p_second;
    } 

    public static Double get_max(Double p_first, Double p_second){
        if (p_first == null) return p_second; 
        if (p_first > p_second)
            return p_first;
        else
            return p_second;
    } 
    
    public static void main(String[] args){
        Double l_list[] = new Double[10];
        Double l_summ = 0.0;
        Double l_min_value = 0.0;
        Double l_max_value = 0.0;

        System.out.println("Список значений:");
        for (int i = 1; i < l_list.length; i++) {
            l_list[i] = set_random();
            l_min_value = get_min(l_list[i-1], l_list[i]);
            l_max_value = get_max(l_list[i-1], l_list[i]);
            l_summ      = l_summ + l_list[i];
            System.out.println(l_list[i]);
        }

        System.out.println("Наименьшее значение: " + l_min_value);
        System.out.println("Наибольшее значение: " + l_max_value);
        System.out.println("Среднее значение: "    + l_summ / l_list.length);
    }
}