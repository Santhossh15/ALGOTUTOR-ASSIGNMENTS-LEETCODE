class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        LinkedHashMap<Integer,Integer> h = new LinkedHashMap();
        for(int i:arr)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e = h.entrySet())
        {
            System.out.println()
        }
    }
}