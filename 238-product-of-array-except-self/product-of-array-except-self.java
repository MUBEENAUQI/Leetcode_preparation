class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] answer = new int[l];
        int[] left = new int[l];
        int[] right = new int[l];

        for(int i=0;i<l;i++){
            if(i==0)
            left[i]=1;
            else
            left[i]=left[i-1]*nums[i-1];
        }

        for(int i=l-1;i>=0;i--){
            if(i==l-1)
            right[i]=1;
            else
            right[i]=right[i+1]*nums[i+1];
        }

        for(int i=0;i<l;i++){
            answer[i] = left[i] * right[i];
        }
        //int left,right,temp=1;



        // int i = 0,j=0;
        // while(i<l){
        //     j=0;
        //     temp=1;
        //     while(j<i){
        //         temp = temp*nums[j];
        //         j++;
        //     }
        //     j=i+1;
        //     while(j>i && j<l){
        //         temp = temp*nums[j];
        //         j++;
        //     }
        //     answer[i]  = temp;
        //     i++;
        // }

        // for(int i=0;i<l;i++){
        //     temp =1;
        //     for(int j=0;j<l;j++){
        //         if(i==j)
        //         continue;
        //         temp = temp*nums[j];
        //     }
        //     answer[i]= temp;
        //}
        return answer;

        
    }
}