package com.mystudy.condition;

import java.util.Scanner;

public class IfElseGrade {
    public static void main(String[] args) {
        // 변수 설정
        char grade = ' ';  // 학점을 저장할 변수
        // 사용자의 점수를 입력 받기
        System.out.println("당신의 점수를 입력하세요 (숫자만 입력): >");
        java.util.Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();  // 점수를 저장할 변수


        // 오류 방지
        if (!(0<=score && score<=100))
            System.out.println("0점 ~ 100점 사이의 점수를 숫자만 입력하세요.");


        // 점수에 따라 등급을 판정
        if (score >= 90) {  // 90점 이상이면 A
            grade = 'A';
        } else if (score >= 80) {  // 80점 이상이면 B
            grade = 'B';
        } else if (score >= 70) {  // 70점 이상이면 C
            grade = 'C';
        } else if (score >= 60) {  // 60점 이상이면 D
            grade = 'D';
        } else grade = 'F';  // 60점 미만이면 F

        
        // 결과 출력하기
        System.out.println(score + "점은 " + grade + "학점입니다.");
    }  // end of main
}
