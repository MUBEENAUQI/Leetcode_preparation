class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] words = s.split(" ");
        int l = words.length;
        int i=0;
        String str=" ";

        while(i<l){
            words[i] = words[i].trim();
            if(words[i].equals(" ") || words[i].equals("")){
                i++;
                continue;
            }
            
            str = words[i]+" "+str;
            i++;
        }

        return str.trim();
        

    }
}