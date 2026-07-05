class Solution {
    public int dayOfYear(String date) {
        int n=date.length();
        int days=((date.charAt(n-2) - '0')*10)+(date.charAt(n-1) - '0');
        int month=((date.charAt(5) - '0')*10)+(date.charAt(6) - '0');
        int year=((date.charAt(0) - '0')*1000)+((date.charAt(1) - '0')*100)+((date.charAt(2) - '0')*10)+(date.charAt(3) - '0');
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<month-1;i++){
            days+=months[i];
        }
        if (month > 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))  days++;
        return days;
        
    }
}