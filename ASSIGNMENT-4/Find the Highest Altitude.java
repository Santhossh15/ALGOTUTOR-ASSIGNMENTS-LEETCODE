class Solution
{
    public int largestAltitude(int[] gain)
    {
        int max=0;
        int temp=0;
        for(int i=0;i<gain.length;i++)
        {
            temp+=gain[i];
            if(temp>max)
            {
                max=temp;
            }
        }
        return max;
    }
}