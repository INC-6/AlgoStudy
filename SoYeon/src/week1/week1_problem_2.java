package week1;

import java.util.*;

class Solution {
    public int solution(int num) {
        int count = 0;
        int limit = 500;

        while(count <= limit) {
            if(num == 1) { //정답
                return count;
            } else if(num % 2 == 0) { //짝수
                num = num / 2;
            } else if(num % 2 == 1){ //홀수
                num = num * 3 + 1;
            }

            //카운팅
            count += 1;
        }

        return -1;
    }
}