package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class week4_11 {

    private static String[] chkPoint = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_"};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        System.out.println(solution(input));

    }

    //validationCheck
    private static boolean solution(String input) {

        String[] check01 = input.split("");

        //1. 길이체크 6보다 커야됨
        if (check01.length < 6) {
            System.out.println("길이가 6보다 작음");
            return false;
        }

        //2. 공백체크
        String[] check02 = input.split(" ");
        if (check02.length >= 2) {
            System.out.println("공백이 포함되어 있음");
            return false;
        }


        //3. 특수문자 개수 체크 특수문자 한개도 없으면 return false;
        String[] check03 = input.split("");
        ArrayList<String> strArrayList = new ArrayList<>();
        int chkPointCnt = 0;
        for (String chkStr : check03) {

            //숫자나 특수문자가 아닌 애들 담기 아래서 대문자 소문자 갯수판별예정
            if (!checkNumber(chkStr))
                strArrayList.add(chkStr);

            for (String aChkPoint : chkPoint) {
                if (chkStr.equals(aChkPoint)) chkPointCnt++;
            }

        }
        if(chkPointCnt < 1) {
            System.out.println("특수문자가 없음");
            return false;
        }


        //대소문자 각각 1개씩 있는지 체크
        int upperCnt = 0;
        int lowerCnt = 0;
        for(String chkStr : strArrayList){
            if(Character.isUpperCase(chkStr.charAt(0))) upperCnt++; //대문자이면 대문자 개수 증가
            if(Character.isLowerCase(chkStr.charAt(0))) lowerCnt++; //소문자이면 소문자 개수 증가
        }

        if(upperCnt < 1 || lowerCnt < 1) {
            System.out.println("대소문자 1개이상씩 들어가야됨");
            return false;
        }

        //위의 모든 과정에서 false로 빠지지 않고 통과하면 return true;
        return true;
    }


    //numberCheck
    private static boolean checkNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}