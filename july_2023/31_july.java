class Solution {
    // Function to return Breadth First Traversal of the given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            ans.add(node);

            for (int nbr : adj.get(node)) {
                if (!visited[nbr]) {
                    queue.add(nbr);
                    visited[nbr] = true;
                }
            }
        }

        return ans;
    }
}