package week5;

/*


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