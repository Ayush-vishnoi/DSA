class Solution {
    public char processStr(String s, long k) {
        long len=0;
        for (char c : s.toCharArray()) {
            if (c == '*') {
                len = Math.max(0, len - 1);
            } 
            else if (c == '#') len *= 2;
            else if (c == '%') continue;
            else len++;
        }
        if(k>=len) return '.';
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '*') {
                len++;
            }
            else if (c == '#') {
                len /= 2;
                if (k >= len) {
                    k -= len;
                }
            }
            else if (c == '%') {
                k = len - 1 - k;
            }
            else {
                len--;
                if (k == len) {
                    return c;
                }
            }
        }
    return '.';
}
}