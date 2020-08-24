package gaoxiaosuanfa.sort;

/**
 * @author: Vincent
 * @description: 各种排序算法
 * @date: 2020-08-24 16:43
 **/
public class SortMethod {
    public static void main(String[] args) {
        int[] list = {12,56,89,16,46,48,415,766,1267,123};

        //System.out.println(list[2]);
         SortMethod.insertionSort(list);

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
}
