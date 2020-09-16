package week5;

import java.util.*;

class Solution {
    int answer = 0;

    public int solution(String begin, String target, String[] words) {
        answer = words.length+1;

        //words에 target있는지 확인
        boolean isExist = false;
        for(String w:words) {
            if(target.equals(w)) {
                isExist = true;
                break;
            }
        }

        if(isExist) {
            boolean[] used = new boolean[words.length];
            search(begin, target, words, used, 0);
        }

        return (answer == words.length+1) ? 0 : answer;
    }

    public void search(String begin, String target, String[] words, boolean[] used, int depth) {
        if(begin.equals(target)) {
            answer = (answer > depth) ? depth : answer;
            return;
        }

        for(int i = 0, len = words.length; i < len; i++) {
            if(!used[i] && isPossible(begin, words[i])) {
                used[i] = true;
                search(words[i], target, words, used, depth+1);
                used[i] = false; //한번 탐색 이후에 초기화
            }
        }

    }

    public boolean isPossible(String str, String str2) {
        int cnt = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str2.charAt(i)) cnt++;
            if(cnt > 1) return false;
        }

        return true;
    }
}
/*풀이가 너무 좋음 (공유)

class Solution {

    static class Node {
        String next;
        int edge;

        public Node(String next, int edge) {
            this.next = next;
            this.edge = edge;
        }
    }

    public int solution(String begin, String target, String[] words) {
        int n = words.length, ans = 0;

        // for (int i=0; i<n; i++)
        //  if (words[i] != target && i == n-1) return 0;

        Queue<Node> q = new LinkedList<>();


        boolean[] visit = new boolean[n];
        q.add(new Node(begin, 0));

        while(!q.isEmpty()) {
            Node cur = q.poll();
            if (cur.next.equals(target)) {
                ans = cur.edge;
                break;
            }

            for (int i=0; i<n; i++) {
                if (!visit[i] && isNext(cur.next, words[i])) {
                    visit[i] = true;
                    q.add(new Node(words[i], cur.edge + 1));
                }
            }
        }

        return ans;
    }

    static boolean isNext(String cur, String n) {
        int cnt = 0;
        for (int i=0; i<n.length(); i++) {
            if (cur.charAt(i) != n.charAt(i)) {
                if (++ cnt > 1) return false;
            }
        }

        return true;
    }
}
*/
