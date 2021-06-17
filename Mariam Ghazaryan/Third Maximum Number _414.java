class Solution {
    public int thirdMax(int[] nums) {
        long max3 = Long.MIN_VALUE;
        long max2 = max3;
        long max1 = max3;
       
        for(int i =0; i < nums.length; i++){

            if(nums[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            
            } else if (nums[i] > max2  && nums[i] < max1){
                max3 = max2;
                max2 = nums[i];
             
            } else if(nums[i] > max3 &&  nums[i] < max2 ){
                max3 = nums[i];
            
                  }
        }
       
            return max3 >= Integer.MIN_VALUE ? (int) max3 : (int) max1;
        
    }
}