package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] arr = {
                "BAONXXOLL"
                ,"BAOOLLNNOLOLGBAX"
                ,"QAWABAWONL"
                ,"ONLABLABLOON"
        };

        for(String S : arr) {
            System.out.println("문제__________________________________________________");
            solution(S);
        }
    }

    public static void solution(String S) {
        String targetStr = "BALLOON";
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        HashMap<Character, Character> hm2 = new HashMap<Character, Character>();
        int temp = 0;
        int result = S.length() / targetStr.length();

        //타켓 스펠링 갯수 확인
        for(int i = 0, len = targetStr.length(); i < len; i++) {


            if(hm.get(targetStr.charAt(i)) != null) {
                hm.put(targetStr.charAt(i), (char) (hm.get(targetStr.charAt(i)) + 1));
            } else {
                hm.put(targetStr.charAt(i), '1');
            }
        }


        Set set = hm.entrySet();
        for(Object obj : set) {
            System.out.println(obj);
        }

        System.out.println("--------------------------------------------");

        //타겟에 해당하는 스펠링 갯수 확인
        for(int i = 0, len = S.length(); i < len; i++) {
            if(targetStr.indexOf(S.charAt(i)) > -1) {
                if(hm2.get(S.charAt(i)) != null) {
                    hm2.put(S.charAt(i), (char) (hm2.get(S.charAt(i)) + 1));
                } else {
                    hm2.put(S.charAt(i), '1');
                }
            }

        }

        Set set2 = hm2.entrySet();
        for(Object obj : set2) {
            System.out.println(obj);
        }

        System.out.println("--------------------------------------------");

        //비교
        for(int i = 0, len = targetStr.length(); i < len; i++) {
            int num = hm.get(targetStr.charAt(i)) - '0';
            int num2 = hm2.get(targetStr.charAt(i)) - '0';
            temp = num2 / num;
            System.out.println(num2 +" / "+ num+" = "+temp);

            //min
            if(temp < result) result = temp;
        }

        System.out.println("정답 : " + result);
        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");

    }

}
