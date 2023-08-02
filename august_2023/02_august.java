

// User function Template for Java



class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        if (A[0][0] == 0 || A[X][Y] == 0) {
            return -1;
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int x = curr[0];
                int y = curr[1];

                if (x == X && y == Y) {
                    return steps;
                }

                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nx >= 0 && nx < N && ny >= 0 && ny < M && A[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
            steps++;
        }

        return -1;
    }
}