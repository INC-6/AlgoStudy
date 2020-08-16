import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<String> winnerList = new ArrayList<String>();
        int bestScore = 0;

        //패턴
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};      
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; 

        //패턴리스트
        ArrayList<int[]> pttrList = new ArrayList<int[]>();
        pttrList.add(one);
        pttrList.add(two);
        pttrList.add(three);

        //패턴별
       for(int i = 0, pLen = pttrList.size() ; i < pLen ; i++) {
           int[] pttr = pttrList.get(i);
           int score = 0;
           int patternLen = pttr.length;

           //정답비교
           for(int j = 0, aLen = answers.length ; j < aLen ; j++) {
               int num = j % patternLen; //패턴돌리기
               if(answers[j] == pttr[num]) { //스코어 올리기
                   score += 1;
               }
           }

           if(bestScore < score) { //베스트 스코어 확인
               //이전 스코어러 삭제
               Iterator<String> iter = winnerList.iterator();
               while (iter.hasNext()) {
                    iter.next();
                    iter.remove();
                }
               //new 스코어러
               bestScore = score;
               winnerList.add(Integer.toString(i+1));
           } else if (bestScore == score) { //동점자
               winnerList.add(Integer.toString(i+1));
           }
       }

        //결과값 생성
        int[] result = new int[winnerList.size()];
        
        for(int i = 0, len = winnerList.size() ; i < len ; i ++) {
            result[i] = Integer.parseInt(winnerList.get(i));
        }
        return result;
    }
}
