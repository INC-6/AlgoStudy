class Solution {

    int answer = 0;


    public int solution(int[] numbers, int target) {
        int sum = 0;

        search(numbers, target, sum, 0);

        return answer;
    }

    public void search(int[] numbers, int target, int sum, int idx) {

        if (idx == numbers.length) {
            if (sum == target)
                answer++;
            return;
        } else {
            search(numbers, target, sum + numbers[idx], idx+1);
            search(numbers, target, sum - numbers[idx], idx+1);
        }
    }
}