class Solution {
    public String reverseWords(String s) 
    {
       String word[] = s.trim().split("\\s+");
       String output="";
       for(int i=word.length-1;i>=0;i--)
       {
           output+=word[i]+" ";
       }
       return output.trim();
    }
}