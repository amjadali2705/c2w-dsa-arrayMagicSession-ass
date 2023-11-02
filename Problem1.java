class MinSumSubArray {
    static int getMinSum(int[] arr) {
        int minSum = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {         //O(n^2)
            int sum = 0;
            for(int j=i; j<arr.length; j++) {
                sum += arr[j];

                if(sum < minSum)
                    minSum = sum;
            }
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, -4, 2, -3, -1, 7, -5};
        System.out.println(getMinSum(arr));
    }
}