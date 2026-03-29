class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] s11={s1.charAt(0),s1.charAt(2)};
        char[] s12={s2.charAt(0),s2.charAt(2)};
        char[] s22={s1.charAt(1),s1.charAt(3)};
        char[] s21={s2.charAt(1),s2.charAt(3)};
        Arrays.sort(s11);
        Arrays.sort(s12);
        Arrays.sort(s22);
        Arrays.sort(s21);
        return Arrays.equals(s11,s12) && Arrays.equals(s22,s21);
        
    }
}