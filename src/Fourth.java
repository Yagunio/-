import java.util.Arrays;

public class Fourth {
    /*
        Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно). 
    */

    public static Integer[] remove_el(Integer[] p_args, int p_element) {
        Integer l_move_element = 0;
        Integer l_count_move   = 0;
        for (int i = 0; i < p_args.length - l_count_move; i++) {
            if (p_args[i] == p_element) {
                l_move_element = p_args[p_args.length - 1 - l_count_move];
                p_args[p_args.length - 1 - l_count_move] = p_args[i];
                p_args[i] = l_move_element;
                l_count_move += 1;
            }
        }
        
        return Arrays.copyOf(p_args, p_args.length - l_count_move);
    }

    public static void main(String[] args) {
        Integer l_list[] = {2,6,1,5,1,5,1,2,4,6,1,2,3,5};
        Integer l_num = 1;
        
        System.out.println(Arrays.toString(remove_el(l_list, l_num)));
    }
}
