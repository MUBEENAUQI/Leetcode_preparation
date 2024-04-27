class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        int index = 0; // Index to keep track of the current position in the compressed array
        int i = 0; // Index to iterate through the original array
        int flag = 1; // Counter for consecutive characters
        if (len == 1) {
            return 1; // If there's only one character, no compression needed
        }
        
        while (i < len) {
            chars[index] = chars[i]; // Copy current character to the compressed array
            
            // Check if the next character is the same as the current one
            while (i < len - 1 && chars[i] == chars[i + 1]) {
                flag++; // Increase the count of consecutive characters
                i++; // Move to the next character
            }
            
            // If there are more than one consecutive characters, append the count
            if (flag > 1) {
                String countStr = String.valueOf(flag); // Convert count to string
                for (char c : countStr.toCharArray()) {
                    chars[++index] = c; // Append each digit of the count
                }
            }
            
            flag = 1; // Reset the counter for consecutive characters
            index++; // Move to the next position in the compressed array
            i++; // Move to the next character in the original array
        }
        
        return index; // Return the new length of the compressed array
    
        }
    }
