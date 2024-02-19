package org.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P03_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int suNo = Integer.parseInt(st.nextToken()); //숫자 개수
        int quizNo = Integer.parseInt(st.nextToken()); //질의 개수

        long[] S = new long[suNo + 1]; //합 배열 선언

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<suNo; i++){ //1번째 부터 배열 사용하기
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int q=0; q<quizNo; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j]-S[i-1]);
        }
    }
}