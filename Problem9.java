import java.util.Arrays;

class FirstAndLastOccur {
    static int[] getOccurences(int N, int x, int[] arr) {
        int first = -1;
        int last = -1;
        
        for(int i=0; i<N; i++) {
            if(arr[i] == x) {
                first = i;
                break;
            }
        }

        for(int i=N-1; i>=0; i--) {
            if(arr[i] == x) {
                last = i;
                break;
            }
        }
        return new int[] {first, last};
    }

    public static void main(String[] args) {
        int N = 9; 
        int x = 5;
        int[] arr = new int[] {1,3,5,5,5,5,7,123,125};
        System.out.println(Arrays.toString(getOccurences(N, x, arr)));
    }
}