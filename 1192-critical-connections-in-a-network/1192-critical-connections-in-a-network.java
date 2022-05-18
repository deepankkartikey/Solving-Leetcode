class Solution {
    int time=0;
    List<List<Integer>> res;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<Integer> []adj = new ArrayList[n];
        for(int i=0; i<n; i++)
            adj[i] = new ArrayList<>();
        for(List<Integer> edge: connections){
            int a = edge.get(0);
            int b = edge.get(1);
            adj[a].add(b);
            adj[b].add(a);
        }
        boolean[] visited = new boolean[n];
        int[] timeStamp = new int[n];
        res = new ArrayList<>();
        dfs(adj, visited, timeStamp, 0, -1);
        return res;
    }
    
    void dfs(List<Integer>[] adj, boolean[] visited, int[] timeStamp, int vertex, int prev){
        visited[vertex] = true;
        timeStamp[vertex] = time++;
        int currentTS = timeStamp[vertex];
        
        for(int v: adj[vertex]){
            if(v == prev)
                continue;
            if(!visited[v])
                dfs(adj, visited, timeStamp, v, vertex);
            timeStamp[vertex] = Math.min(timeStamp[vertex], timeStamp[v]);
            if(currentTS < timeStamp[v])
                res.add(Arrays.asList(vertex,v));
        }
    }
}