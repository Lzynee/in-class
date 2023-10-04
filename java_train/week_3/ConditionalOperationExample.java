package com.mystudy.condition;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');  // 점수가 90점보다 높으면 A, 80점보다 높으면 B, 80점 미만이면 C
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
