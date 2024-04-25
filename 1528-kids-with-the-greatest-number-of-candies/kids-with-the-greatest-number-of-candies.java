class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int temp = candies[0];
        int n = candies.length;
        int i=0;
        List<Boolean> booleanList = new ArrayList<>();

        while(i<n){
            if(candies[i]>temp)
            temp = candies[i];
            i++;
        }

        i=0;

        while(i<n){
            if(candies[i]+extraCandies>=temp)
            booleanList.add(true);
            else
            booleanList.add(false);
            i++;
        }

        return booleanList;  
        
    }
}