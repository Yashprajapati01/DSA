class Solution {

    boolean flag = false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if(source == destination)return true;

        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int i =0;i<n;i++)
        {
            map.put(i,new ArrayList());
        }
        for(int []edge : edges)
        {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);

        }

        boolean []vis = new boolean[n];

        dfs(map,vis,source,destination);


        return flag;
    }


    private void dfs(Map<Integer,List<Integer>> map,boolean []vis,int source,int destination)
    {
        if(vis[source]||flag) return;

        vis[source] = true;

        for(int nei : map.get(source))
        {
            if(nei==destination)
            {
                flag = true;
                break;
            }
            if(!vis[nei])
            {
                dfs(map,vis,nei,destination);
            }
        }


    }
}