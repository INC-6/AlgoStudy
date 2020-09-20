import java.util.*;

class test {
    public static void main(String[] args) {
        String[] arr = {
                "FooBar123!"
                ,"foobar123!"
                ,"FooBar123"
                ,"F0bar! F0bar"
                ,"Fo0*"
        };

        for(String str : arr) {
            System.out.println(solution(str));
        }
    }

    public static boolean solution(String str) {
        int len = str.length();
        //길이 체크
        if(len < 6) {
            System.out.println("길이");
            return false;
        }

        Boolean isUpExist = false;
        Boolean isDownExist = false;
        Boolean isDigitExist = false;
        Boolean isScExist = false;
        char[] chars = str.toCharArray();
        for(char ch : chars) {
            if ('A' <= ch && ch <= 'Z') {
                isUpExist = true;
            } else if ('a' <= ch && ch <= 'z') {
                isDownExist = true;
            } else if ('0' <= ch && ch <= '9') {
                isDigitExist = true;
            } else {
                if (ch == ' ') {
                    System.out.println("공백");
                    return false;
                } else {
                    isScExist = true;
                }
            }
        }

        System.out.println("isUpExist: " + isUpExist + " | isDownExist:" +isDownExist+ " | isDigitExist:" + isDigitExist+ " | isScExist:" + isScExist );
        if(isUpExist == false || isDownExist == false || isDigitExist == false || isScExist == false) {
            return false;
        }


        return true;
    }
}