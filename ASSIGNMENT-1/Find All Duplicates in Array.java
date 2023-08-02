class Solution 
{
    public List<Integer> findDuplicates(int[] nums)
    {
        List<Integer> set = new ArrayList<Integer>();
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]-1]++;
            if(arr[nums[i]-1]>2 || arr[nums[i]-1]>1)
            {
                set.add(nums[i]);
            }
        }
        return set;
    }
}