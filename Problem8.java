import java.util.ArrayList;

class LeftRotateArray {
    static ArrayList<Integer> leftRotate(int N, int D, int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=D; i<N; i++) {
            res.add(arr[i]);
        }

        for(int i=0; i<D; i++) {
            res.add(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int N = 5;
        int D = 2;
        int[] arr = new int[] {1,2,3,4,5};

        System.out.println(leftRotate(N, D, arr));
    }
}