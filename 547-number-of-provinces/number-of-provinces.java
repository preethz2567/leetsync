class Solution {
    public int findCircleNum(int[][] isConnected) {
        int provinces = 0;
        int cities = isConnected.length;
        boolean[] visited = new boolean[cities];

        for(int i=0 ;i<visited.length ; i++){

           if(!visited[i]){
            provinces++;
            dfs(i,isConnected,visited);
           }
        }
        return provinces;
    }

    public void dfs(int node, int[][] isConnected, boolean[] visited){

        visited[node] = true;

        for(int j=0 ;j<isConnected.length ; j++){
            if(isConnected[node][j]==1 && !visited[j])
                dfs(j,isConnected,visited);
        }
    }
}