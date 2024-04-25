class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean flag = false;
        int temp = 0;
        int l = flowerbed.length;
        int i=0;

        if(n==0)
        return true;
        if(l==1 && flowerbed[0]==0 && n==1)
        return true;
        if(l==2 && flowerbed[0]==0 && flowerbed[1]==0 && n==1){
            return true;
        }
        if(l==1 || l==2)
        return false;

        while(i<=l-1){
               
            if(i==0 && l>=2 && flowerbed[0]==0 && flowerbed[1]==0){
               
                temp++;
                flowerbed[0]=1;
                i++;
                continue;
            }
            if( i==l-1 && l>=2 && flowerbed[l-1]==0 && flowerbed[l-2]==0){
               
                temp++;
                flowerbed[l-1]=1;
                i++;
                continue;
            }

            if(!(i-1<0) && i+1!=l){
              
                if(flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i-1]==0){
                    temp++;
                    flowerbed[i]=1;
                }

            }
            i++;

        }  
         if(temp>=n)
            return true;
            else
            return false;
     
    }
}