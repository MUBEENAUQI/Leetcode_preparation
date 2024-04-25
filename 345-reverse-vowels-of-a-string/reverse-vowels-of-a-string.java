class Solution {
    public String reverseVowels(String s) {
        LinkedList<Character> vow = new LinkedList<Character>();
        int l = s.length();
        int i = 0;
        char ch;
        String str="";
        while(i<l){
            ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vow.add(ch);
            }
            i++;
        }

        if(vow.size()==0)
        return s;

        i=0;
        while(i<l){
            ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                ch = vow.getLast();
                vow.removeLast();
            }
                str = str+ch;
            i++;
        }
        return str;
    }
}