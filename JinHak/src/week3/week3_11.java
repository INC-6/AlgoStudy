package week3;

public class week3_11 {

    static int[] A = {3, 2, -2, 5, -3};
    static int[] B = {1, 1, 2, -1, 2, -1};
    static int[] C = {1, 2, 3, -4};

    public static void main(String[] args) {

        solution(A);
        solution(B);
        solution(C);

    }

    //출력함수
    private static void solution(int[] arr) {
        //배열 없거나 1개면 그대로 0
        if (arr.length == 0 || arr.length == 1) System.out.println(0);

        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) { //배열의 값이 양수면,

                for (int j = 0; j < arr.length; j++) {

                    if (arr[i] + arr[j] == 0) {
                        //A배열 두개 나옴 두개 중 큰거

                        if (arr[i] > result) result = arr[i];

                    }

                }

            }
        }

        System.out.println(result);

    }

}