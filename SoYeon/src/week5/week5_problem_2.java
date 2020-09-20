import java.util.*;


class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i = 1, len = strings.length; i < len; i++) {
            char key = strings[i].charAt(n);
            int j = i-1;

            while(j >= 0) {
                if(strings[j].charAt(n) > key) {
                    swap(strings, j);
                } else if(strings[j].charAt(n) == key) {
                    if(strings[j].compareTo(strings[j+1]) > 0) swap(strings, j);
                }
                j--;
            }

        }
        return strings;
    }

    private void swap(String[] strings, int j) {
        String temp = strings[j];
        strings[j] = strings[j+1];
        strings[j+1] = temp;
    }
}


/*

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
} */

/*
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                else if(s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });
        return strings;
    }
}
*/
