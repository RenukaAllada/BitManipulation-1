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
    //TC:0(n)
//SC:0(1)
    class Solution {
        public int[] singleNumber(int[] nums) {
            if(nums==null || nums.length==0){
                return new int[]{};
            }
            int xor=0;
            for(int num:nums){
                xor=xor ^ num;
            }

            int temp=xor & (-xor);
            int xor2=0;
            for(int num:nums){
                if((temp & num)!=0){
                    xor2=xor2 ^ num;
                }
            }
            return new int[]{xor2,xor ^ xor2};
        }
    }
}