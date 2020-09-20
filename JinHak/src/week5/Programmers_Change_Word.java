package week5;

import java.util.Arrays;
import java.util.Stack;

/*

begin	target	words	                       return
hit	     cog	[hot, dot, dog, lot, log, cog]	4
hit	     cog	[hot, dot, dog, lot, log]	    0

예를 들어 begin이 hit, target가 cog, words가 [hot,dot,dog,lot,log,cog]라면
hit -> hot -> dot -> dog -> cog와 같이 4단계를 거쳐 변환할 수 있습니다.


* */

class Programmers_Change_Word {

    public int solution(String begin, String target, String[] words) {

        if (!Arrays.asList(words).contains(target)) return 0;

        // 하나만 다른 단어가 있는지 찾아야 된다.
        Stack stk = new Stack<String>();
        stk.add(begin);

        //hit

        int cnt = 0;
        while (!stk.isEmpty()) {

            String str = (String) stk.pop();
            System.out.println(str + "팝!"); //hit
                                            //hot
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                System.out.println(word); //hot
                int diff = 0;

                for (int j = 0; j < word.length(); j++) {
                     // h:h
                     // o:i
                     // t:t
                    System.out.println(word.charAt(j) + ":" + str.charAt(j));
                    if (word.charAt(j) != str.charAt(j)) {
                        System.out.println("다름!");
                        diff++;
                    }
                    if (diff > 1) break;

                }

                hit
                hot

                if (diff == 1) {
                    //cog // hot
                    if (target.equals(word)) {//false
                        return cnt + 1;
                    } else {
                        //hot
                        //hit
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

