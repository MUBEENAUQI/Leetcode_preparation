class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        int index = 0; 
        int i = 0; 
        int flag = 1; 
        if (len == 1) {
            return 1; 
        }
        
        while (i < len) {
            chars[index] = chars[i]; 
            
            
            while (i < len - 1 && chars[i] == chars[i + 1]) {
                flag++; 
                i++; 
            }
            
            
            if (flag > 1) {
                String countStr = String.valueOf(flag); 
                for (char c : countStr.toCharArray()) {
                    chars[++index] = c; 
                }
            }
            
            flag = 1; 
            index++; 
            i++;
        }
        
        return index; 
    
        }
    }
