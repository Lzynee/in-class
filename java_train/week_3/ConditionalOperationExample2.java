package com.mystudy.condition;

public class ConditionalOperationExample2 {
    public static void main(String[] args) {
        // 변수 설정
        int score = 85;
        char grade = ' ';

        // if문
        if (score > 90) {  // 90점 초과이면 A등급
            grade = 'A';
        } else if (score > 80) {  // 80점 초과이면 B등급
            grade = 'B';
        } else {  // 80점 이하이면 C등급
            grade = 'C';
        }

        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
