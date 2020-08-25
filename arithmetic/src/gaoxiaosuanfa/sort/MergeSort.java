package gaoxiaosuanfa.sort;

/**
 * @author: Vincent
 * @description: 并归排序，需要先打散再拼起来。
 * @date: 2020-08-25 14:32
 **/
public class MergeSort {
    public static void mergeSort(int[] list){
        if (list.length > 1){
            //将前半部并归排序
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list,0,firstHalf,0,list.length / 2);
            mergeSort(firstHalf);

            //将后半部并归排序
            int secondHalfLength = list.length - list.length / 2;
            int[] secoundHalf = new int[secondHalfLength];
            System.arraycopy(list,list.length / 2,secoundHalf, 0,secondHalfLength);
            mergeSort(secoundHalf);

            //将整个文件排序,这是下面的一个方法
            merge(firstHalf,secoundHalf,list);
        }
    }
    public static void merge(int[] list1,int[] list2, int[] temp){
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length){
            if (list1[current1] < list2[current2])
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }

        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
    }
}
