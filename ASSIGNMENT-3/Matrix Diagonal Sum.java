class Solution
{
    public int diagonalSum(int[][] mat)
    {
    int res = 0;
    int n = mat.length;
    for (int i = 0; i < n; i++)
    {
        res += mat[i][i]; 
        res += mat[n - 1 - i][i];
    }
    if (n % 2 != 0)
    {
        int centerIndex = n / 2;
        res -= mat[centerIndex][centerIndex];
    }
    return res;
    }
}