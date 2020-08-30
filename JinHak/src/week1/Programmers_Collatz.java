package week1;

public class Programmers_Collatz {
    public int solution(long num) {
        int answer = 0;

        int count=0;
        while(true){
            if(count > 500){
                answer = -1;
                break;
            }
            if(num==1){
                answer = count;
                break;
            }
            if(num%2==0){
                count++;
                num = num/2;
                continue;
            }
            if(num%2==1){
                count++;
                num = (num*3)+1;
                continue;
            }
        }
        return answer;
    }
}
