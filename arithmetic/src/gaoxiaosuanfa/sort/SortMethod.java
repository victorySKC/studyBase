package gaoxiaosuanfa.sort;

/**
 * @author: Vincent
 * @description: 各种排序算法
 * @date: 2020-08-24 16:43
 **/
public class SortMethod {
    public static void main(String[] args) {
        int[] list = {12,56,89,16,46,48,415,766,1267,123 ,-23};

        //System.out.println(list[2]);
        // SortMethod.insertionSort(list);
        bubbleSort(list);

        for (int i = 0; i <list.length ; i++) {
            System.out.print(" " + list[i]);
        }
    }

    public static void insertionSort(int[] list){
        /**
         * @author : Vincent
         * @description: 插入排序
         * @time: 2020/8/24 17:00
         * @params [list]
         * @return void
         */

        for (int i = 1; i < list.length; i++) {
            int element = list[i];
            int k ;
            for (k = i -1; k >= 0 && list[k] > element; k--){
                list[k + 1] = list[k];
            }
            list[k + 1] = element;
        }
    }

    public static void bubbleSort(int[] list){
        /**
         * @author : Vincent
         * @description: 冒泡排序、就是下沉排序。需要遍历，所以有for嵌套。
         * @time: 2020/8/25 14:17
         * @params [list]
         * @return void
         */

        boolean nextNeed =true;
        for (int i = 1; i < list.length && nextNeed; i++) {
            nextNeed = false;
            for (int j = 0; j <list.length - i; j++) {
                if (list[j] > list[j + 1]){
                    int temp = list [j];
                    list [j] = list[j + 1];
                    list[j + 1] = temp;
                    nextNeed = true;
                }
            }
        }

    }
}
