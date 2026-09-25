class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int count = 0;
        int V = isConnected.length;
        boolean[] visited = new boolean[V];

        for(int i=0 ; i<V ;i++){
            if(!visited[i]){
                count++;
                dfs(i,isConnected,visited);
            }
        }
        return count;
    }

    public void dfs(int node,int[][] adj, boolean[] visited){

        visited[node] = true;
        for(int neighbor=0 ; neighbor<adj.length ; neighbor++){

            if(adj[node][neighbor]==1 && !visited[neighbor])
                dfs(neighbor,adj,visited);
        }
    }
}