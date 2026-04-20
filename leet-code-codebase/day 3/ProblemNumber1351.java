class ProblemNumber1351{
    public static int countNegatives(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
	public static void main(String[] args){
	    int[][] grid = {
		    {4,3,2,-1},
			{3,2,1,-1},
			{1,1,-1,-2},
			{-1,-1,-2,-3}
		};
		
		int cnt = countNegatives(grid);
		System.out.println("Negative numbers is: "+ cnt);
	}
}