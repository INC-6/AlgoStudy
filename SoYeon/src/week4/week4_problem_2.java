package week4;

import java.util.*;

class Solution {
    public String solution(int n) {
        String answer = "";
        String[] number = {"4","1","2"};
        
        while(n > 0){
          int rest = n % 3;
          n /= 3;
          
          if(rest == 0) n--; 
          
          answer = number[rest]+answer;
      }
      
      return answer;
    }
}
