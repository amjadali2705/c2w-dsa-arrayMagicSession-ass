import java.util.Arrays;

class Plus1 {
    static int[] add1(int[] digits) {
        for (int i=digits.length-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[] {5,9};
        System.out.println(Arrays.toString(add1(digits)));
    }
}