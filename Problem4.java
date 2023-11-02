class MinLen {
    static int getMinLen(int[] nums, int target) {
        int minLen = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            int sum = 0; 
            int len = 0;
            for(int j=i; j<nums.length; j++) {
                sum += nums[j];

                if(sum >= target) {
                    len = j-i+1;

                    if(len < minLen) {
                        minLen = len;
                        return minLen;
                    }
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[] {2,3,1,2,4,3};
        int target = 7;
        System.out.println(getMinLen(nums, target));
    }
}