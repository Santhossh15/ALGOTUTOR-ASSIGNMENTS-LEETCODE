class Solution
 {
     int gcd(int a, int b)
     {
         if(a%b==0)
         {
             return b;
         }
         return gcd(b,a%b);
     }
    public int findGCD(int[] nums)
    {
        int small = nums[0];
        int large = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>large)
            {
                large = nums[i];
            }
            else if(nums[i]<small)
            {
                small = nums[i];
            }
        }
        return gcd(large,small);
        
    }
}