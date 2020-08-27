public class Programmers_FullSearch {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        String str = "";

        for(int i = 0 ; i < array.length; i++){
            str += String.valueOf(array[i]);
        }

        //들어오는 2차원 명령어의 길이 만큼 length 3
        for(int i = 0 ; i < commands.length; i++){

            int one = 0;
            int two = 0;
            int three = 0;
            //cut두번째
            for(int j = 0 ; j < commands[i].length ; j ++){
                if (j == 0 ) one = commands[i][j];        //첫번째
                if (j == 1) {two = commands[i][j]; break;}//두번째
            }

            String[] strArray = str.substring( one-1, two).split(""); //자름

            //정렬은 Collection
            List<String> strList = new ArrayList<>();
            for(String s: strArray){
                strList.add(s);
            }
            //정렬
            Collections.sort(strList);

            //cut 세번째
            for(int j = 0 ; j < commands[i].length; j ++){
                if( j == 2) {
                    three = commands[i][j];
                    break;
                }
            }
            //set 정답배열
            answer[i] = Integer.parseInt(strList.get(three - 1));
        }

        return answer;
    }

}
