package week5;

import java.util.Arrays;
import java.util.Stack;

class Programmers_Change_Word {

    public int solution(String begin, String target, String[] words) {

        if (!Arrays.asList(words).contains(target)) return 0;

        // 하나만 다른 단어가 있는지 찾아야 된다.
        Stack stk = new Stack<String>();
        stk.add(begin);

        int cnt = 0;
        while (!stk.isEmpty()) {

            String str = (String) stk.pop();
            System.out.println(str + "팝!");
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                System.out.println(word);
                int diff = 0;
                for (int j = 0; j < word.length(); j++) {
                    System.out.println(word.charAt(j) + ":" + str.charAt(j));
                    if (word.charAt(j) != str.charAt(j)) {
                        System.out.println("다름!");
                        diff++;
                    }
                    if (diff > 1) break;
                }

                if (diff == 1) {
                    if (target.equals(word)) {
                        return cnt + 1;
                    } else {
                        System.out.println("더해!" + word);
                        stk.add(word);
                    }
                }
            }
            cnt++;
        }
        return 0;


    }

}

