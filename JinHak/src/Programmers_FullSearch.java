public class Programmers_FullSearch {

    public static int[] main(String[] args) {

        int[] answers = new int[3];

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] answer = new int[3];

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == a[i%5]) {answer[0]++;}
            if(answers[i] == b[i%8]) {answer[1]++;}
            if(answers[i] == c[i%10]) {answer[2]++;}
        }

        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));

        if(max == answer[0] && max == answer[1] && max == answer[2])
            return new int[]{1,2,3};
        else if(max == answer[0] && max == answer[1])
            return new int[]{1,2};
        else if(max == answer[0] && max == answer[2])
            return new int[]{1,3};
        else if(max == answer[1] && max == answer[2])
            return new int[]{2,3};
        else if(max == answer[0])
            return new int[]{1};
        else if(max == answer[1])
            return new int[]{2};
        else
            return new int[]{3};


    }
}
