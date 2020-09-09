class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) answer += visit(i, n, computers, visited);
        }
        
        return answer;
    }
    
    public int visit(int i, int n, int[][] computers, boolean[] visited) {
        if(visited[i]) return 0;
        
        visited[i] = true;
        
        for(int j = 0; j < n; j++) {
            if(computers[i][j] == 1) visit(j, n, computers, visited);
        }
        
        return 1;
    }
    
}
