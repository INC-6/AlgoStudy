package week1;

public class week1_problem {

    static int num = 0;
    static int[] intArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            cut(i);
        }
        for (int i = 0 ; i < intArr.length; i++){
            System.out.println(i+"의 개수" + intArr[i]);
        }
    }

    private static void cut(int i) {
        num = i;
        System.out.println("잘라야할 숫자 " + i);
        while (num > 0) {
            System.out.println("자른 숫자 " + num % 10);
            CntCalculation(num % 10);
            num /= 10;
        }
    }

    private static void CntCalculation(int i) {
        intArr[i] = intArr[i] + 1;
    }
}
