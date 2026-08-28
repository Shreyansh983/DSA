class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] row = new int[n];
        int[] column = new int[m];
        int ans = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]==1) {
                    row[i]++;
                    column[j]++;
                }
            
            }
        }
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]==1 && (column[j]>1 || row[i]>1)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}