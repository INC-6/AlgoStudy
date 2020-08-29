import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int k =0;

        //Commands
        for(int[] arr : commands) {
            System.out.println(arr);
            int[] sortedArray = new int[arr[1]-arr[0]+1];
            //자르기 & 새로운 배열
            for(int i = arr[0]-1, j = 0; i < arr[1]; i++, j++) {
                System.out.println(array[i]);
                sortedArray[j] = array[i];
            }
            //정렬
            System.out.println("정렬");
            Arrays.sort(sortedArray);
            for(int p : sortedArray) {
                if(p != 0)
                    System.out.println(p);
            }
            System.out.println("자릿수 : "+arr[2]);
            answer[k] = sortedArray[arr[2]-1];
            System.out.println("해당 수 : "+sortedArray[arr[2]-1]);
            System.out.println("해당 숫자"+answer[k]);
            k++;
        }

        System.out.println("정답");
        for(int i : answer) {
            if(i != 0)
                System.out.println(i);
        }
        return answer;
    }
}