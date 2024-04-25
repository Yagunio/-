public class Second {
    /* 
        Реализуйте алгоритм сортировки пузырьком для сортировки массива 
    */
    public static double set_random(){
      return Math.random();
    }

    public static void main(String[] args) {
      Double l_list[] = new Double[10];
      Double l_num = 0.0;
      Boolean l_flag;

      System.out.println("Список элементов:");
      for (int i = 0; i < l_list.length; i++) {
        l_list[i] = set_random();
        System.out.println(l_list[i]);
      }
      test:
      for (int i = 0; i < l_list.length; i++) {
        l_flag = false;
        for (int j = 0; j < l_list.length - i - 1; j++) {
          if (l_list[j+1] < l_list[j]){
            l_num = l_list[j];
            l_list[j] = l_list[j+1];
            l_list[j+1] = l_num;
            l_flag = true;
          }
        }

        if (!l_flag) break test;
      }

      System.out.println("Отсоритированный список элементов:");
      for (int i = 1; i < l_list.length; i++) System.out.println(l_list[i]);
    }
}

