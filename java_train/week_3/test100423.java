/**
 * 자연수 1~10의 합을 구하는 프로그램
 * */

package com.mystudy.etc;

public class test100423 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("1 ~ 10까지의 합: "+sum);
    }
}
