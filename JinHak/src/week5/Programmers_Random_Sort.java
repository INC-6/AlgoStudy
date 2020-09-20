package week5;

/*

124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Programmers_Random_Sort {

    public String[] main(String[] strings, int n) {

        String[] answer;

        List<String> list = new ArrayList<>();

        for (String s : strings) {
            list.add(s.charAt(n) + s);
        }

        Collections.sort(list);
        answer = new String[list.size()];

        for (int i = 0; i < strings.length; i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }

        for (String s : answer) {
            System.out.println(s);
        }

        return answer;

    }

}