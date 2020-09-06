package week3;

import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";

        //스트링 배열에 담기
        String[] alphabetArr = s.split("");

        //배열에 담긴 문자열 index찾기
        for(String alphabet : alphabetArr) {
            //대소문자 판단
            Boolean isUp = Character.isUpperCase(alphabet.charAt(0));
            int up = -1, low = -1;
            if(isUp) {
                up = upper.indexOf(alphabet);
            } else {
                low = lower.indexOf(alphabet);
            }

            //index+n 알파벳 찾아서 answer에 붙히기
            if(up > -1) {
                if(up+n < upper.length()) {
                    answer += upper.substring(up+n,up+n+1);
                } else {
                    answer += upper.substring(up+n-upper.length(),up+n-upper.length()+1);
                }
            } else if(low > -1) {
                if(low+n < lower.length()) {
                    answer += lower.substring(low+n,low+n+1);
                } else {
                    answer += lower.substring(low+n-lower.length(),low+n-lower.length()+1);
                }
            } else { //공백일때
                //그냥 공백 붙히기
                answer += alphabet;
            }
        }

        return answer;
    }
}