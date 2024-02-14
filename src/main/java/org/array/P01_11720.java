package org.array;

import java.util.Scanner;

public class P01_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for (char c : cNum) {
            sum += c - '0'; //char에서 문자 0을 뺀 것이 숫자값 (아스키코드)
        }

        System.out.println(sum);
    }
}