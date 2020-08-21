package gaoxiaosuanfa.prime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: Vincent
 * @description: 更高效的求素数方法
 * @date: 2020-08-21 10:19
 **/
public class EfficientPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("将找到n之前的所有素数，输入n");
        int n = input.nextInt();

        List<Integer> list = new ArrayList<>();
        final int NUMBER_PRE_LINE = 10;

        int count = 0;//用于计数

        int number = 2; //用于检测是不是素数
        int squareRoot = 1;
        System.out.println("素数是 \n");

        while (number <= n){
            boolean isPrime = true;
            if (squareRoot * squareRoot < number)
                squareRoot++;
            for (int k = 0;k < list.size() && list.get(k) <= squareRoot; k++){
                if (number % list.get(k) == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
                list.add(number);
                if (count % NUMBER_PRE_LINE == 0){
                    System.out.println(number);
                }else {
                    System.out.print(number + " ");
                }
            }
            number++;
        }
        System.out.println("\n" + "小于等于" + n + "的素数数量是"+ count );
    }
}
