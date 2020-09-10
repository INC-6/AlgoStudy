package week4;

/*

124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

 */

class Programmers_123_number {

    public String main(int n) {

        String answer = "";
        int temp;

        while (n > 0) {
            temp = n % 3; // temp = 0
            n = n / 3;   // n = 1
            if (temp == 0) {
                n -= 1;
                temp = 4;
            }
            answer = temp + answer;
        }
        return answer;

    }

}