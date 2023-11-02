class EquilibriumPoint {
    static int getEquilibriumPoint(int n, int[] A) {                //TC- O(n),   SC- O(n)
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        leftSum[0] = A[0];
        for(int i=1; i<n; i++) {
            leftSum[i] = leftSum[i-1] + A[i];
        }

        rightSum[n-1] = A[n-1];
        for(int i=n-2; i>=0; i--) {
            rightSum[i] = rightSum[i+1] + A[i];
        }

        for(int i=0; i<n; i++) {
            if(leftSum[i] == rightSum[i])
                return i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[] {1,3,5,2,2};
        System.out.println(getEquilibriumPoint(n, arr));
    }
}