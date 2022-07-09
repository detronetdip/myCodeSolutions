public class WW {
    public static boolean helper(int start, String h, String n) {
        for (int i = start; i < n.length() && i < h.length(); i++) {
            if (h.charAt(i) != n.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (h.charAt(i) == n.charAt(i) && helper(i, haystack, needle)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(strStr("haystack", "st"));
    }
}
