package com.mystudy.condition;

import java.util.Scanner;

public class SwitchCaseGrade {
    public static void main(String[] args) {
        // 변수 설정
        char grade = ' ';  // 학점을 저장할 변수
        // 사용자의 점수를 입력 받기
        System.out.println("당신의 점수를 입력하세요: >");
        java.util.Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();  // 점수를 저장할 변수


        // 오류 방지
        if (!(0<=score && score<=100))
            System.out.println("0점 ~ 100점 사이의 점수를 숫자만 입력하세요.");


        // 점수에 따라 등급을 판정
        switch ((int)(score/10)) {
            case 10:
            case 9:
                grade = 'A';  // 90점 이상이면 A
                break;
            case 8:
                grade = 'B';  // 80점 이상이면 B
                break;
            case 7:
                grade = 'C';  // 70점 이상이면 C
                break;
            case 6:
                grade = 'D';  // 60점 이상이면 D
                break;
            default:
                grade = 'F';  // 60점 미만이면 F
        }  // end of switch

        //결과 출력하기
        System.out.println(score + "점은 " + grade + "학점입니다.");
    }  // end of main
}
