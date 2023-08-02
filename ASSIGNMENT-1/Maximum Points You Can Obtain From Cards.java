class Solution
{
    public int maxScore(int[] cardPoints, int k)
    {
        int total=0;
        int flaf=0;
        for(int i=0;i<1;i++)
        {
            if(cardPoints[i]>=cardPoints.length-i-1)
            {
                total+=cardPoints[i];
                flag=1;
            }
            else
            {
                total+=cardPoints[cardPoints.length-i-1];
            }
        }
        if(flag==1)
        {
            for(int i=0;i<1;i++)
            {
            if(cardPoints[i]>=cardPoints.length-i-1)
            {
                total+=cardPoints[i];
                flag=1;
            }
            }
        }
        return total;
    }
}