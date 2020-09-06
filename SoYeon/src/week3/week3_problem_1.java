package week3;

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int newScoville = 0;
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();

        //큐 삽입
        for(int s : scoville) {
            q.add(s);
        }

        while(true) {
            //맨 앞 2개 음식 섞기
            newScoville = q.poll() + q.poll() * 2;

            //음식 다시 넣기
            q.offer(newScoville);

            //섞은 회수 카운팅
            answer++;

            //스코빌 체크;
            if(q.peek() >= K) {
                break;
            } else {
                if(q.size() < 2) {
                    answer = -1;
                    break;
                }
            }

        }

        return answer;
    }
}