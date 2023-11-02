class PrefixString {
    static boolean isPrefixStr(String s, String[] words) {
        String res = "";
        for(int i=0; i<words.length; i++) {
            res += words[i];

            if(res.equals(s))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = new String[] {"i","love","leetcode","apples"};
        System.out.println(isPrefixStr(s, words));
    }
}