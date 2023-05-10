package com.javabook.v1ch03;

import java.util.Scanner;

/**
 * @author SiVincent
 * @description 测试输入方法  Scanner
 * @date 2023/5/8
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.print("What is your name? ");
        String name = in.nextLine();

        // get second input
        System.out.print("How old are you? ");
        int age = in.nextInt();

        // display output on console
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
    }
}
