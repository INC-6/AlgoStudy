package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //테스트 값 생성
        int[] arr = new int[10000];
        for(int i = 0; i < 10000; i++) {
            arr[i] = i+1;
        }

        solution(arr);
    }

    public static void solution(int[] arr) {
        int[] result = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for(int num : arr) {
            String str = Integer.toString(num);
            //자르기 & 카운팅
            for(int i = 0, len = str.length(); i < len; i++) {
                result[str.charAt(i)-'0']++;
            }
        }

        //출력
        for(int i = 0, len = result.length; i < len; i++) {
            if (result[i] != 0) {
                System.out.println(i+" : "+result[i]+"개");
            }
        }
    }
}
