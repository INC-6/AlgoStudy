import java.util.*;

class test {
    public static void main(String[] args) {
        int[] arr = {3,2,-2,5,-3};
        int[] arr2 = {1,1,2,-1,2,-1};
        int[] arr3 = {1,2,3,-4};
        System.out.println(solution(arr3));
    }

    public static int solution(int[] arr) {
        int answer = 0;
        int temp = 0;
        for(int i : arr) {
            if(i > 0) {
                for(int j : arr) {
                    if(j < 0 && i == j*-1) {
                        if(i > answer) answer = i;
                    }
                }
            }
        }

        return answer;
    }
}