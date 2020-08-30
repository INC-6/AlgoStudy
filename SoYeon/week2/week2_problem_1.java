import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        //Commands
        int k = 0;
        for(int[] arr : commands) {
            //자르기 & 새로운 배열에 담기
            System.out.println("자르기 & 새로운 배열에 담기");
            int[] sortedArray = new int[arr[1]-arr[0]+1];
            for(int i = arr[0]-1, j = 0; i < arr[1]; i++, j++) {
//                System.out.println(array[i]);
                sortedArray[j] = array[i];
            }
            //정렬
            System.out.println("정렬");
            Arrays.sort(sortedArray);

            //정답 배열에 담기
            System.out.println("정답배열에 담기");
            answer[k] = sortedArray[arr[2]-1];
//            System.out.println("자릿수 : "+arr[2]);
//            System.out.println("해당 숫자"+answer[k]);
            k++;
        }

        //정답
//        System.out.println("정답");
//        for(int i : answer) {
//            System.out.println(i);
//        }
        return answer;
    }
}