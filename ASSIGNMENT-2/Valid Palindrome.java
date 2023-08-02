class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s=s.replaceAll("[^a-zA-Z0-9]","").trim().toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}