class Solution 
{
    public int countNegatives(int[][] grid) 
    {
        int size1=grid.length;
        int size2=grid[0].length;
        int count=0;
        for(int i=0;i<size1;i++)
        {
            for(int j=0;j<size2;j++)
            {
                if(grid[i][j]<0)
                {
                    count++;
                }
            }
        }
        return count;

    }
}