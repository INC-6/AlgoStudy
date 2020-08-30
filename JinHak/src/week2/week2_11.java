package week2;

import java.util.ArrayList;

public class week2_11 {


    public static void main(String[] args) {

        System.out.println(solution("BAONXXOLL"));
        System.out.println(solution("BAOOLLNNOLOLGBAX"));
        System.out.println(solution("QAWABAWONL"));
        System.out.println(solution("ONLABLABLOON"));
    }

    private static int solution(String s) {

        StringBuilder sb = new StringBuilder(s);
        ArrayList<String> stringArrayList = new ArrayList<>();

        int countB = 0;
        int countA = 0;
        int countL = 0;
        int countO = 0;
        int countN = 0;
        int counter = 0;

        for (int i = 0; i < sb.length(); i++) {
            stringArrayList.add(String.valueOf(sb.charAt(i)));
        }

        System.out.println(stringArrayList.toString());

        for (int i = 0; i < stringArrayList.size(); i++) {
            if ("B".equals(stringArrayList.get(i))) {
                countB++;
                stringArrayList.remove(i);
                System.out.println(stringArrayList.toString());
                i = 0;
            }
            if ("A".equals(stringArrayList.get(i))) {
                countA++;
                stringArrayList.remove(i);
                System.out.println(stringArrayList.toString());
                i = 0;

            }
            if ("L".equals(stringArrayList.get(i))) {
                countL++;
                stringArrayList.remove(i);
                i = 0;
                System.out.println(stringArrayList.toString());

            }
            if ("O".equals(stringArrayList.get(i))) {
                countO++;
                stringArrayList.remove(i);
                i = 0;
                System.out.println(stringArrayList.toString());

            }
            if ("N".equals(stringArrayList.get(i))) {
                countN++;
                stringArrayList.remove(i);
                System.out.println(stringArrayList.toString());
                i = 0;
            }
            if (countB > 0 && countA > 0 && countL > 1 && countO > 1 && countN > 0) {
                System.out.println("BALLON get !! " + stringArrayList.toString());
                countB = 0;
                countA = 0;
                countL = 0;
                countO = 0;
                countN = 0;
                i = 0;
                counter++;
            }
        }

        System.out.println("최종 :" + stringArrayList.toString());
        System.out.println("return :" + counter);

        return counter;
    }


}
