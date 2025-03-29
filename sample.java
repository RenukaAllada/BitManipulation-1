class sample{
    /***************PROBLEM-1**************/

    /***************PROBLEM-2**************/

    //TC:0(n)
//SC:0(1)
    class Solution {
        public int singleNumber(int[] nums) {
            int xor=nums[0];
            for(int i=1;i<nums.length;i++){
                xor=xor^nums[i];
            }
            return xor;
        }
    }
    
    /***************PROBLEM-3**************/
}