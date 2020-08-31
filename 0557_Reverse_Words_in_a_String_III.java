class Solution {
    public String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        s = s + " ";
        for(int i = 0; i < s.length(); i++){
            word.append(s.charAt(i));
            if(s.charAt(i) == ' '){
                word.reverse();
                ans.append(word);
                word.setLength(0);
            }
        }
        
        ans.deleteCharAt(0);
        return ans.toString();
    }
}
