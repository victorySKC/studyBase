package gaoxiaosuanfa.commonDivisor;

import java.util.Scanner;

/**
 * @author: Vincent
 * @description: 阿基米德给出的查找最大公约数的方法
 * @date: 2020-08-14 11:10
 **/
public class GCDEuclid {
    public static int gcd2(int m,int n) {
        int gcd = 1;
        if (m % n == 0)
            return n;
        for (int k = n / 2; k >= 1; k--) {
            if (m % n == 0 && n % k == 0) {
                gcd = k;
                break;
            }
        }
        return gcd;
    }

    public static int gcd(int m,int n){
        if (m % n == 0)
            return n;
        else
            return gcd(n,m % n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入第一个正整数m");

        int m = input.nextInt();
        System.out.println("输入第二个正整数n");
        int n = input.nextInt();
        System.out.println("m和n的最大公约数是" + gcd(m,n));
//15
// System.out.println("m和n的最大公约数是" + gcd2(m,n));
    }
}
