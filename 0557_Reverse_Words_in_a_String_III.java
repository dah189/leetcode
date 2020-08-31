class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");
        for(String word: words){
            ans.append(new StringBuilder(word).reverse().toString() +" ");
        }        
        return ans.toString().trim();
    }
}
