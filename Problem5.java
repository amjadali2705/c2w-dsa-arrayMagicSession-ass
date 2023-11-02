class MissingEl {
    static int getMissEl(int N, int[] arr) {
        int totSum = N*(N+1)/2;
        int curSum = 0;
        for(int i=0; i<arr.length; i++) {
            curSum += arr[i];
        }
        return totSum-curSum;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] arr = new int[] {1,2,3,5};
        System.out.println(getMissEl(N, arr));
    }
}