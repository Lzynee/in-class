/**
 * 기준이 되는 가운데 줄을 입력값으로 받아와,
 * 별(*) 기호를 다이아몬드 모양으로 출력하는 프로그램
 * */

package com.mystudy.etc;

import java.util.Scanner;

public class diamond_star {
    public static void main(String[] args) {
        // 변수 설정
        Scanner sc = new Scanner(System.in);  // 입력값 받아오기
        System.out.print("라인 입력 : ");
        int line = sc.nextInt();

        int star = 1;  // 별의 개수
        int space = line / 2; //라인 수를 기준으로 상, 하 나누기
        int i,j;

        // 다이아몬드 모양대로 별을 출력
        for(i = 0; i < line; i++) {  // 공백 출력
            for(j = 0; j < space; j++)
                System.out.print(" ");

            for(j = 0; j < star; j++)  // 별 출력
                System.out.print("*");

            System.out.println();

            if (i < line / 2) {  // 기준선 위는 공백을 줄이고, 별을 늘리며 출력
                star += 2;
                space--;
            }else {  // 기준선 아래는 공백을 늘리고, 별을 줄이며 출력
                star -= 2;
                space++;
            }
        }
    }
}
