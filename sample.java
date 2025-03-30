class sample{
    /***************PROBLEM-1**************/
//TC:0(log(dividend))
        //SC:0(1)
    class Solution {
        public int divide(int dividend, int divisor) {
            if(dividend!=0 && divisor==0){
                return Integer.MAX_VALUE;
            }
            if(dividend==Integer.MIN_VALUE && divisor==-1){
                return Integer.MAX_VALUE;
            }

            long ldivisor=Math.abs((long)divisor);
            long ldividend= Math.abs((long)dividend);
            int result=0;
            while(ldividend>=ldivisor){
                int shifts=0;
                while(ldividend >= (ldivisor<<shifts)){
                    shifts++;
                }
                shifts--;
                result+=(1<<shifts);
                ldividend=ldividend-(ldivisor<<shifts);
            }

            if(dividend>0 && divisor<0){
                return -result;
            }
            if(dividend<0 && divisor>0){
                return -result;
            }
            return result;
        }
    }

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