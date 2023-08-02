class Solution
{
    public int findDuplicate(int[] nums) 
    {
        int N = nums.length;
        int arr[] = new int[N];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
            if(arr[nums[i]]>1)
            {
                return nums[i];
            }
        }
        return 0;
    }
}