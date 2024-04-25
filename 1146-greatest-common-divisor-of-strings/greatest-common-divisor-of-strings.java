class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str2.length()>str1.length()){
           String temp1 =str2;
           str2 = str1;
           str1 = temp1; 
        }
        int l2 = str2.length();
        int l1 = str1.length();
        int temp=0;
        
        if(!(str1+str2).equals(str2+str1))
        return "";
        if((str1).equals(str2))
        return str1;

           for(int i=1; i<=l2;i++){
            if( l1%i == 0 && l2%i==0 ){
                temp = i;
            }
           }

        return str1.substring(0,temp);
    }
}