package gaoxiaosuanfa.prime;

import java.util.Scanner;

/**
 * @author: Vincent
 * @description: 埃拉托色尼算法
 * @date: 2020-08-24 14:45
 **/
public class SieverPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("将找到n之前的所有素数，输入n");
        int n = input.nextInt();
        //数组primes用于筛选素数
        boolean[] primes = new boolean[n + 1];

        for (int i = 0; i <primes.length ; i++) {
            primes[i] = true;
        }

        for (int k = 2; k <= n / k ; k++){
            if (primes[k]){
                for (int i = k; i < n / k; i++) {
                    primes[k * i] = false;
                }
            }
        }
        final int NUMBER_PERLINE = 10;
        int count = 0;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]){
                count++;
                if (count % NUMBER_PERLINE == 0){
                    System.out.printf("%7d\n",i);
                }else {
                    System.out.printf("%7d",i);
                }
            }
        }
        System.out.println("\n" + count + "小于n的素数是有" + n);
    }
}
