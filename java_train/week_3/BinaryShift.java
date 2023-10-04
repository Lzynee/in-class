package com.mystudy.binary;

public class BinaryShift {
    public static void main(String[] args) {
        int num = 13;

        System.out.println(num<<1);  // 왼쪽으로 한 칸 이동 -> 26
        System.out.println(num<<2);  // 왼쪽으로 두 칸 이동 -> 52
        System.out.println(num>>1); // 오른쪽으로 한 칸 이동 -> 6
        System.out.println(num>>2); // 오른쪽으로 두 칸 이동 -> 3
    }
}
