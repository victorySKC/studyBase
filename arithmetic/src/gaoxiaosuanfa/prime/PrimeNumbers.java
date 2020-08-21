package gaoxiaosuanfa.prime;

import java.util.Scanner;

/**
 * @author: Vincent
 * @description: 素数的简单算法，素数就是只有两个约数的数，1和她本身。
 * @date: 2020-08-20 09:49
 **/
//第一版代码
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("将找到n之前的所有素数，输入n");
        int n = input.nextInt();

        final int NUMBER_PRE_LINE = 10;

        int count = 0;//用于计数

        int number = 2; //用于检测是不是素数
        System.out.println("素数是");
        int squareRoot = 1;
        while (number <= n){
            boolean isPrime = true;
            if (squareRoot * squareRoot < number) squareRoot ++ ;
            for (int divisor = 2;divisor <= squareRoot;divisor++){
                if (number % divisor ==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
                if (count % NUMBER_PRE_LINE == 0){
                    System.out.printf("%7d\n",number);
                }else {
                    System.out.printf("%7d",number);
                }
            }
            number++;
        }
        System.out.println("\n" + count +" 个素数小于或等于 " + n);
    }
}
//        while (number <= n){
//            boolean isPrime = true;
/*
*for (int divisor = 2;divisor <= Math.sqrt(number);divisor++) 在每一次for都要计算一次，浪费，可以提出来
**/
            /*int aquareRoot = (int)Math.sqrt(number);
           // for (int divisor = 2;divisor <= Math.sqrt(number);divisor++){
            for (int divisor = 2;divisor <= aquareRoot;divisor++){
                if (number % divisor ==0){
                    isPrime = false;
                    break;
                }
            }
            *这样还是比较麻烦。还可以使用开方来简化步骤相关的
            **/

            // for (int divisor = 2;divisor <= Math.sqrt(number);divisor++){





