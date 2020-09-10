package week3;

import java.util.PriorityQueue;
import java.util.Queue;

/*

[문제]
섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.

[1, 2, 3, 9, 10, 12] 7  2


스코빌 지수가 1인 음식과 2인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
새로운 음식의 스코빌 지수 = 1 + (2 * 2) = 5
가진 음식의 스코빌 지수 = [5, 3, 9, 10, 12]

스코빌 지수가 3인 음식과 5인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
새로운 음식의 스코빌 지수 = 3 + (5 * 2) = 13
가진 음식의 스코빌 지수 = [13, 9, 10, 12]

모든 음식의 스코빌 지수가 7 이상이 되었고 이때 섞은 횟수는 2회입니다.


--> ArrayList 로 구현 해보려고 하다가 실패
--> 검색 후

[우선순위 큐]

PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

priorityQueue.add(4); //offer(); 메소드를 사용해도 동일하게 추가됩니다.
priorityQueue.add(3);
priorityQueue.add(2);
priorityQueue.add(1);

Integer poll = priorityQueue.
System.out.println(poll); //출력결과 1

일반적인 큐와 다르게 가장 먼저 들어간 4가 아니라, 우선순위가 높은 1이 들어갔습니다. 기본적으로 숫자는 낮은 것이 우선순위를 높게 봅니다.

 */
class Programmers_More_Spicy {

    int answer = 0;
    public int main(int[] scoville, int K) {

        Queue<Integer> queue = new PriorityQueue<>();

        for (int i : scoville) {
            queue.offer(i);
        }

        while (queue.peek() <= K) {
            if (queue.size() == 1) {
                return -1;
            }

            int a = queue.poll();
            int b = queue.poll();

            int scov = a + (b * 2);

            queue.offer(scov);

            answer++;

        }

        return answer;

    }

}